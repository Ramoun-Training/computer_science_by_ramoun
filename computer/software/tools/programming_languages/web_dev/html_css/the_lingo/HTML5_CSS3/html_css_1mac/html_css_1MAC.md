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



# Important

> **Note**: _When you put things in your own words, this helps you understand and remember the concepts better_—but don't worry about making it perfect. If you're a little unsure of something, just take a shot at it. This effort by itself will help you develop your understanding when you encounter that concept again.

