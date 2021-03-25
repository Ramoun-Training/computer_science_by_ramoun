import  os
import  sys
import  wx
import  wx.html as html
import  wx.lib.wxpTag

#----------------------------------------------------------------------

# This shows how to catch the OnLinkClicked non-event.  (It's a virtual
# method in the C++ code...)
class MyHtmlWindow(html.HtmlWindow):
    def __init__(self, parent, id):
        html.HtmlWindow.__init__(self, parent, id, style=wx.NO_FULL_REPAINT_ON_RESIZE)
        if "gtk2" in wx.PlatformInfo:
            self.SetStandardFonts()

    def OnLinkClicked(self, linkinfo):
        print('OnLinkClicked: %s\n' % linkinfo.GetHref())
        super(MyHtmlWindow, self).OnLinkClicked(linkinfo)

    def OnSetTitle(self, title):
        print('OnSetTitle: %s\n' % title)
        super(MyHtmlWindow, self).OnSetTitle(title)

    def OnCellMouseHover(self, cell, x, y):
        print('OnCellMouseHover: %s, (%d %d)\n' % (cell, x, y))
        super(MyHtmlWindow, self).OnCellMouseHover(cell, x, y)

    def OnCellClicked(self, cell, x, y, evt):
        print('OnCellClicked: %s, (%d %d)\n' % (cell, x, y))
        if isinstance(cell, html.HtmlWordCell):
            sel = html.HtmlSelection()
            print('     %s\n' % cell.ConvertToText(sel))
        super(MyHtmlWindow, self).OnCellClicked(cell, x, y, evt)

    def SelectionToText(self):
        print "selection:"#, cell.SelectionToText(), ":"
        super(MyHtmlWindow, self).SelectionToText()

# This filter doesn't really do anything but show how to use filters
class MyHtmlFilter(html.HtmlFilter):
    def __init__(self, log):
        html.HtmlFilter.__init__(self)

    # This method decides if this filter is able to read the file
    def CanRead(self, fsfile):
        print("CanRead: %s\n" % fsfile.GetMimeType())
        return False

    # If CanRead returns True then this method is called to actually
    # read the file and return the contents.
    def ReadFile(self, fsfile):
        return ""


class TestHtmlPanel(wx.Panel):
    def __init__(self, parent, id):
        wx.Panel.__init__(self, parent, id, style=wx.NO_FULL_REPAINT_ON_RESIZE)
        self.frame = parent
        self.cwd = os.path.split(sys.argv[0])[0]
        if not self.cwd:
            self.cwd = os.getcwd()
        if parent:
            self.titleBase = parent.GetTitle()
        #html.HtmlWindow_AddFilter(MyHtmlFilter(log))
        self.html = MyHtmlWindow(self, -1)
        self.html.SetRelatedFrame(parent, self.titleBase + " -- %s")
        self.html.SetRelatedStatusBar(0)
        self.printer = html.HtmlEasyPrinting()
        self.box = wx.BoxSizer(wx.VERTICAL)
        self.box.Add(self.html, 1, wx.GROW)
        subbox = wx.BoxSizer(wx.HORIZONTAL)
        btn = wx.Button(self, -1, "Load File")
        self.Bind(wx.EVT_BUTTON, self.OnLoadFile, btn)
        subbox.Add(btn, 1, wx.GROW | wx.ALL, 2)
        btn = wx.Button(self, -1, "Load URL")
        self.Bind(wx.EVT_BUTTON, self.OnLoadURL, btn)
        subbox.Add(btn, 1, wx.GROW | wx.ALL, 2)
        btn = wx.Button(self, -1, "With Widgets")
        self.Bind(wx.EVT_BUTTON, self.OnWithWidgets, btn)
        subbox.Add(btn, 1, wx.GROW | wx.ALL, 2)
        btn = wx.Button(self, -1, "Back")
        self.Bind(wx.EVT_BUTTON, self.OnBack, btn)
        subbox.Add(btn, 1, wx.GROW | wx.ALL, 2)
        btn = wx.Button(self, -1, "Forward")
        self.Bind(wx.EVT_BUTTON, self.OnForward, btn)
        subbox.Add(btn, 1, wx.GROW | wx.ALL, 2)
        btn = wx.Button(self, -1, "Print")
        self.Bind(wx.EVT_BUTTON, self.OnPrint, btn)
        subbox.Add(btn, 1, wx.GROW | wx.ALL, 2)
        btn = wx.Button(self, -1, "View Source")
        self.Bind(wx.EVT_BUTTON, self.OnViewSource, btn)
        subbox.Add(btn, 1, wx.GROW | wx.ALL, 2)
        self.box.Add(subbox, 0, wx.GROW)
        self.SetSizer(self.box)
        self.SetAutoLayout(True)
        # A button with this ID is created on the widget test page.
        self.Bind(wx.EVT_BUTTON, self.OnOk, id=wx.ID_OK)
        self.OnShowDefault(None)

    def ShutdownDemo(self):
        # put the frame title back
        if self.frame:
            self.frame.SetTitle(self.titleBase)

    def OnShowDefault(self, event):
        name = os.path.join(self.cwd, 'data/test.htm')
        self.html.LoadPage(name)

    def OnLoadFile(self, event):
        dlg = wx.FileDialog(self, style=wx.OPEN,
                            wildcard='HTML Files|*.htm;*.html', )
        if dlg.ShowModal():
            path = dlg.GetPath()
            self.html.LoadPage(path)
        dlg.Destroy()

    def OnLoadURL(self, event):
        dlg = wx.TextEntryDialog(self, "Enter a URL")
        if dlg.ShowModal():
            url = dlg.GetValue()
            self.html.LoadPage(url)
        dlg.Destroy()

    def OnWithWidgets(self, event):
        os.chdir(self.cwd)
        name = os.path.join(self.cwd, 'data/widgetTest.htm')
        self.html.LoadPage(name)

    def OnOk(self, event):
        print("It works!\n")

    def OnBack(self, event):
        if not self.html.HistoryBack():
            wx.MessageBox("No more items in history!")

    def OnForward(self, event):
        if not self.html.HistoryForward():
            wx.MessageBox("No more items in history!")

    def OnViewSource(self, event):
        import  wx.lib.dialogs
        source = self.html.GetParser().GetSource()
        dlg = wx.lib.dialogs.ScrolledMessageDialog(self, source, 'HTML Source')
        dlg.ShowModal()
        dlg.Destroy()

    def OnPrint(self, event):
        self.printer.GetPrintData().SetPaperId(wx.PAPER_LETTER)
        self.printer.PrintFile(self.html.GetOpenedPage())

overview = """<html><body>
<h2>wx.HtmlWindow</h2>

<p>wx.HtmlWindow is capable of parsing and rendering most
simple HTML tags.

<p>It is not intended to be a high-end HTML browser.  If you're
looking for something like that see the IEHtmlWin class, which
wraps the core MSIE HTML viewer.

</body></html>
"""

app = wx.PySimpleApp()
# create a window/frame, no parent, -1 is default ID
# increase the size of the frame for larger images
frame1 = wx.Frame(None, -1, "A simple web browser", size = (800, 600))
frame1.CreateStatusBar()
# call the derived class
TestHtmlPanel(frame1, -1)
frame1.Show(1)
app.MainLoop()