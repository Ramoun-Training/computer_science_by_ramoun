# Box Model

## Width

The default width of an element depends on its display value. Block-level elements have a default width of 100%, consuming the entire horizontal space available. Inline and inline-block elements expand and contract horizontally to accommodate their content. Inline-level elements cannot have a fixed size, thus the width and height properties are only relevant to non-inline elements.

## Height

The default height of an element is determined by its content. An element will expand and contract vertically as necessary to accommodate its content. 

> **Note**: The default height of an element is determined by its content. An element will expand and contract vertically as necessary to accommodate its content. 


## margins

One oddity with the margin property is that vertical margins, top and bottom, are not accepted by inline-level elements. These vertical margins are, however, accepted by block-level and inline-block elements.

## padding

The padding property, unlike the margin property, works vertically on inline-level elements. This vertical padding may blend into the line above or below the given element, but it will be displayed.

## longhand vs shorthand

When we wish to identify only one margin or padding value, it is best to use the longhand properties. Doing so keeps our code explicit and helps us to avoid any confusion down the road. For example, did we really want to set the top, right, and left sides of the element to have margins of 0 pixels, or did we really only want to set the bottom margin to 10 pixels? Using longhand properties and values here helps to make our intentions clear. When dealing with three or more values, though, shorthand is incredibly helpful.

> NOTE: dThe margin and padding properties are completely transparent and do not accept any color values. Being transparent, though, they show the background colors of relative elements. For margins, we see the background color of the parent element, and for padding, we see the background color of the element the padding is applied to.

## border

```css
div {
  border-bottom-width: 12px;
}
```

### border radius

The border-radius property accepts length units, including percentages and pixels, that identify the radius by which the corners of an element are to be rounded. A single value will round all four corners of an element equally; two values will round the `top-left/bottom-right` and `top-right/bottom-left` corners in that order; four values will round the `top-left`, `top-right`, `bottom-right`, and `bottom-left` corners in that order.

```css
div {
  border-top-right-radius: 5px;
}
```

### content box

The `content-box` value is the default value, leaving the box model as an additive design.

### Border Box

Lastly, the border-box value alters the box model so that any border or padding property values are included within the width and height of an element. When using the border-box value, if an element has a width of 400 pixels, a padding of 20 pixels around every side, and a border of 10 pixels around every side, the actual width will remain 400 pixels.

> **Note**: we can easily mix length values. Say we want our box to be 40% wide. Adding a padding of 20 pixels and a border of 10 pixels around every side of an element isn’t difficult, and we can still guarantee that the actual width of our box will remain 40% despite using pixel values elsewhere.

### box-shadow

```css
  box-shadow: 0 1px 2px #ccc, inset 0 1px 0 #fff;
```