# Anna Website

## Part 2

The best way to select all elements at once is to have a parent element that contains all the other elements.

Luckily, gives us a tag called `<body>` that's explicitly designed for that purpose.

## Part 3: Images and form Styling

Types of URLs:

- absolute: 
  + `https://www.google.com` 
  + They include a protcol and a domain name + a path (directory)
- relative:
  + `/assets/logo.png`
  + relative urls are shortcuts that allow to skip domain names. It only works if you are linking to a file on the same domain as the current page.

for adding a background image to a site:

```css
background: url("assets/bg.png");
background-size: cover;
background-position: center;
```

## finished site

```html
<!DOCTYPE html>
<head>
  <title>Anna Dowlin</title>
  <style>
    body {
      text-align: center;
      background: url("/assets/anna-bg.png");
      background-size: cover;
      background-position: center;
      color: white;
      font-family: helvetica;
    }
    p {
      font-size: 22px;
    }
    input {
      border: 0;
      padding: 10px;
      font-size: 18px;
    }
    input[type="submit"] {
      color: white;
      background: red;
    }
  </style>
</head>
<body>
  <img src="/assets/anna.png">
  <p>Hi! I'm Anna, a NYC-based marketer. Say hello!</p>
  <input type="email" placeholder="Your email">
  <input type="submit">
</body>
```