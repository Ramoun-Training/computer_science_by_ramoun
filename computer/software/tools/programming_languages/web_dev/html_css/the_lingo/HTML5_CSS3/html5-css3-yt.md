# ED

## meta tags

### robots

```html
<meta name="robots" content="index,follow">
```
this is telling the web crawlers to index the page and follow every link in it to other pages.

### link

```html
<link rel="icon" href="./icon.ico">
```
this changes the favicon

# CSS

## text

### rem

```css
html {
  font-size: 62.5%;
}
.text {
  font-size: 1.5rem; // 15px;
}
```
the main benifit is that you can now zoom in and aout and change font-size
+ easily to use with media queries (always use rems and avoid px and ems.

### body and html default styling

```css
html,
body {
  height: 100%;
  width: 100%;
}
.container {
  width: 100%;
  height: 100%
}
```
cool trick.

### float 

```html
<div class=box1></div>
<div class=box2></div>
<div class=clear></div>
<div class=box3></div>
```
```css
box1 {
  float: right;
}
box2 {
  float: left;
}
.clear {
 clear: both;
}
```

> Note: to change a default styling, first know where does it come from (e.g: color of an anchor comes from the `<a>` tag.

### bakcground

```css
.element {
  background-image: url("./images/1.jpeg");
  height: 80rem;
  background-position: center;
  background-size: cover;
}
```
