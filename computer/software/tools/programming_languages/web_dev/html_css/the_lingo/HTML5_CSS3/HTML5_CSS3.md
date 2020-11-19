# HTML5/CSS3

now the browser is content-aware due to the new ht ml5 tags and that really works better than the old way using tables and divs.

tags: are used to label content and describe it (not positioning/styling it).

# HTML5

## tags

- `artcile`: groups similar info together (e.g: articles, cards ...etc) + each article has it's own layout.

# CSS3

## Selectors

- element selector
    ```css
    p {
        color: red;
    }
    ```
- id selector
    ```css
    #id {
        color: red;
    }
    ```
- class selector
    ```css
    .class {
        color: red;
    }
    ```
- conjuntion
    > **Note**: it's important because sometimes you have a class that applies to different elements (p, h1, ...etc).
    ```css
    p.class {
        color: red;
    }
    ```
    ```css
    p#id {
        color: red;
    }
    ```

- attribute selectors
    ```css
    p[name] {
        color: red;
    }
    ```
    ```css
    p[name="date"] {
        color: red;
    }
    ```
    > **Note**: in CSS3, you can use regular expressions.
    ```css
    p[name^="tuna"] { /*anything starting with tuna*/
        color: red;
    }
    ```
    ```css
    p[name$="tuna"] { /*anything that ends with tuna*/
        color: red;
    }
    ```
    ```css
    p[name*="tuna"] { /*anything that contains tuna*/
        color: red;
    }
    ```


## Pseudo Class

a way that allows us to select elements depending on their relation to each other (parents and children).

```css
p:nth-child(3) { /* any paragraph that is a third child of a parent */
    color: red;
}
```

```css
p:nth-child(odd) { /*very useful*/
    color: red;
}
```

```css
p:nth-child(4n+1) { /* you can do formulas too */
    color: red;
}
```

## negation Pseudo-class

basicly: what you want to exclude

```css
* {
    color: blue;
}
:not(.class) { /*excluding something from the overall style (whatever style it inherited)*/
    color: red;
}
```
```css
p:not(:first-child) { /* any paragraph that is not a first child */
    color: red;
}
```

## > (greater than sign)

it affects the second element where the first element is the parent

```css
div > p { /* will affect only a p that has a div as its parent */
    color: red;
}
``` 
```css
body > p { /* body is not the parent of the p : so nothing will happen */
    color: red;
}
``` 

## + (plus sign)

```css
p.ramoun + p { /* only apply this rule for paragraphs that immediatly follow paragraphs with .ramoun class */
/*they must be siblings aka: have the same parent*/
    color: red;
}
``` 
```html
<div id="mama">
    <p class="ramoun">good</p> <!--this one doesn't because it follows a div not even a p-->
    <p class="ramoun">good</p>
    <p class="ramoun">good</p>
    <p class="ramoun">good</p>
</div>
```

## ~ (tilde sign)

```css
p.ramoun ~ p { /* only apply this rule for paragraphs that immediatly follow paragraphs with .ramoun class */
/*they must be siblings aka: have the same parent*/
/*unlike the plus sign it doesn't have to immediatly follow*/
    color: red;
}
``` 
```html
<div id="mama">
    <p class="ramoun">good</p> <!--this one doesn't because it follows a div not even a p-->
    <p class="ramoun">good</p>
    <span>hi</span>
    <p class="ramoun">good</p>
    <p class="ramoun">good</p>
</div>
```


|comparison  |explaination  |Column3  |Column4  |
|---------|---------|---------|---------|
|div p     |selects all p that are descendents of the division(divs) regardless of if those p are direct descendents(children) or not.|         |         |
|div>p     |slects children p only (no grandchildren, great-grandchildren ..etc)|         |         |
|div+p     |selects any p that follows a div immediatly|         |         |
|div~p     |selects any p that follows a div (even if not immediatly)|         |         |

> **Tip**: if a parent element has no grandchildren of the element type to be selected, it's better to use the child selector (>) because it's less processor intensive.