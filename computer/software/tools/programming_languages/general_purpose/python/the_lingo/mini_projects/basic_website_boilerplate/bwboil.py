import os

cwd = os.getcwd()

# creating dirs
os.mkdir(".github")
os.mkdir("assets")
os.mkdir("styles")
os.mkdir("scripts")
os.mkdir("images")
os.mkdir("pages")

# creating sub-dirs
os.mkdir(".github/workflows")
os.mkdir("assets/fonts")

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

linters_boiler = '''name: Linters

on: pull_request

env:
  FORCE_COLOR: 1

jobs:
  lighthouse:
    name: Lighthouse
    runs-on: ubuntu-18.04
    steps:
      - uses: actions/checkout@v2
      - uses: actions/setup-node@v1
        with:
          node-version: "12.x"
      - name: Setup Lighthouse
        run: npm install -g @lhci/cli@0.4.x
      - name: Lighthouse Report
        run: lhci autorun --upload.target=temporary-public-storage --collect.staticDistDir=.
  webhint:
    name: Webhint
    runs-on: ubuntu-18.04
    steps:
      - uses: actions/checkout@v2
      - uses: actions/setup-node@v1
        with:
          node-version: "12.x"
      - name: Setup Webhint
        run: |
          npm install --save-dev hint@6.0.x
          [ -f .hintrc ] || wget https://raw.githubusercontent.com/microverseinc/linters-config/master/html-css/.hintrc
      - name: Webhint Report
        run: npx hint --telemetry=off .
  stylelint:
    name: Stylelint
    runs-on: ubuntu-18.04
    steps:
      - uses: actions/checkout@v2
      - uses: actions/setup-node@v1
        with:
          node-version: "12.x"
      - name: Setup Stylelint
        run: |
          npm install --save-dev stylelint@13.3.x stylelint-scss@3.17.x stylelint-config-standard@20.0.x stylelint-csstree-validator
          [ -f .stylelintrc.json ] || wget https://raw.githubusercontent.com/microverseinc/linters-config/master/html-css/.stylelintrc.json
      - name: Stylelint Report
        run: npx stylelint "**/*.{css,scss}"
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

with open('.github/workflows/linters.yml', 'w') as linters:
    layout.write(linters_boiler)


script.close()

print('all files and folders were created successfully.')

