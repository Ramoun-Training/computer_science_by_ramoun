# Applied Visual Design 

Visual Design in web development is a broad topic. It combines __typography__, __color theory__, __graphics__, __animation, and page layout__ to help deliver a site's message. The definition of good design is a well-discussed subject, with many books on the theme.

## Create Visual Balance Using the text-align Property

Text is often a large part of web content. CSS has several options for how to align it with the text-align property.

`text-align: justify;` causes all lines of text except the last line to meet the left and right edges of the line box.

`text-align: center;` centers the text

`text-align: right;` right-aligns the text

And `text-align: left;` (the default) left-aligns the text.



```html
<style>
 <style>
  h4 {
    text-align: center;
    background-color: rgba(45, 45, 45, 0.1);
    padding: 10px;
    font-size: 27px;

  }
  p {
    text-align: justify;
  }
  .links {
    text-align: left;
    color: black;
    opacity: 0.7;
  }
  #thumbnail {
    box-shadow: 0 10px 20px rgba(0,0,0,0.19), 0 6px 6px rgba(0,0,0,0.23);
  }
  .fullCard {
    width: 245px;
    border: 1px solid #ccc;
    border-radius: 5px;
    margin: 10px 5px;
    padding: 4px;
  }
  .cardContent {
    padding: 10px;
  }
  .cardText {
    margin-bottom: 30px;
  }
</style>
<div class="fullCard" id="thumbnail">
  <div class="cardContent">
    <div class="cardText">
      <h4>Alphabet</h4>
      <hr>
      <p><em>Google was founded by Larry Page and Sergey Brin while they were <u>Ph.D. students</u> at <strong>Stanford University</strong>.</em></p>
    </div>
    <div class="cardLinks">
      <a href="https://en.wikipedia.org/wiki/Larry_Page" target="_blank" class="links">Larry Page</a><br><br>
      <a href="https://en.wikipedia.org/wiki/Sergey_Brin" target="_blank" class="links">Sergey Brin</a>
    </div>
  </div>
</div>
```

## Adjust the Width of an Element Using the width Property

You can specify the width of an element (the content only) using the `width` property in CSS. 
Values can be: 
- relative length units (such as `em`)
- absolute length units (such as `px`)
- percentage of its containing parent element.

## Use the strong Tag to Make Text Bold

With the `strong` tag, the browser applies the CSS of `font-weight: bold;` to the element.

## Use the u Tag to Underline Text

To underline text, you can use the `u` tag. This is often used to signify that a section of text is important, or something to remember. With the `u` tag, the browser applies the CSS of `text-decoration: underline;` to the element.

## Use the em Tag to Italicize Text

To emphasize text, you can use the `em` tag. This displays text as italicized, as the browser applies the CSS of `font-style: italic;` to the element.

## Use the s Tag to Strikethrough Text

you can use the `s` tag. It shows that a section of text is no longer valid. With the `s` tag, the browser applies the CSS of `text-decoration: line-through;` to the element.

## Create a Horizontal Line Using the hr Element

You can use the `hr` tag to add a horizontal line across the width of its containing element. This can be used to define a change in topic or to visually separate groups of content.

## Adjust the Size of a Header Versus a Paragraph Tag

The font size of header tags (`h1` through `h6`) should generally be larger than the font size of paragraph tags. This makes it easier for the user to visually understand the layout and level of importance of everything on the page. You use the `font-size` property to adjust the size of the text in an element.

## Add a box-shadow to a Card-like Element

The `box-shadow` property applies one or more shadows to an element.

The `box-shadow` property takes values for:

- `offset-x` (how far to push the shadow horizontally from the element),
- `offset-y` (how far to push the shadow vertically from the element),
- `blur-radius`
- `spread-radius` 
- `color`, in that order.

>**Note**: The `blur-radius` and `spread-radius` values are optional.

> **Note**: Multiple box-shadows can be created by using commas to separate properties of each box-shadow element.

Here's an example of the CSS to create multiple shadows with some blur, at mostly-transparent black colors:
```css
box-shadow: 0 10px 20px rgba(0,0,0,0.19), 0 6px 6px rgba(0,0,0,0.23);
```
## Decrease the Opacity of an Element

The `opacity` property in CSS is used to adjust the `opacity`, or __conversely__, the transparency for an item.

- A value of `1 `is opaque, which isn't transparent at all.
- A value of `0.5` is half see-through.
- A value of `0 `is completely transparent.

> **NoteThe**: value given will apply to the entire element, whether that's an image with some transparency, or the foreground and background colors for a block of text.

## Use the text-transform Property to Make Text Uppercase

