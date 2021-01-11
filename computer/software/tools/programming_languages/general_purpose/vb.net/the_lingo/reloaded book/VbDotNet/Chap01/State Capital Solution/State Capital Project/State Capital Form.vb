Public Class frmState
    Inherits System.Windows.Forms.Form

#Region " Windows Form Designer generated code "

    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub

    'Form overrides dispose to clean up the component list.
    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    Friend WithEvents btnAlabama As System.Windows.Forms.Button
    Friend WithEvents lblAlaska As System.Windows.Forms.Button
    Friend WithEvents btnArizona As System.Windows.Forms.Button
    Friend WithEvents btnArkansas As System.Windows.Forms.Button
    Friend WithEvents btnExit As System.Windows.Forms.Button
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents lblCapital As System.Windows.Forms.Label
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Dim resources As System.Resources.ResourceManager = New System.Resources.ResourceManager(GetType(frmState))
        Me.btnAlabama = New System.Windows.Forms.Button
        Me.lblAlaska = New System.Windows.Forms.Button
        Me.btnArizona = New System.Windows.Forms.Button
        Me.btnArkansas = New System.Windows.Forms.Button
        Me.btnExit = New System.Windows.Forms.Button
        Me.Label1 = New System.Windows.Forms.Label
        Me.lblCapital = New System.Windows.Forms.Label
        Me.SuspendLayout()
        '
        'btnAlabama
        '
        Me.btnAlabama.AccessibleDescription = resources.GetString("btnAlabama.AccessibleDescription")
        Me.btnAlabama.AccessibleName = resources.GetString("btnAlabama.AccessibleName")
        Me.btnAlabama.Anchor = CType(resources.GetObject("btnAlabama.Anchor"), System.Windows.Forms.AnchorStyles)
        Me.btnAlabama.BackgroundImage = CType(resources.GetObject("btnAlabama.BackgroundImage"), System.Drawing.Image)
        Me.btnAlabama.Dock = CType(resources.GetObject("btnAlabama.Dock"), System.Windows.Forms.DockStyle)
        Me.btnAlabama.Enabled = CType(resources.GetObject("btnAlabama.Enabled"), Boolean)
        Me.btnAlabama.FlatStyle = CType(resources.GetObject("btnAlabama.FlatStyle"), System.Windows.Forms.FlatStyle)
        Me.btnAlabama.Font = CType(resources.GetObject("btnAlabama.Font"), System.Drawing.Font)
        Me.btnAlabama.Image = CType(resources.GetObject("btnAlabama.Image"), System.Drawing.Image)
        Me.btnAlabama.ImageAlign = CType(resources.GetObject("btnAlabama.ImageAlign"), System.Drawing.ContentAlignment)
        Me.btnAlabama.ImageIndex = CType(resources.GetObject("btnAlabama.ImageIndex"), Integer)
        Me.btnAlabama.ImeMode = CType(resources.GetObject("btnAlabama.ImeMode"), System.Windows.Forms.ImeMode)
        Me.btnAlabama.Location = CType(resources.GetObject("btnAlabama.Location"), System.Drawing.Point)
        Me.btnAlabama.Name = "btnAlabama"
        Me.btnAlabama.RightToLeft = CType(resources.GetObject("btnAlabama.RightToLeft"), System.Windows.Forms.RightToLeft)
        Me.btnAlabama.Size = CType(resources.GetObject("btnAlabama.Size"), System.Drawing.Size)
        Me.btnAlabama.TabIndex = CType(resources.GetObject("btnAlabama.TabIndex"), Integer)
        Me.btnAlabama.Text = resources.GetString("btnAlabama.Text")
        Me.btnAlabama.TextAlign = CType(resources.GetObject("btnAlabama.TextAlign"), System.Drawing.ContentAlignment)
        Me.btnAlabama.Visible = CType(resources.GetObject("btnAlabama.Visible"), Boolean)
        '
        'lblAlaska
        '
        Me.lblAlaska.AccessibleDescription = resources.GetString("lblAlaska.AccessibleDescription")
        Me.lblAlaska.AccessibleName = resources.GetString("lblAlaska.AccessibleName")
        Me.lblAlaska.Anchor = CType(resources.GetObject("lblAlaska.Anchor"), System.Windows.Forms.AnchorStyles)
        Me.lblAlaska.BackgroundImage = CType(resources.GetObject("lblAlaska.BackgroundImage"), System.Drawing.Image)
        Me.lblAlaska.Dock = CType(resources.GetObject("lblAlaska.Dock"), System.Windows.Forms.DockStyle)
        Me.lblAlaska.Enabled = CType(resources.GetObject("lblAlaska.Enabled"), Boolean)
        Me.lblAlaska.FlatStyle = CType(resources.GetObject("lblAlaska.FlatStyle"), System.Windows.Forms.FlatStyle)
        Me.lblAlaska.Font = CType(resources.GetObject("lblAlaska.Font"), System.Drawing.Font)
        Me.lblAlaska.Image = CType(resources.GetObject("lblAlaska.Image"), System.Drawing.Image)
        Me.lblAlaska.ImageAlign = CType(resources.GetObject("lblAlaska.ImageAlign"), System.Drawing.ContentAlignment)
        Me.lblAlaska.ImageIndex = CType(resources.GetObject("lblAlaska.ImageIndex"), Integer)
        Me.lblAlaska.ImeMode = CType(resources.GetObject("lblAlaska.ImeMode"), System.Windows.Forms.ImeMode)
        Me.lblAlaska.Location = CType(resources.GetObject("lblAlaska.Location"), System.Drawing.Point)
        Me.lblAlaska.Name = "lblAlaska"
        Me.lblAlaska.RightToLeft = CType(resources.GetObject("lblAlaska.RightToLeft"), System.Windows.Forms.RightToLeft)
        Me.lblAlaska.Size = CType(resources.GetObject("lblAlaska.Size"), System.Drawing.Size)
        Me.lblAlaska.TabIndex = CType(resources.GetObject("lblAlaska.TabIndex"), Integer)
        Me.lblAlaska.Text = resources.GetString("lblAlaska.Text")
        Me.lblAlaska.TextAlign = CType(resources.GetObject("lblAlaska.TextAlign"), System.Drawing.ContentAlignment)
        Me.lblAlaska.Visible = CType(resources.GetObject("lblAlaska.Visible"), Boolean)
        '
        'btnArizona
        '
        Me.btnArizona.AccessibleDescription = resources.GetString("btnArizona.AccessibleDescription")
        Me.btnArizona.AccessibleName = resources.GetString("btnArizona.AccessibleName")
        Me.btnArizona.Anchor = CType(resources.GetObject("btnArizona.Anchor"), System.Windows.Forms.AnchorStyles)
        Me.btnArizona.BackgroundImage = CType(resources.GetObject("btnArizona.BackgroundImage"), System.Drawing.Image)
        Me.btnArizona.Dock = CType(resources.GetObject("btnArizona.Dock"), System.Windows.Forms.DockStyle)
        Me.btnArizona.Enabled = CType(resources.GetObject("btnArizona.Enabled"), Boolean)
        Me.btnArizona.FlatStyle = CType(resources.GetObject("btnArizona.FlatStyle"), System.Windows.Forms.FlatStyle)
        Me.btnArizona.Font = CType(resources.GetObject("btnArizona.Font"), System.Drawing.Font)
        Me.btnArizona.Image = CType(resources.GetObject("btnArizona.Image"), System.Drawing.Image)
        Me.btnArizona.ImageAlign = CType(resources.GetObject("btnArizona.ImageAlign"), System.Drawing.ContentAlignment)
        Me.btnArizona.ImageIndex = CType(resources.GetObject("btnArizona.ImageIndex"), Integer)
        Me.btnArizona.ImeMode = CType(resources.GetObject("btnArizona.ImeMode"), System.Windows.Forms.ImeMode)
        Me.btnArizona.Location = CType(resources.GetObject("btnArizona.Location"), System.Drawing.Point)
        Me.btnArizona.Name = "btnArizona"
        Me.btnArizona.RightToLeft = CType(resources.GetObject("btnArizona.RightToLeft"), System.Windows.Forms.RightToLeft)
        Me.btnArizona.Size = CType(resources.GetObject("btnArizona.Size"), System.Drawing.Size)
        Me.btnArizona.TabIndex = CType(resources.GetObject("btnArizona.TabIndex"), Integer)
        Me.btnArizona.Text = resources.GetString("btnArizona.Text")
        Me.btnArizona.TextAlign = CType(resources.GetObject("btnArizona.TextAlign"), System.Drawing.ContentAlignment)
        Me.btnArizona.Visible = CType(resources.GetObject("btnArizona.Visible"), Boolean)
        '
        'btnArkansas
        '
        Me.btnArkansas.AccessibleDescription = resources.GetString("btnArkansas.AccessibleDescription")
        Me.btnArkansas.AccessibleName = resources.GetString("btnArkansas.AccessibleName")
        Me.btnArkansas.Anchor = CType(resources.GetObject("btnArkansas.Anchor"), System.Windows.Forms.AnchorStyles)
        Me.btnArkansas.BackgroundImage = CType(resources.GetObject("btnArkansas.BackgroundImage"), System.Drawing.Image)
        Me.btnArkansas.Dock = CType(resources.GetObject("btnArkansas.Dock"), System.Windows.Forms.DockStyle)
        Me.btnArkansas.Enabled = CType(resources.GetObject("btnArkansas.Enabled"), Boolean)
        Me.btnArkansas.FlatStyle = CType(resources.GetObject("btnArkansas.FlatStyle"), System.Windows.Forms.FlatStyle)
        Me.btnArkansas.Font = CType(resources.GetObject("btnArkansas.Font"), System.Drawing.Font)
        Me.btnArkansas.Image = CType(resources.GetObject("btnArkansas.Image"), System.Drawing.Image)
        Me.btnArkansas.ImageAlign = CType(resources.GetObject("btnArkansas.ImageAlign"), System.Drawing.ContentAlignment)
        Me.btnArkansas.ImageIndex = CType(resources.GetObject("btnArkansas.ImageIndex"), Integer)
        Me.btnArkansas.ImeMode = CType(resources.GetObject("btnArkansas.ImeMode"), System.Windows.Forms.ImeMode)
        Me.btnArkansas.Location = CType(resources.GetObject("btnArkansas.Location"), System.Drawing.Point)
        Me.btnArkansas.Name = "btnArkansas"
        Me.btnArkansas.RightToLeft = CType(resources.GetObject("btnArkansas.RightToLeft"), System.Windows.Forms.RightToLeft)
        Me.btnArkansas.Size = CType(resources.GetObject("btnArkansas.Size"), System.Drawing.Size)
        Me.btnArkansas.TabIndex = CType(resources.GetObject("btnArkansas.TabIndex"), Integer)
        Me.btnArkansas.Text = resources.GetString("btnArkansas.Text")
        Me.btnArkansas.TextAlign = CType(resources.GetObject("btnArkansas.TextAlign"), System.Drawing.ContentAlignment)
        Me.btnArkansas.Visible = CType(resources.GetObject("btnArkansas.Visible"), Boolean)
        '
        'btnExit
        '
        Me.btnExit.AccessibleDescription = resources.GetString("btnExit.AccessibleDescription")
        Me.btnExit.AccessibleName = resources.GetString("btnExit.AccessibleName")
        Me.btnExit.Anchor = CType(resources.GetObject("btnExit.Anchor"), System.Windows.Forms.AnchorStyles)
        Me.btnExit.BackgroundImage = CType(resources.GetObject("btnExit.BackgroundImage"), System.Drawing.Image)
        Me.btnExit.Dock = CType(resources.GetObject("btnExit.Dock"), System.Windows.Forms.DockStyle)
        Me.btnExit.Enabled = CType(resources.GetObject("btnExit.Enabled"), Boolean)
        Me.btnExit.FlatStyle = CType(resources.GetObject("btnExit.FlatStyle"), System.Windows.Forms.FlatStyle)
        Me.btnExit.Font = CType(resources.GetObject("btnExit.Font"), System.Drawing.Font)
        Me.btnExit.Image = CType(resources.GetObject("btnExit.Image"), System.Drawing.Image)
        Me.btnExit.ImageAlign = CType(resources.GetObject("btnExit.ImageAlign"), System.Drawing.ContentAlignment)
        Me.btnExit.ImageIndex = CType(resources.GetObject("btnExit.ImageIndex"), Integer)
        Me.btnExit.ImeMode = CType(resources.GetObject("btnExit.ImeMode"), System.Windows.Forms.ImeMode)
        Me.btnExit.Location = CType(resources.GetObject("btnExit.Location"), System.Drawing.Point)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.RightToLeft = CType(resources.GetObject("btnExit.RightToLeft"), System.Windows.Forms.RightToLeft)
        Me.btnExit.Size = CType(resources.GetObject("btnExit.Size"), System.Drawing.Size)
        Me.btnExit.TabIndex = CType(resources.GetObject("btnExit.TabIndex"), Integer)
        Me.btnExit.Text = resources.GetString("btnExit.Text")
        Me.btnExit.TextAlign = CType(resources.GetObject("btnExit.TextAlign"), System.Drawing.ContentAlignment)
        Me.btnExit.Visible = CType(resources.GetObject("btnExit.Visible"), Boolean)
        '
        'Label1
        '
        Me.Label1.AccessibleDescription = resources.GetString("Label1.AccessibleDescription")
        Me.Label1.AccessibleName = resources.GetString("Label1.AccessibleName")
        Me.Label1.Anchor = CType(resources.GetObject("Label1.Anchor"), System.Windows.Forms.AnchorStyles)
        Me.Label1.AutoSize = CType(resources.GetObject("Label1.AutoSize"), Boolean)
        Me.Label1.Dock = CType(resources.GetObject("Label1.Dock"), System.Windows.Forms.DockStyle)
        Me.Label1.Enabled = CType(resources.GetObject("Label1.Enabled"), Boolean)
        Me.Label1.Font = CType(resources.GetObject("Label1.Font"), System.Drawing.Font)
        Me.Label1.Image = CType(resources.GetObject("Label1.Image"), System.Drawing.Image)
        Me.Label1.ImageAlign = CType(resources.GetObject("Label1.ImageAlign"), System.Drawing.ContentAlignment)
        Me.Label1.ImageIndex = CType(resources.GetObject("Label1.ImageIndex"), Integer)
        Me.Label1.ImeMode = CType(resources.GetObject("Label1.ImeMode"), System.Windows.Forms.ImeMode)
        Me.Label1.Location = CType(resources.GetObject("Label1.Location"), System.Drawing.Point)
        Me.Label1.Name = "Label1"
        Me.Label1.RightToLeft = CType(resources.GetObject("Label1.RightToLeft"), System.Windows.Forms.RightToLeft)
        Me.Label1.Size = CType(resources.GetObject("Label1.Size"), System.Drawing.Size)
        Me.Label1.TabIndex = CType(resources.GetObject("Label1.TabIndex"), Integer)
        Me.Label1.Text = resources.GetString("Label1.Text")
        Me.Label1.TextAlign = CType(resources.GetObject("Label1.TextAlign"), System.Drawing.ContentAlignment)
        Me.Label1.Visible = CType(resources.GetObject("Label1.Visible"), Boolean)
        '
        'lblCapital
        '
        Me.lblCapital.AccessibleDescription = resources.GetString("lblCapital.AccessibleDescription")
        Me.lblCapital.AccessibleName = resources.GetString("lblCapital.AccessibleName")
        Me.lblCapital.Anchor = CType(resources.GetObject("lblCapital.Anchor"), System.Windows.Forms.AnchorStyles)
        Me.lblCapital.AutoSize = CType(resources.GetObject("lblCapital.AutoSize"), Boolean)
        Me.lblCapital.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.lblCapital.Dock = CType(resources.GetObject("lblCapital.Dock"), System.Windows.Forms.DockStyle)
        Me.lblCapital.Enabled = CType(resources.GetObject("lblCapital.Enabled"), Boolean)
        Me.lblCapital.Font = CType(resources.GetObject("lblCapital.Font"), System.Drawing.Font)
        Me.lblCapital.Image = CType(resources.GetObject("lblCapital.Image"), System.Drawing.Image)
        Me.lblCapital.ImageAlign = CType(resources.GetObject("lblCapital.ImageAlign"), System.Drawing.ContentAlignment)
        Me.lblCapital.ImageIndex = CType(resources.GetObject("lblCapital.ImageIndex"), Integer)
        Me.lblCapital.ImeMode = CType(resources.GetObject("lblCapital.ImeMode"), System.Windows.Forms.ImeMode)
        Me.lblCapital.Location = CType(resources.GetObject("lblCapital.Location"), System.Drawing.Point)
        Me.lblCapital.Name = "lblCapital"
        Me.lblCapital.RightToLeft = CType(resources.GetObject("lblCapital.RightToLeft"), System.Windows.Forms.RightToLeft)
        Me.lblCapital.Size = CType(resources.GetObject("lblCapital.Size"), System.Drawing.Size)
        Me.lblCapital.TabIndex = CType(resources.GetObject("lblCapital.TabIndex"), Integer)
        Me.lblCapital.Text = resources.GetString("lblCapital.Text")
        Me.lblCapital.TextAlign = CType(resources.GetObject("lblCapital.TextAlign"), System.Drawing.ContentAlignment)
        Me.lblCapital.Visible = CType(resources.GetObject("lblCapital.Visible"), Boolean)
        '
        'frmState
        '
        Me.AccessibleDescription = resources.GetString("$this.AccessibleDescription")
        Me.AccessibleName = resources.GetString("$this.AccessibleName")
        Me.AutoScaleBaseSize = CType(resources.GetObject("$this.AutoScaleBaseSize"), System.Drawing.Size)
        Me.AutoScroll = CType(resources.GetObject("$this.AutoScroll"), Boolean)
        Me.AutoScrollMargin = CType(resources.GetObject("$this.AutoScrollMargin"), System.Drawing.Size)
        Me.AutoScrollMinSize = CType(resources.GetObject("$this.AutoScrollMinSize"), System.Drawing.Size)
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.ClientSize = CType(resources.GetObject("$this.ClientSize"), System.Drawing.Size)
        Me.Controls.Add(Me.lblCapital)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnArkansas)
        Me.Controls.Add(Me.btnArizona)
        Me.Controls.Add(Me.lblAlaska)
        Me.Controls.Add(Me.btnAlabama)
        Me.Enabled = CType(resources.GetObject("$this.Enabled"), Boolean)
        Me.Font = CType(resources.GetObject("$this.Font"), System.Drawing.Font)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.ImeMode = CType(resources.GetObject("$this.ImeMode"), System.Windows.Forms.ImeMode)
        Me.Location = CType(resources.GetObject("$this.Location"), System.Drawing.Point)
        Me.MaximumSize = CType(resources.GetObject("$this.MaximumSize"), System.Drawing.Size)
        Me.MinimumSize = CType(resources.GetObject("$this.MinimumSize"), System.Drawing.Size)
        Me.Name = "frmState"
        Me.RightToLeft = CType(resources.GetObject("$this.RightToLeft"), System.Windows.Forms.RightToLeft)
        Me.StartPosition = CType(resources.GetObject("$this.StartPosition"), System.Windows.Forms.FormStartPosition)
        Me.Text = resources.GetString("$this.Text")
        Me.ResumeLayout(False)

    End Sub

#End Region

    Private Sub btnExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub btnAlabama_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnAlabama.Click
        Me.lblCapital.Text = "Montgomery"
    End Sub

    Private Sub lblAlaska_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles lblAlaska.Click
        Me.lblCapital.Text = "Juneau"
    End Sub

    Private Sub btnArizona_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnArizona.Click
        Me.lblCapital.Text = "Phoenix"
    End Sub

    Private Sub btnArkansas_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnArkansas.Click
        Me.lblCapital.Text = "Little Rock"
    End Sub
End Class
