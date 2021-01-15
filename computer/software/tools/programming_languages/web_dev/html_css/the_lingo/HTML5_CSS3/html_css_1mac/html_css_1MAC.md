# 1MAC - HTML - CSS 

a [nanodegree]() from udacity for front-end web development.


## Lesson 1: the web and html 

### 1. intro (The Web)

    the web: html documents and other resources refering to each other using hypertext (links).

### 5. HTML and programming (:similarities)

- **Syntax**

    the grammer rules of a language.<br>
    ![syntax](https://imgur.com/vKWjAIg.png)

- **Formalism**

    computers are literal.

- **Nesting**    

    how some bits of code can go inside other bits of code.<br>
    ![nesting](https://imgur.com/O0oBcZN.png)

### 6. Text Editors and files

- **Text Editors**

    text editors used to write text files (are nothing but characters[letters, numbers, symbols, spaces ..etc - all unicode/ascii chars only], they don't contain any special typography such as bold, italics or colors, they dont' contain images ... it can be thought of as any text you can type on an old fashioned type wirter) .

    > **Note**: there's programs that can take text input and [turn it into musical notations](http://lilypond.org/), or [format it for scientifc paper](https://www.latex-project.org/), or [load specially organized text into a spreadsheet](https://en.wikipedia.org/wiki/Comma-separated_values)

    > **Note**: when a browser encounters a link (img, file, ...etc) while parsing the html file, it sends a request to the server to get that resource so that it can display it on window.

- **Syntax Highlighting**

    is a special feature of the text editor, those colors are not saved in file, rather the editor knows the grammer of html and it applies colors in order to help you get the grammer right as you are editing it.

    > **Note**: extensions helps programs treat files appopriately.

    > **CAUTION**: Don't try to write your code in a word processor (like Microsoft Word, Pages, Google Docs, or TextEdit). _**These applications can add extra hidden formatting data to the text**_. Although the code may look fine, this additional hidden data can cause errors that prevent the code from working!

    > **Note**: a pdf isn't a text file and you can't edit it in a text editor. 

### 7. The job of HTML

- **html is made of:**

    1. **Text**: that the user will actually read in their browser (page content - matters for the user).
    2. **Markup**: tells the browser what that _text_ should look like, or how it is arranged. And within markup their can be **Refrences**.
    3. **Refrences**: to include other documents like files, images, and videos.

    > **Note**: for the most part "plain text" in html shows up as "plain text" in the browser, but if we wanna make the text look different, we need markup.

### 8. Markup

- **Markup**

    is just text that has a special meaning for the browser (that renders and parses html pages).


### 10. Breaks and empty Space

> **Note**: Did you know? Spaces, tabs, and line breaks are called
<strong>whitespace</strong>.

`check this out`

'''

Did you
know? 
    Spaces,
    tabs,   
and line
breaks     are     called 
     <strong>whitespace</strong>.

'''

`cool right?`

> **Note**: when browsers render html, all whitespace gets collapsed into a single space.

> **Note**: whitespace is a word used by programmers to talk about spaces, tabs, and line breaks.

- **void elements** _(empty elements)_

    HTML elements with no content and no closing tags.

- **`<br>`**    

    `<br>` just tells the browser, **break the line here**.

### 11. Paragraphs

- Why use `<p>` and not `<br>`

    There are good reasons to tell the browser about the structure of our text (the little pieces it is made up of) and not just what we want it to visually look like (we'll understand that throughly when we learn to control the visual appearance of a page sepratley using css) (+ it is needed for _SEO_).

### 12. Practice Midpoint Review

- ![some very important definations](https://imgur.com/jgBvE9d.png)

### 13. Lots of Elements

> **Note**: `sub` and `sup` stand for _"subscript"_ and _"superscript"_. Originally, HTML started out as a tool for scientific and academic work; and these are really useful for science and math, like writing x<sup>2</sup>+3x+4 = 1 or chemical formulas like H<sub>2</sub>O.

### 14. Nesting

> **Note**: some nesting combinations don't work, like nesting a `<p>` element inside of another `<p>` element.

> **Note**: overlaping between html elements is not allowed.
> ![no overlaping](https://imgur.com/s9yodMG.png)

- **netsting that works but not good**

    ```html
    <p><em>Hello<mark>Guys</em></mark></p>
    <!-- 
       If we give this to a browser, it will probably figure out what we mean, because browsers are actually really lenient. But this is technically wrong HTML.
     -->
    ```

### 15. HTML Elements Review 1    

- **revision of html elements**

   + `<em>` and `<strong>` — Emphasis.<br>
    By default, text inside `<em>` is displayed as italic, and text in `<strong>` is displayed as boldface.

   + `<p>` — Paragraph.<br>
    Text in a paragraph is separated visually from other paragraphs by a small margin.

   + `<br>` — Line break. (empty)  
    A line break does not create a new paragraph; it only marks the end of a line.

    + `<sub>` and `<sup>` — Superscript and subscript.   
    Useful for math and chemistry: I have x<sup>3</sup>+2x<sup>2</sup> molecules of H<sub>2</sub>O.

    + `<mark>` — Highlighting.   
    Not very often used, but it's <mark>kind of cool</mark>.
    Of these elements, the br element is the only one that is an empty (or void) element.


### 16. Headings - Practice

- **Headings**   

    As the `h1` element can be used for **headlines**, or **section headings**. There are actually six of these heading elements: `h1` through `h6`.

    > **Note**: `h1` is used for the main heading on a page, while the rest are used for sub-headings.

    > **Note**: like with the `p` element, heading elements create a little bit of space (margin) around themselves.

    > This is an excercise
    > ```html
    > <h1>My HTML Notes</h1>
    > <p>This page is a collection of my awesome notes about HTML!</p>
    > <h3>The Web</h3>
    > <p>The Web (or World Wide Web) is a collection of documents and other files. Most of the documents are made using Hypertext Markup Language (HTML).</p>
    > <h2>What is HTML?</h2>
    > <p>HTML stands for <em>Hypertext Markup Language</em>. It's used to define the structure or layout of a web page.</p>
    > ```

    > **Note**: You may have noticed that you don't actually have to use the p element as shown in our solution here. But like we mentioned earlier, it's a good idea to tell the browser what kind of content something is—by enclosing those paragraphs inside `p` elements, this is indicating that the contents are paragraphs of text.

### 17. Elements Review

- **More Definations**   

    ![more definations](https://imgur.com/Fss2QTt.png)

### 18. Block & Inline

- **Difference between `<br>` and `<p>`**

    + `<br>`   
        just tells the browser, break the line here
    + `<p>`   
        it does something else beside just containing the text, it tells the browser to create a little invisible box around the text (this box is called a **block**).

        > **Note**: `blocks` are heavily involved in how the browser lays out text on the screen. A block has a height and a width + a margin above and below it (that's why there's a space around it).     

- **some examples**

    + ![inline vs block](https://imgur.com/v75V1Ga.png)
  
    > **Note**: **inline** elements don't make a box around them, instead they flow with text that they are used in.

- **Quick Refrence**    

    + [Block-level elements](https://developer.mozilla.org/en-US/docs/Web/HTML/Block-level_elements#elements)
    +  [Inline elements](https://developer.mozilla.org/en-US/docs/Web/HTML/Inline_elements#Elements)


### 19. Block and Inline - practice

- `p` is a **block element**, which means the browser creates a box around it. It also generates a margin around this box, _to visually separate the paragraph from surrounding elements_.

- In contrast, `br` is an **inline element** that just creates a line break. It doesn't have a box around it and doesn't create any margin.


### 20. The `Div` element

- The `div` is short for **division**, because that's what this element is for—you can use it to _divide up_ the page into different sections.

- > **Note**: a `p` element is specifically meant to contain text. In contrast, the `div` element is a generic container for whatever other elements you might want to put inside.
- > **Note**: You can use the `div` element to _organize_ the content and _divide_ the page into sections.
- > **Note**: The `div` element is a super important one, and it's used a lot in HTML _to help lay out and organize pages_.

### 21. Lists and Implied close tags

- > **Note**: There are few elements that are always used inside certain other elements. They don't make sense on their own. e.g: `li`.

- **`li`**

    a list item can't just appear by itself. It will always be part of a list.

- **Why can't a list item stand on its own outside of a list?**

    because an `ol` and `ul` are displayed differently, without the context of one or the other kind of list, the browser wouldn't know whether to put a dot or a number on the item. Because of that `html` has a rule that `li` elements can only occur inside either an `ol` or a `ul` element.

    > **Note**: lists can be nested iniside other lists

- **Nested Lists**    

    > **Note**:
    > ```html
    > <h2>How to move to NY</h2>
    > <ol>
    >   <li>Pack your Stuff
    >       <ul>
    >           <li>Kitchen Stuff</li>
    >           <li>Bedrooom Stuff</li>
    >           <li>Garage Stuff</li>
    >       </ul>
    >   </li>
    >   <li>Drive to NY</li>
    >   <li>Unpack stuff into tiny appartment</li>
    > </ol>
    > ```
    >> OUTPUT:
    > <h2>How to move to NY</h2>
    > <ol>
    >   <li>Pack your Stuff
    >       <ul>
    >           <li>Kitchen Stuff</li>
    >           <li>Bedrooom Stuff</li>
    >           <li>Garage Stuff</li>
    >       </ul>
    >   </li>
    >   <li>Drive to NY</li>
    >   <li>Unpack stuff into tiny appartment</li>
    > </ol>
    >
    >> NOTE:
    >
    >   Because an `li` element can only occur inside a list and it can not occur directly inside another `li`, HTML doesn't actually require us to write a closing tag for `li` elements.
    
    > **Note**: some web developers omit the closing tags of `li` elements becaue leaving them out saves a little tiny bit of space in the file and some don't because they think it makes their code more clear.

    > **Note**: you have to always write close tags for `ol` and `ul`, so the browser doesn't try to stuff everything after them into the list.

    > **Note**: The `p` element is another example of an element for which the closing tag is optional.

    > **Note**: Remember, when you leave off an optional closing tag, it is still implied—that is, the browser will figure out where the element should be closed, even though you didn't explicitly tell it.

    > **Note**: We must be sure to close the list as a whole! Why? Because if we leave off the closing `</ol>` or `</ul>`, then the browser will not know when our list ends! It will simply treat everything that comes after that point as part of the list.

- **How does the browser know that there has to be a closing tag?**

    when it gets to _the start tag of a new element that can't be inside of the last one_. For example, when it gets to the start of a new `p` element, it knows the previous `p` element must be closed.

    > **Note**: `p` and `li` are the two elements you've seen with optional closing tags. And the browser knows there has to be a closing tag when it gets to the start tag of a new element that can't be inside of the last one. For example, when it gets to the start of a new `p` element, it knows the previous `p` element must be closed.


### 23. Identation - Practice

- > **Note**: for more about indentation in html, click [here](https://www.granneman.com/webdev/coding/formatting-and-indenting-your-html).

### 24. Implied Close Tags - Practice

- **Why doesn't the `br` element require a closing tag?**

    The `br` element is a void element—it doesn't have any contents (unlike `p`, which does have contents!).

### 25. Web Addresses

- **Web Addresses**

    are called URLs (**U**niform **R**esource **L**ocators):

    + _**Uniform**_: Standardized (consistent).
    + _**Resource**_: a file or other data object.
    + _**Locator**_: address for finding something.

    an address that tells the browser how to locate a particular resource (e.g: a file) in a standardized way.

    > **Note**: we have to be pretty carefull to give the browser all the information that it needs when we provide a url for a resource in html (or it will think that we are looking for a local file on server and not a "qualified url").

- **Fully Qualified URLs**

    + ![fully qualified url](https://imgur.com/YD6uK9S.png)   
    + requirements:

        * At the beginning is the **protocol**: 

            * **`https`**: for secure http connection.
            * **`http`**: for traditional http connection.
            * **`file`**: for locating a local file on a local drive.

        * **`://`** 

            seprates the protocol from the next part of the url.

        * Main Part:

            * **Domain Name**: tells the browser what server to connect to.
            * File URLs: wont't have a domain name because there's no server (it is just the browser reading off of a local drive -like any other file 
            explorer).

        * Last Part:
            * **File Path**: the name of the directory + the name of the file the URL is referring to (this will sometimes be empty or a single slash `/`, if you are linking to the top page or home page of a site).

    + ![url disection](https://imgur.com/I0hE47o.png)

    > **Note**:
    >
    > And often the slash will be omitted altogether:
    > ```html
    > http://en.wikipedia.org
    >```
    > This would still be considered a fully-qualified URL.
    
    + Knowledge Test
        * `https://www.simons-rock.edu` is a fully qualified URL that takes you to the main page of a web site.

        * `github.com` is not a fully qualified URL. It's something you can type into your browser, but you can't use it in HTML … unless what you meant was "a file called `github.com` in the same directory as this HTML file",_ which you probably didn't_.

        * `http:///Users/karl/index.html` _is a mess!_ It's an http URL, but it doesn't have a domain name on it. The browser won't know what to do with this since **it's http, but there's no server to connect to**!

        * And `file:///home/kelly/photos/Scotland1.jpg` is a perfectly fine file URL for referring to a file on your own computer ... if you happen to be Kelly on a Linux computer. But keep in mind, if you give a file:// URL to someone else, they probably can't access it because they don't have that file in the exact same location.

### 26. Links and the `<a>` tag

- **Attributes**

    an extra piece of data that comes along with the element and gives it extra meaning 

    > **Note**: `href` attribute is used with the `<a>` tag and few other tags that link to other documents.
    > ![attributes](https://imgur.com/F5MjqhE.png)
    > sometimes "content" is called "link text".

### 28. Adding Images

- ![img](https://imgur.com/2SNbCWA.png)
- > **Note**: `alt` text is displayed when the file is missing from the server or if the user's network connection stops working before that image can be loaded (which is really common on mobiles) or when the user uses a text-reader program to read the page.
- > **Note**: puting an `img` element into your html file doesn't copy the __image file__ into your html file, it just tells the browser where to find that __image file__, the __image file__ still has to be somewhere 
- > **Note**: `img` is an inline element, you can put an image right into the middle of a piece of text, if the image is taller than the text around it, it'll space the lines of text out.

### 29. Files and relative URLs

- "server" vs "local"

    > **Note**: the browser looks at the `src` attribute value and it searches for a speerator (`://`). And when that happens, the browser looks for the file name as a variation of the HTML's own URL. This is called a relative URL.
    The html file on my own computer with URL (`file:///Users/Ramoun/Courses/notes.html`), So when this file refers to the relative URL `kittens.jpg`, it will look for that file in the same directory. Even though I only had to write `kittens.jpg` in my html file, the browser will load the same URL as `file:///Users/Ramoun/Courses/kittens.jpg`

- **Benifits of Relative URLs**

    * used as shortcut instead of writing full Path.
    * independet of the parenth path of the html document.

    > **Note**: as a general rule, if you are referring to an image or a link that's on a webserver (e.g: placebear.com), you'll usually want to use a full URL like `https://www.placebear.com/800/800`, but if you're referring to an image or another file that you're passing around along with you html file, you should use relative URLs.

    > **Note**: relative URLs are the real reason that you can't make an `<a>` link to Google by just writing, `<a href="google.com">Gogole</a>`, even though `google.com` works if you type it directly into your browser. Here the browser will start looking for a file called `google.com`.

    > **Note**: In HTML, a URL with **no** `://` in it is always treated as a relative URL.

    > **LONG Story Short**:
    > ![relative vs absolute(fully qualified) urls](https://imgur.com/GQNEvGQ.png "relative vs absolute(fully qualified) urls")

### 31. Elemetns Review 2

- **Block elements**

    Block elements are used for __large sections of text__, such as paragraphs, headlines, or lists; and also for some other features such as video players and tables.

    A block element creates a (usually invisible) box in the browser display. By default, this box takes up the full width of the display. __The beginning of a block always starts on a new line in the display__.

    Most block elements have a particular way they are displayed by default: paragraphs have margins around them; lists have bullet-points or numbered items; headlines are printed in large text. There is also a generic block element, `div`, which __has no special defaults__.

    - `p` — Paragraph.   
        Text in a paragraph is separated visually from other paragraphs by a small margin.

    - `ul` and `ol` — Unordered and ordered lists.   
        By default, `ul` lists are displayed with bullet points, and `ol` lists with numbered items.

    - `li` — List items inside a `ul` or `ol` list.   
        The `li` element has to be nested inside a `ul` or `ol` list; it can't occur on its own.

    - Section headers, from `h1` (largest) to `h6` (smallest).   
        Used for headlines, section titles, and the like.

    - `div` — A logical division of a page or document.   
        Other block elements such as paragraphs, lists, and headers can be nested inside a `div`.

    You will see the `div` element much more in the next lesson. Because they don't have any default display settings, `div`s are heavily used with custom styling with CSS.    

- **Inline elements**

    Inline elements do not create a full-width box on the display. They modify the display of text, or __insert other things into the text__ — such as line breaks, images, or hyperlinks.

    - `em` and `strong` — Emphasis.   
        By default, text inside an `em` is displayed as italic, and text in `strong` is displayed as boldface.

    - `br` — Line break. (empty)   
        A line break does not create a new paragraph; it only marks the end of a line.

    - `sub` and `sup` — Subscript and superscript.   
        Useful for math and chemistry: I have x<sup>3</sup>+2x<sup>2</sup> molecules of H<sub>2</sub>O.

    - `mark` — Highlighting.
        Not very often used, but it's kind of cool.

    Some of the inline elements you've seen require attributes, extra information besides the name of the element itself. Attributes are written inside the opening tag of the element.

    - `img` — Images.   
        Needs a `src` attribute with a URL, and an `alt` attribute with descriptive text.

    - `a` — Hyperlinks.   
        Needs an `href` attribute with a URL.

    - `Images`
        The syntax for the `img` tag is like this:
        ```html
        <img src="Image URL here" alt="A description of the image">
        ```
        The URL of an image may be an absolute URL, such as `http://placebear.com/800/600`, or it may be a relative URL such as `images/wolves.jpg`.

    The `alt` text is used if the image can't be loaded, or if the user can't see images — such as if the user is using a **screen reader**.

    - `Links`
        Hyperlinks allow the user to navigate from one page to another. They are created using the `a` element. The destination of the link is written in an attribute called `href`; the __link text__ appears as the contents of the `a` element. Here's an example:
        ```html
        <a href="https://en.wikipedia.org/wiki/Hypertext">
            Wikipedia's "Hypertext" article
        </a>

    This code produces a link like this:[ Wikipedia's "Hypertext" article](https://en.wikipedia.org/wiki/Hypertext).

    A link within a __single web site__ can be written using a __*relative URL*__. Links to __other sites__ must be written as __*absolute URLs*__.

### 33. Documents: The `Doctype` tag    

- **How does a browser know what kind of document is it?**

    the file extension only tells one part of the story (that the type of the file is html but what version of html?).

    we indicate the type (version) of html we are using by adding a special tag at the very beginning of the html file (`!Doctype`).

    > **Note**: the `Doctype` tags became very long and convoluted. Eventually the engineers of htmll decided to simplify them down to the very basics (`!Doctype html`).

    The `<!Doctype html>` tells the browser to treate the document as a modern html document (using the latest version of html).

    > **Note**: without the `<!Doctype html>`, browsers will go into what's called quirks mode (which is trying to be compatiable with older versions of HTML).

### 34. Documents: Head and Body

- **`title`**

    is the only **required** element of the `head` (+ the `doctype` too)

    > **Note**: the `head` element can contain 1 of 4:
    > ![head element cotents](https://imgur.com/lFKfroI.png)
    > **Note**: the `lang` attribute is very important for the browser to know the language of the website + it is helpful for screen readers (chat[en] vs chat[fr]).

- __Are head and body required?__   

    In one sense, __*no*__, but in another sense, __*yes*__.

    The grammar of HTML __does not require__ that you literally write a `<head>` or `<body>` tag in your HTML code. Many web developers do write these. However, **if you don't, _the browser will attempt to place them into your code itself_**.

    It needs to put the `head` element around certain elements that belong there, such as `title`; and to put the `body` element around the elements that form the document's body. This means that all the head elements must appear first, and the body elements after.

    You can't have a `head` element, such as `title`, in the middle of your document:

    ```html
    <h1>Here is a 😨 problem:</h1>
    <p>This is a paragraph, which has to be part of the body.
    <title>This is the title, which has to be part of the head.</title>
    <p>The title is ❗️not allowed ❗️ to be in the middle of the body!
    ```

    So even if you choose not to literally write the `<head>` and `<body>` tags in your document, the head and body elements are still created by the browser; and the rest of the document needs to be consistent with this. __*But you must make sure that the `title` and other head parts appear before any paragraphs, lists, images, or other body parts*__.

    You might see older HTML documentation that says these tags are required. This was true in XHTML, an older version of HTML. Today's browsers use HTML5, which does not require them.

    In the next lesson, you will learn much more about how the browser understands and displays web pages, as you learn about Cascading Style Sheets.    

### 36. HTML Validation

- > **Note**: some browsers can deal with html styntax mistakes and work around them, but not all browsers though, so the right way to test html code is not to run in the browser but to use [validators](https://validator.w3.org/)

- **The validator is stricter**   
  
    Web browsers are very **lenient** about how they interpret HTML. They work around small errors and omissions. The quizzes you have seen in this lesson have been relatively lenient as well. The HTML validator is intentionally stricter than actual browsers.

    For instance, if you write an `img` element with no `alt` attribute, a typical browser will display it just fine. But the language requires the `alt` attribute to provide a textual description of an image; this helps search engines and also users with visual disabilities. By reporting a missing `alt` attribute as an error, the validator makes sure that valid HTML will be more accessible.

    ... but it can't catch everything
    The validator cannot tell whether you gave your document a good title. It can't tell whether the `alt` attribute contains an accurate description of the image. The validator won't notice if you wrote `<html lang="de">` (saying that your document is in German) on a document that is actually written in Korean. It is still up to you to make sure that your HTML says what you mean it to say.


## Lesson 2: STyleing with CSS

### 1. Starting with Style

    You will use CSS to change the color or the layout of a web page, among other things! 

### 2. Developer Tools

- **Is there a difference between original code and code inside of the elements tab in the dev tools?**

    there are usually differences! The Elements tab isn't showing you the original HTML source code. It's showing you a sort of map or representation of how the browser sees the page.

    > **Note**: in Chrome, many pieces of text will show up in "double quotes", which aren't in the original source or in the rendered version of the page.

    > **Note**: the view that you see in Elements is actually __a picture of the way the browser thinks about the page internally__ — not just a copy of the original HTML file.

### 3. Text to Trees

- **How the browser renders an html page?**

    the browser takes the html document and converts it to a new file called (DOM) and then it loads it to memory, and from the Dom, it creates the 2D image that appears in the window of the browser(aka: the webpage).

- **What is an HTML file made of?**    

    It is made of text (ASCII/UNICODE characters) used to represent tags and content.

    > **Note**: when we make a style change to the page, that doesn't change the structure of the HTML Source Code, but it does change the appearance (the style is mixed with the DOM).

- **What is a DOM**?    

    it is a data structure (an organized map of what's going to end up on the page)

    > **Note**: Dev Tools let's us look at the DOM (not the html).
    >
    > ![DOM](https://imgur.com/9uzk9ZD.png)
    >
    > As in Chrome Developer Tools, the "quote marks" just indicate a text element (string) and aren't literally in the page.

### 4. Tree Structures

    Tree STructures are pretty common in CS. It is how programmers talk about the way computer languages work

- **Terminology**    

    A Tree is made up of Parts called **Nodes** (elemnents) and they have conncections between them called **branches** (representing relashionships between the nodes of the tree). 

    A tree always has a **root** node which is the top or start of the tree.

    > **Note**: in the case of html documents, the `html` node is the root of the tree.
    > ![root](https://imgur.com/ETyteG1.png)

    The nodes that descend from any particular node are called its **children**.

    > **Note**: a tree isn't a kind of diagram with boxes and arrows, it is a data structure (a way that information is organized --how to write or draw that data structure is kinda secondary ). It doesn't have to be even written. Eg: slides, outlines, classifications (categories that got sub-categories -surrounded with circles)

- **Tree Structure Rules**    

    1. A Treee stars with one node that is the _root_.
    2. Each Node (including the _root_) can have refrences or _branches_ that point to other nodes (its children)
    3. Each node has exactly **one parent** (except for the root node which has no parent)
    4. Though each node can have any number of branches going out, it only has one branch comming in.(see 3.)
    5. A new branch can never point to a node that's already in the tree (aka: 3.)

    > **Note**: At the Elements tab of the DEV Tools, you are not looking at your html code that you've written, but a version that's been reconstituted' from the DOM Tree, and that's why **it looks different from the original**.

### 5. Trees to Boxes

    Every element that appears on the page gets layed out into a box, and these boxes land inside of other boxes, and the layout of theses boxes is controlled by the tree structure with a little help from the css.

 > **Note**: you control how boxes are layedout (h or v) using css.
 > ![cssom](https://imgur.com/vKs3BXY.png)


### 6. Styling HTML Directly

- **inline style (attribute)**
    
    ```html
    <ol>
        <li style="color:green;">hi
        <li style="color:greem;">hi
        <li style="color:green;">hi
        <li style="color:green;">hi
    </ol>
    ```
    cons:   

    + hard to catch if one of them missed.
    + change must happen to all of them (not DRY) -> for fewer places things could go wrong.
  
    > **Note**: as the browser builds up the picture on the screen from the DOM tree, it'll use the css styles to color, shape, and layout the page.

    > **Note**: the `;` is optiional if there's only one rule applied to the element.

### 9. Quotes or No Quotes

- **removing quotes**

    ```html
    <p style=color:blue;text-align:center;>Hello!</p>
    ```
    Without the quotes, the browser can sometimes still figure out where the attribute value ends. So it's possible to get away with leaving the quotes off, in some cases. But if there is a space (and no quotes) then the browser will get confused and think the attribute value has ended right before that space.


    ```html
     <p style=color:blue; text-align:center;>Hello!</p>
    ```
    With the quotes gone and a space added, the editor thinks that `text-align:center;` is an attribute, just like `style`.

    > **Note**: If we just put the CSS anywhere on the page, the browser will get confused. It will try to interpret the CSS code as if it were HTML!. To signal to the browser that this code is in the CSS language, we need to put it inside a `style` element or use it as the value of a `style` attribute.

### 12. CSS Syntax

- **Ruleset Disection**

    + _Selector_:   
        which element will the ruleset be applied to.

    + _Declaration block_:   
        How will the ruleset modify these elements.

    ```css
    p {
        color: red;
    }
    ```
    - **`p`**: selector.
    - **`color:red;`**: rule or _declaration_ (part of the declaration block `{}`).
    - **`color`**: property.
    - **`red`**: value.

### 13. Selectors: Type

- **Type (element) Selector**

    E.G: `em`, `h1`, `p`...etc.

### 14. Selectors: Class and Id

- **Class**

    In computer Science, `class` is a very common word for "a group of things with the same characteristics".

    ![class](https://imgur.com/PrFVdNk.png)

    > **Note**: use a `class` when there could be several elements that need the same style.

    > **Note**: use an `id` when there's only one element to apply it to.

    > **Note**: the difference between `id` and `class` is that, `id` is meant to be unique. In contrast there can be any number of elements with same `class`.

    > **Note**: Classes and IDs are case-sensitive, start with letters, and can include alphanumeric characters, hyphens, and underscores. A class may apply to any number of instances of any elements. An ID may only be applied to a single element.

### 15. Selectors: combining

- **descendent selector**:

    a _space-sperated_ slelector indicates (parent child) of any degree.
    E.g:
    ```html
    <h1>
        <ul>
            <li>hi
        </ul>
    </h1>
    ```
    ```css
    h1 li { // we didn't mention the `ul`
        color: red; // applied to the "hi"
    }
    ```

    > **Note**: Want to learn much more about selectors? Check out the [MDN documentation](https://developer.mozilla.org/en-US/docs/Learn/CSS/Introduction_to_CSS/Selectors).

    > **Note**: if you have a rule that applies to an element that doesn't exist, the rule will not do anything. It is really common to have the same CSS rules for all pages on a web site; and if a particular page does not make use of a particular rule, that's OK!

### 16. Vocabulary Review

- **important CSS terms**:

    + **_DOM, or Document Object Model_**:   
    is a tree structure with a node for each HTML element, piece of text, image, and any other object in the web page.

    + **_Selectors_**:    
    are one part of the CSS ruleset. They indicate which HTML element(s) the rule is for.

    + **_Declaration blocks_**:    
    are the other part of the CSS ruleset, they say how the rule will modify the elements indicated by selectors.

    + **_CSS rules_**:   
    are composed of a selector followed by a declaration block.

    + **_type_**:    
    is the simplest kind of selector. It indicates the name of one type of HTML element (such as `em` or `li`).

    + **_class_**:   
    in HTML is an attribute that groups elements together that you want to have the same style.

    + **_id_**:   
    is an attribute that must be unique to a single element, used to identify it.

### 17. Selectors review 

- **CSS Selectors**

    + **_Type selectors_**:   
    are used to apply a style to a particular type of HTML element, like `h1` or `body`. Type selectors are written using just the type name.

    + **_Class selectors_**   
    are used to set the style for multiple HTML elements that have a particular value for the `class` attribute. You can name a class anything you want! Class selectors are written with a dot before the class: for elements such as `<p class="blue">`, the class selector is `.blue`.

    + **_ID selectors_**   
    are used when the `style` is being applied to one HTML element, which has to have an `id` attribute. There can be only one element with a particular `id` on a page. You can also choose any name you want for an id, just like a class. ID selectors are written using a `#` sign: for an element such as `<div id="sidebar">`, the id selector is `#sidebar`.

    > **Note**: a css rule defines the style, using an id,class...etc with an html element (applies the style to that element).

    > **Note**: to apply multiple  classes to the same element, simply put in both of the class names, separated by a space. Like this:
    >```html
    > <li class="highlight done">Make waffles</li>
    >```

# Important

> **Note**: _When you put things in your own words, this helps you understand and remember the concepts better_—but don't worry about making it perfect. If you're a little unsure of something, just take a shot at it. This effort by itself will help you develop your understanding when you encounter that concept again.

- **But what does it mean?!**   

    + You will definitely sometimes run into validation errors that you don't understand. **This is a normal part of being a programmer**, so it's important to develop skills for working through them!

    + When you do see an error that you're not sure about, here are a few things you can try:

        * Copy and paste the error into your favorite search engine.

        * Post the error to your Study Group and discuss it with other students and your mentors.

        * Search Knowledge (stackoverflow) to see if someone has previously encountered this error. If they haven't, you can post a question about it yourself!

- **What should I do with new tools?**

    find out how I can use it to investigate the world and see what I can discover about what I can change with it.

- Placeholder images sites:
    - [placebear](https://placebear.com)
    - [placekitten](https://placekitten.com)
    - [Lorem Picsum](https://picsum.photos/)
    - [Fill Muray](https://www.fillmurray.com/)
    - for more: search for [`"image placeholder"`](https://www.google.com/search?q=%22image+placeholder%22&rlz=1C1YEIU_enEG929EG929&oq=%22image+placeholder%22&aqs=chrome..69i57j33i160.3041j0j1&sourceid=chrome&ie=UTF-8)

- Good Learning Resources:

    + [MDN-FE](https://developer.mozilla.org/en-US/docs/Learn/Front-end_web_developer).
    + [MDN-Tools](https://developer.mozilla.org/en-US/docs/Learn/Tools_and_testing/Understanding_client-side_tools)
    + [Wikipedia-CSS](https://en.wikipedia.org/wiki/CSS)
    + [Quirks-Mode](https://en.wikipedia.org/wiki/Quirks_mode)
