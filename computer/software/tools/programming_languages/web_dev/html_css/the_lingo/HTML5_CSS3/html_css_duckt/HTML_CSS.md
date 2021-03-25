# HTML & CSS By Duckit

> **Note**: To learn HTML you need to know what tags are available for you to use, what they do, and where they can go.


- What is a Markup Language?

  A markup language allows you to annotate text, and these annotations provide additional meaning to the contents of a document.

## Chapter #2: TEXT

- ● **Structural markup**: the elements that you can use to describe both headings and paragraphs
- ● **Semantic markup**: which provides extra information; such as where emphasis is placed in a sentence, that something you have written is a quotation (and who said it), the meaning of acronyms, and so on


### Levels of headings

- **`<h1>`**: is used for main headings.
- **`<h2>`**: is used for subheadings.
- If there are further sections under the subheadings then the
**`<h3>`** element is used, and so on...

> **Note**: The exact size at which each browser shows the headings can vary slightly.

> **Note**: `<b>` just makes text **bold**. It does not imply any additional meaning. Used for Keywords in a paragraph.

> **Note**: `<i>` just makes text _italic_. It does not imply any additional meaning. Used for text that would be said in a different way from surrounding content — such as technical terms, names of ships, foreign words, thoughts, or other terms that would usually be italicized.


### White Space Collapsing

When the browser comes across two or more spaces next to each other, it only displays one space. Similarly if it comes across a line break, it treats that as a single space too. This is known a **White Space Collapsing**.

> **Note**: You will often see that web page authors take advantage of white space collapsing to indent their code in order to make it easier to follow.

### Line Breaks & Horizontal Rules

- `<hr>`: To create a break between themes — such as a change of topic in a book or a new scene in a play — you can add a horizontal rule between sections.

> **Note**: notice how `<br>` and `<hr>` tags are used in text. For Visual effects use CSS.

### Visual Editors

> **Note**: If you copy and paste text from a program that allows you to format text (such as Word) into a visual editor, it may add extra markup. To prevent this copy the text into a plain text editor first (such as Notepad on a PC or TextEdit on a Mac) and then copy it from that program and paste it into the visual editor

### Semantic Markup

There are some text elements that are not intended to affect the structure of your web pages, but they do add extra information to the pages — they are known as **semantic markup**.

> **Note**: you should not use semantic markup to change the way that your text looks; their purpose is to describe the content of your web pages more accurately.

The reason for using these elements is that other programs, such as screen readers or search engines, can use this extra information. For example, the voice of a screen reader may add emphasis to the words inside the `<em>` element, or a search engine might register that your page features a quote if you use the `<blockquote>` element.

E.g:

    <p>I <em>think</em> Ivy was the first.</p>
    <p>I think <em>Ivy</em> was the first.</p>
    <p>I think Ivy was the <em>first</em>.</p>

### Quotations

There are two elements commonly used for marking up quotations:

