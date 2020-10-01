import os

cwd = os.getcwd()

# creating dirs
os.mkdir("styles")
os.mkdir("scripts")
os.mkdir("images")


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

reset_boiler = ''':root { font: 20px/1.2 "Roboto", sans-serif; } /* or html */

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


# creating files
style = open('styles/style.css', 'w')
script = open('scripts/script.js', 'w')

with open('index.html', 'w') as index:
    index.write(index_boiler)

with open('styles/debug.css', 'w') as debug:
    debug.write(debug_boiler)

with open('styles/reset.css', 'w') as reset:
    reset.write(reset_boiler)


index.close()
style.close()
script.close()

