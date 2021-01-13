# Intro to HTML and CSS

A [udacity course](https://classroom.udacity.com/courses/ud001) & also part of multiple nanodegrees.


## Lesson 1: HTML Syntax


### 2. HTML Structure Part 1

- Basic HTML Element Syntax
    ```html
    <openningtag>content</closingtag>
    ```

    > **Note**:
    > ```html
    > <p>This is a paragraph.</p>
    > ```
    > the "This is a paragraph." text is a child of the `<p>` element.
    > ![paragraph_content](https://imgur.com/fES03qk.png)


### 4. Environments

- Difference between code editors and text processing programs

    + word prcessor (e.g: _ms word_):
        shows "**rich text**" (text formated with fonts and styles and colors ...etc).
    
    + code editor (e.g: _ms vscode_):
        shows "plain text" (just ASCII characters).

- IDEs' : Integrated Development Environments

    + they are like text editros on steroids (aka: adding more features like: compile, run code, debugging ...etc).

    > **Note**: IDE's are not used for web dev because web developers depend on browsers.

### 5. Editors

- you can use: <u>**`vscode`**</u>, **`atom`**, [**`Emacs`**](https://www.gnu.org/software/emacs/), [<u>**`Vim`**</u>](https://www.vim.org/index.php).

    > **Tip**: learn vim now with this [link](https://www.openvim.com/).

    > **Note**: you can read more on Editor wars on [wikipedia](https://en.wikipedia.org/wiki/Editor_war).


### 8. Trees

- 
    ![Tree Structure in html](https://imgur.com/FLdHvTA.png)


### 10. Spot the bug

-
    > **Tip**:  Syntax color is a clue that things are or aren't properly formatted!.


### 11. HTML Research

-
    > **Tip**: use [MDN HTML Refrence](https://developer.mozilla.org/en-US/docs/Web/HTML/Element) whenever you write html code.

    > **Note**: check out the difference between `<em>` and `<i>` [here](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/em).


### 12. HTML Structure Part 2

- 
    > **Tip**: If you create an HTML file with only this line (`<h1>This is a heading</h1>
`), open the file in any modern browser, and inspect the page with developer tools, you’ll see that certain parts of the basic HTML document format were **assumed**.That being said, _**this is not guaranteed behavior**_. Older browsers can be unpredictable, and you won’t know what browser your visitors will decide to use. It’s good practice to include all the basic parts of the template so that you aren’t relying on the guesswork of browsers to display your sites correctly.


### 13. HTML Documents in depth

- **HTML Doctypes**:

    An HTML document will usually start with a type declaration (which is not a tag, so it should not have a closing tag). The declaration helps the browser determine what type of HTML document it’s trying to parse and display.

- **Older websites doctype declaration**:

    ```html
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
    ```
    (Triggers Standards mode but specifies an older form of validation.)

- **no doctype at all**

    ```html
    <html>
        … 
    </html>
    ```
    (Triggers “Quirks” mode. This is bad.)

-  **newer websites (and your websites!) will have a declaration that looks like this**

    ```html
    <!DOCTYPE html>
    ```
    (Triggers Standards mode with all updated features.) 

    > **Note**: Browsers look for this doctype declaration **_to determine which rendering mode to use to render the site_**. Generally, newer sites follow standard HTML specifications. The current standard HTML specification is called HTML5 (which is what you're learning!). On the other hand, older sites, created before HTML standards really existed, might use a different rendering mode that imitates the behavior of older browsers.

    > **Note**: If you are interested in reading more about doctype declarations and different rendering modes, you can read about them [here](https://developer.mozilla.org/en-US/docs/Web/HTML/Quirks_Mode_and_Standards_Mode).

- `<html></html>`

    Once you’ve declared the doctype, the next part of your HTML document is the <html> tag, which tells the browser that everything enclosed inside the `<html>...</html>` should be parsed as HTML.

- `<head>` and `<body>`

    + ![html structure tree](https://video.udacity-data.com/topher/2016/July/578ea3b9_full-html-tree/full-html-tree.png)

    + The `<body>` is always visible.

    + The `<head>`, on the other hand, is never visible, but the information in it describes the page and links to other files the browser needs to render the website correctly. For instance, the `<head>` is responsible for:

        1. the document’s title (the text that shows up in browser tabs): `<title>About Me</title>`.

        2. associated CSS files (for style): `<link rel="stylesheet" type="text/css" href="style.css">`.

        3. associated JavaScript files (multipurpose scripts to change rendering and behavior): `<script src="animations.js"></script>`.

        4. the charset being used (the text's encoding): `<meta charset="utf-8">`.

        5. keywords, authors, and descriptions (often useful for SEO): `<meta name="description" content="This is what my website is all about!">`.

       6. … and more!

- HTML Validators

    > **Tip**: use html validators to validate your code. [give it a shot](https://validator.w3.org/nu/#textarea)