import os

cwd = os.getcwd()

# creating dirs
os.mkdir("styles")
os.mkdir("scripts")
os.mkdir("images")
os.mkdir("pages")


# adding boiler plate code
index_boiler = '''<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,400i,500,500i,700,700i,900,900i">
    <link rel="stylesheet" href="styles/reset.css">
    <link rel="stylesheet" href="styles/debug.css">

    <title>Document</title>
</head>
<body>
    
</body>
</html>
'''

reset_boiler = '''@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700;800;900&display=swap');
:root { font: 20px/1.2 "Poppins", sans-serif; } /* or html */

body,
body * {
	margin:          unset;
	box-sizing:      unset;
	padding:         unset;
	font-size:       unset;
	color:           unset;
	text-decoration: unset;
}
'''

debug_boiler = '''body * {
	color:                    hsla(210, 100%, 100%, 0.88) !important;
	background:               hsla(210, 100%,  50%, 0.33) !important;
	outline:    0.25rem solid hsla(210, 100%, 100%, 0.50) !important;
}
'''

style_boiler = ''':root {
    --dark:         #2F303A;
    --light-black:  #26262e;

    --accent:       #1762A7;
    --accent-hover: #2180d8;

    --light:        #ffffff;
    --light-hover:  #adadad;

    --blue:         #3856B0;
    --red:          #b038a0;
    --purple:       #3a38b0;
}

* {
    transition: 0.5s cubic-bezier(0.68, -0.55, 0.265, 1.55);
}

a {
    cursor: pointer;
}
'''

layout_boiler = '''* {
    outline: none;
}
'''


# creating files
script = open('scripts/script.js', 'w')

with open('index.html', 'w') as index:
    index.write(index_boiler)

with open('styles/debug.css', 'w') as debug:
    debug.write(debug_boiler)

with open('styles/reset.css', 'w') as reset:
    reset.write(reset_boiler)

with open('styles/style.css', 'w') as style:
    style.write(style_boiler)

with open('styles/layout.css', 'w') as layout:
    layout.write(layout_boiler)


script.close()

print('all files and folders were created successfully.')

