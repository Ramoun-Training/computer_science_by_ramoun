# HTML5, CSS3, VSCODE

Tutorial on HTML5, CSS3, and VSCode from Code Addict Channel

- [link for tutorial](https://www.youtube.com/watch?v=V5rIPKzcX7Q&ab_channel=CodingAddict)

## HTML

### dummy lorem

here is some shortcuts for lorem.

```html
lorem10
lorem 500
```

```html
<body>
    <h1>Lorem ipsum dolor sit amet consectetur adipisicing elit. Facilis, ratione.</h1>
</body>
```

### relative path

```html
<!-- mostly used in other programming languages and frameworks (so it is better get used to it) -->
<img src="./cool.png">    

<!-- works but only in html and css -->
<img src="cool.png">
```

### copyright free images

- pixabay
- pexels
- gratisography

### resizing images

- **using attributes**

    you can use the `width` and `height` attributes to resize an image.

    > **Note**: for a fixed resizinig you can use only one attribute (mostly `width` attribute).

    ```html
    <img src="image.png" alt="an image" width="220" height="110">
    ```

- **using CSS**

    you can use the `width` and `height` properties.

    > **Note**: for a fixed resizinig you can use only one attribute (mostly `width` attribute).

    ```css
    img {
        width: 220px;
        height: 110px;
    }
    ```

- **using `picture` tag**
  
    ```html
    <picture>
      <source sizes="110" srcset="img110.png">
      <source sizes="220" srcset="img220.png">
      <img src="img_original.png" alt="img origianl">
    </picture>
    ```

> **Note**: either you are using css method or the `img` element attributes methods, the browser will still render the image with the original aspects and then resize it. Ofcourse that's gonna make the image take long to load. So, it's better resize the image with a graphics software.

### `strong` and `em`

> **Note**: you always have to take care of the `strong` and `em` elements becaseu they really make a difference when you are reading text.

### html entities

there are a lot of html entities and you can check to docs for more.

### unordered lists

mostly used for navbars.

```html
<ul>
    <li><a href="#">home</a></li>
    <li><a href="#">home</a></li>
    <li><a href="#">home</a></li>
    <li><a href="#">home</a></li>
    <li><a href="#">home</a></li>
</ul>
```

### nested lists

you can nest listed inside of other lists

```html
<ol>
    <li>mike</li>
    <li>john</li>
    <li>mark
        <ol>
            <li>crazy</li>
            <li>active</li>
            <li>nice</li>
        </ol>
    </li>
</ol>
```

### Forms

> Note: incase you want to work with forms without using a backend lagnauge , you can use [formspree](https://formspree.io). Btw, The data is gonna be submitted to your email.

- you can group form elements using `div` s.
- use the `button` element of type `submit` as the submmittion button for the form. (check google to see difference between using these 2 methods).
  
> **Note**: when you have the `action` attribute empty, the broswer is gonna submit the form to the current page.

- use the `label` elements but first make sure to use the appropriate way of implementation.

- when using `textarea` make sure to understand teh differenc b/w using the `cols` and `rows` attributes and using css `width` and `height`.

> make sure to add comments to tables becaussee

## CSS3

![css syntax](https://puzzleweb.ru/en/images/css/1_1.png "css syntax")

### Specificty

check out w3 and  mdn.

> **Note**: the universal selector is the least specific element and that is why it used for reseting browsers style.

### colors

checkout coolors

### CSS Units

- Absolute
  - pixels
  - points
- Relative
  - ems, rems (depend on parent element and root element).
  - [r] vw, vh (depend on the window-size of the browser).
  - percetages (depend on width and height of parent element)

> **Note**: the default width of an block-level element is `100%`.

- [r]: responsive.