The `text-transform` property in CSS is used to change the appearance of text. It's a convenient way to make sure text on a webpage appears _consistently_, without having to change the text content of the actual HTML elements.

The following table shows how the different `text-transform` values change the example text `"Transform me"`.

Value | Result
------|-------
`lowercase` | "transform me"
`uppercase` | "TRANSFORM ME"
`capitalize` | "Transform Me"
`initial` | Use the default value
`inherit` | Use the `text-transform` value from the parent element
`none` | Default: Use the original text


## Set the font-size for Multiple Heading Elements

The `font-size` property is used to specify how large the text is in a given element. This rule can be used for multiple elements to create visual consistency of text on a page. In this challenge.

guide:
- `h1` tag to `68px`.
- `h2` tag to `52px`.
- `h3` tag to `40px`.
- `h4` tag to `32px`.
- `h5` tag to `21px`.
- `h6` tag to `14px`.

## Set the font-weight for Multiple Heading Elements

ou set the `font-size` of each heading tag in the last challenge, here you'll adjust the `font-weight`.

The `font-weight` property sets how thick or thin characters are in a section of text.

guide:

- Set the `font-weight` of the `h1` tag to `800`.
- Set the `font-weight` of the `h2` tag to `600`.
- Set the `font-weight` of the `h3` tag to `500`.
- Set the `font-weight` of the `h4` tag to `400`.
- Set the `font-weight` of the `h5` tag to `300`.
- Set the `font-weight` of the `h6` tag to `200`.

## Set the line-height of Paragraphs

CSS offers the `line-height` property to change the height of each line in a block of text. As the name suggests, it changes the amount of vertical space that each line of text gets.

## Adjust the Hover State of an Anchor Tag

This challenge will touch on the usage of pseudo-classes. A **pseudo-class** is _a keyword that can be added to selectors, in order to select a specific state of the element_.

For example, the styling of an anchor tag can be changed for its hover state using the `:hover` pseudo-class selector.

## Change an Element's Relative Position

CSS treats each HTML element as its own box, which is usually referred to as the **CSS Box Model**. 

- **Block-level** items automatically start on a new line (think headings, paragraphs, and divs).
- **inline items** sit within surrounding content (like images or spans). The default layout of elements in this way is called the normal flow of a document, but CSS offers the position property to override it.

When the `position` of an element is set to `relative`, it allows you to specify how CSS should move it relative to its current `position` in the normal flow of the page. It pairs with the CSS offset properties of `left` or `right`, and `top` or `bottom`. These say how many pixels, percentages, or ems to move the item away from where it is normally positioned. The following example moves the paragraph 10 pixels away from the bottom:
```css
p {
  position: relative;
  bottom: 10px;
}
```
> **Note**: Changing an element's position to relative does not remove it from the normal flow - other elements around it still behave as if that item were in its default position. 

> Note: Positioning gives you a lot of flexibility and power over the visual layout of a page. It's good to remember that no matter the position of elements, the underlying HTML markup should be organized and make sense when read from top to bottom. This is how users with visual impairments (who rely on assistive devices like screen readers) access your content.

## Move a Relatively Positioned Element with CSS Offsets

The CSS offsets of `top` or `bottom`, and `left` or `right` tell the browser how far to offset an item relative to where it would sit in the normal flow of the document. You're offsetting an element away from a given spot, which moves the element away from the referenced side (effectively, the opposite direction). As you saw in the last challenge, using the top offset moved the h2 downwards. Likewise, using a left offset moves an item to the right.

![](https://cdn-media-1.freecodecamp.org/imgr/eWWi3gZ.gif)

## Lock an Element to its Parent with Absolute Positioning

The next option for the CSS `position` property is `absolute`, _which locks the element in place relative to its parent container_. 

> Note: Unlike the ``relative`` position, this removes the element from the normal flow of the document, so surrounding items ignore it. The CSS offset properties (top or bottom and left or right) are used to adjust the position.

One nuance with absolute positioning is that it will be locked `relative` to its closest positioned ancestor. If you forget to add a position rule to the parent item, (this is typically done using `position: relative;`), the browser will keep looking up the chain and ultimately default to the body tag.

## Lock an Element to the Browser Window with Fixed Positioning

The next layout scheme that CSS offers is the `fixed` position, which is a type of `absolute` positioning that locks an element relative to the browser window. Similar to absolute positioning, it's used with the CSS offset properties and also removes the element from the normal flow of the document. Other items no longer "realize" where it is positioned, which may require some layout adjustments elsewhere.

> **Note**: One key difference between the fixed and absolute positions is that an element with a fixed position won't move when the user scrolls.