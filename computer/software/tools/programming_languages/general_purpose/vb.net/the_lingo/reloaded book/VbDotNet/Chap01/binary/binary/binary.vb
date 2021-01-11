Public Class frmBin
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
    Friend WithEvents picA As System.Windows.Forms.PictureBox
    Friend WithEvents btnA As System.Windows.Forms.Button
    Friend WithEvents btnB As System.Windows.Forms.Button
    Friend WithEvents picB As System.Windows.Forms.PictureBox
    Friend WithEvents btnC As System.Windows.Forms.Button
    Friend WithEvents picC As System.Windows.Forms.PictureBox
    Friend WithEvents btnD As System.Windows.Forms.Button
    Friend WithEvents picD As System.Windows.Forms.PictureBox
    Friend WithEvents lblNum As System.Windows.Forms.Label
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Dim resources As System.Resources.ResourceManager = New System.Resources.ResourceManager(GetType(frmBin))
        Me.picA = New System.Windows.Forms.PictureBox
        Me.btnA = New System.Windows.Forms.Button
        Me.btnB = New System.Windows.Forms.Button
        Me.picB = New System.Windows.Forms.PictureBox
        Me.btnC = New System.Windows.Forms.Button
        Me.picC = New System.Windows.Forms.PictureBox
        Me.btnD = New System.Windows.Forms.Button
        Me.picD = New System.Windows.Forms.PictureBox
        Me.lblNum = New System.Windows.Forms.Label
        Me.SuspendLayout()
        '
        'picA
        '
        Me.picA.BackColor = System.Drawing.Color.Transparent
        Me.picA.Image = CType(resources.GetObject("picA.Image"), System.Drawing.Image)
        Me.picA.Location = New System.Drawing.Point(75, 41)
        Me.picA.Name = "picA"
        Me.picA.Size = New System.Drawing.Size(120, 112)
        Me.picA.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picA.TabIndex = 3
        Me.picA.TabStop = False
        '
        'btnA
        '
        Me.btnA.BackColor = System.Drawing.Color.LightCoral
        Me.btnA.Font = New System.Drawing.Font("Tahoma", 21.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnA.Location = New System.Drawing.Point(75, 161)
        Me.btnA.Name = "btnA"
        Me.btnA.Size = New System.Drawing.Size(120, 56)
        Me.btnA.TabIndex = 4
        Me.btnA.Text = "OFF"
        '
        'btnB
        '
        Me.btnB.BackColor = System.Drawing.Color.LightCoral
        Me.btnB.Font = New System.Drawing.Font("Tahoma", 21.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnB.Location = New System.Drawing.Point(234, 161)
        Me.btnB.Name = "btnB"
        Me.btnB.Size = New System.Drawing.Size(120, 56)
        Me.btnB.TabIndex = 6
        Me.btnB.Text = "OFF"
        '
        'picB
        '
        Me.picB.BackColor = System.Drawing.Color.Transparent
        Me.picB.Image = CType(resources.GetObject("picB.Image"), System.Drawing.Image)
        Me.picB.Location = New System.Drawing.Point(234, 41)
        Me.picB.Name = "picB"
        Me.picB.Size = New System.Drawing.Size(120, 112)
        Me.picB.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picB.TabIndex = 5
        Me.picB.TabStop = False
        '
        'btnC
        '
        Me.btnC.BackColor = System.Drawing.Color.LightCoral
        Me.btnC.Font = New System.Drawing.Font("Tahoma", 21.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnC.Location = New System.Drawing.Point(393, 161)
        Me.btnC.Name = "btnC"
        Me.btnC.Size = New System.Drawing.Size(120, 56)
        Me.btnC.TabIndex = 8
        Me.btnC.Text = "OFF"
        '
        'picC
        '
        Me.picC.BackColor = System.Drawing.Color.Transparent
        Me.picC.Image = CType(resources.GetObject("picC.Image"), System.Drawing.Image)
        Me.picC.Location = New System.Drawing.Point(393, 41)
        Me.picC.Name = "picC"
        Me.picC.Size = New System.Drawing.Size(120, 112)
        Me.picC.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picC.TabIndex = 7
        Me.picC.TabStop = False
        '
        'btnD
        '
        Me.btnD.BackColor = System.Drawing.Color.LightCoral
        Me.btnD.Font = New System.Drawing.Font("Tahoma", 21.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnD.Location = New System.Drawing.Point(552, 161)
        Me.btnD.Name = "btnD"
        Me.btnD.Size = New System.Drawing.Size(120, 56)
        Me.btnD.TabIndex = 10
        Me.btnD.Text = "OFF"
        '
        'picD
        '
        Me.picD.BackColor = System.Drawing.Color.Transparent
        Me.picD.Image = CType(resources.GetObject("picD.Image"), System.Drawing.Image)
        Me.picD.Location = New System.Drawing.Point(552, 41)
        Me.picD.Name = "picD"
        Me.picD.Size = New System.Drawing.Size(120, 112)
        Me.picD.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picD.TabIndex = 9
        Me.picD.TabStop = False
        '
        'lblNum
        '
        Me.lblNum.BackColor = System.Drawing.SystemColors.HighlightText
        Me.lblNum.Font = New System.Drawing.Font("Franklin Gothic Medium", 48.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblNum.Location = New System.Drawing.Point(77, 249)
        Me.lblNum.Name = "lblNum"
        Me.lblNum.Size = New System.Drawing.Size(592, 80)
        Me.lblNum.TabIndex = 11
        Me.lblNum.Text = "0"
        Me.lblNum.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'frmBin
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 14)
        Me.BackColor = System.Drawing.Color.DarkOrchid
        Me.ClientSize = New System.Drawing.Size(746, 364)
        Me.Controls.Add(Me.lblNum)
        Me.Controls.Add(Me.btnD)
        Me.Controls.Add(Me.picD)
        Me.Controls.Add(Me.btnC)
        Me.Controls.Add(Me.picC)
        Me.Controls.Add(Me.btnB)
        Me.Controls.Add(Me.picB)
        Me.Controls.Add(Me.btnA)
        Me.Controls.Add(Me.picA)
        Me.Font = New System.Drawing.Font("Tahoma", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.KeyPreview = True
        Me.MaximizeBox = False
        Me.Name = "frmBin"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Binary Counter"
        Me.ResumeLayout(False)

    End Sub

#End Region

    Dim a As Short = 0
    Dim b As Short = 0
    Dim c As Short = 0
    Dim d As Short = 0

    Private Sub btnD_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnD.Click
        If Me.btnD.Text = "OFF" Then
            Me.btnD.Text = "ON"
            Me.btnD.BackColor = Color.LightGreen
            Me.picD.Image = Image.FromFile("images/bon.ico")
            d = 1
        Else
            Me.btnD.Text = "OFF"
            Me.btnD.BackColor = Color.LightCoral
            Me.picD.Image = Image.FromFile("images/boff.ico")
            d = 0
        End If
        calc()
    End Sub

    Private Sub btnC_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnC.Click
        If Me.btnC.Text = "OFF" Then
            Me.btnC.Text = "ON"
            Me.btnC.BackColor = Color.LightGreen
            Me.picC.Image = Image.FromFile("images/bon.ico")
            c = 1
        Else
            Me.btnC.Text = "OFF"
            Me.btnC.BackColor = Color.LightCoral
            Me.picC.Image = Image.FromFile("images/boff.ico")
            c = 0
        End If
        calc()
    End Sub

    Private Sub btnB_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnB.Click
        If Me.btnB.Text = "OFF" Then
            Me.btnB.Text = "ON"
            Me.btnB.BackColor = Color.LightGreen
            Me.picB.Image = Image.FromFile("images/bon.ico")
            b = 1
        Else
            Me.btnB.Text = "OFF"
            Me.btnB.BackColor = Color.LightCoral
            Me.picB.Image = Image.FromFile("images/boff.ico")
            b = 0
        End If
        calc()
    End Sub

    Private Sub btnA_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnA.Click
        If Me.btnA.Text = "OFF" Then
            Me.btnA.Text = "ON"
            Me.btnA.BackColor = Color.LightGreen
            Me.picA.Image = Image.FromFile("images/bon.ico")
            a = 1
        Else
            Me.btnA.Text = "OFF"
            Me.btnA.BackColor = Color.LightCoral
            Me.picA.Image = Image.FromFile("images/boff.ico")
            a = 0
        End If
        calc()
    End Sub

    Private Sub calc()
        If a = 0 And b = 0 And c = 0 And d = 0 Then
            Me.lblNum.Text = 0
        ElseIf a = 0 And b = 0 And c = 0 And d = 1 Then
            Me.lblNum.Text = 1
        ElseIf a = 0 And b = 0 And c = 1 And d = 0 Then
            Me.lblNum.Text = 2
        ElseIf a = 0 And b = 0 And c = 1 And d = 1 Then
            Me.lblNum.Text = 3
        ElseIf a = 0 And b = 1 And c = 0 And d = 0 Then
            Me.lblNum.Text = 4
        ElseIf a = 0 And b = 1 And c = 0 And d = 1 Then
            Me.lblNum.Text = 5
        ElseIf a = 0 And b = 1 And c = 1 And d = 0 Then
            Me.lblNum.Text = 6
        ElseIf a = 0 And b = 1 And c = 1 And d = 1 Then
            Me.lblNum.Text = 7
        ElseIf a = 1 And b = 0 And c = 0 And d = 0 Then
            Me.lblNum.Text = 8
        ElseIf a = 1 And b = 0 And c = 0 And d = 1 Then
            Me.lblNum.Text = 9
        ElseIf a = 1 And b = 0 And c = 1 And d = 0 Then
            Me.lblNum.Text = 10
        ElseIf a = 1 And b = 0 And c = 1 And d = 1 Then
            Me.lblNum.Text = 11
        ElseIf a = 1 And b = 1 And c = 0 And d = 0 Then
            Me.lblNum.Text = 12
        ElseIf a = 1 And b = 1 And c = 0 And d = 1 Then
            Me.lblNum.Text = 13
        ElseIf a = 1 And b = 1 And c = 1 And d = 0 Then
            Me.lblNum.Text = 14
        ElseIf a = 1 And b = 1 And c = 1 And d = 1 Then
            Me.lblNum.Text = 15
        End If
    End Sub
End Class
