# ES6

## `let/const` vs `var`

- old js
    ```javascript
    var x = 'hi';
    ```
    ```javascript
    for(var i = 0; i < 5; i++){
        console.log(i);
    }
    console.log(i);
    ```
- es6
    ```javascript
    let x = 'hi'; // vars
    const pi = 3.14; // constants
    ```
    ```javascript
    for(let j = 0; j < 5; j++){
        console.log(j);
    }
    console.log(j);
    ```
    ```javascript
    for(const i = 0; i < 5; i++){
        console.log(i);
    }
    console.log(i);
    ```



## objects

in js objects are hash-tables (key-value) pairs

- old js
    ```javascript
    // creating an object
    obj = {
        name: 'ramoun',
        age: 22,
        programs: function (){
            console.log('photoshop');
        }
    }
    ```
    ```javascript
    // accessing object's data
    console.log(obj.name);
    obj.programs();
    ```

- es6
    ```javascript
    // creating an object
    obj = {
        name: 'ramoun',
        age: 22,
        programs(){
            console.log('photoshop');
        }
    }
    ```
    ```javascript
    // accessing object's data
    console.log(obj.name);
    obj.programs();
    ```

## `this`

`this` is a keyword in js refers to the object (`self` in python)

> **Note**: in js functions are also objects.

- old js
    ```javascript
    const Employee = {
        name: 'ramoun',
        apply_raise(){ // function
            console.log(this);
        }
    }
    // copying the function
    apply = Employee.apply_raise; // first class function copying

    // calling the copy
    apply(); // returns the window
    ```
    ```javascript
    // since functions are objects in js
    const raise = Employee.apply_raise.bind(Employee)
    raise()
    ```

## Arrow Functions (`=>`)

- old js

    ```javascript
    function square(n){
        return n * n;
    }
    
    console.log(square(3))
    ```
- es6

    ```javascript
    const square = (n) => {
        return n * n;
    }
    console.log(square(5))
    ```
    ```javascript
    // if only one line and one parameter
    const square = n => n * n
    ```

## DOM Functions

in js, some functions are known to be part of the DOM, ex: `setTimeout()`

- the problem
    ```javascript
    const artist = {
        function skills() {
            setTimeout(function() {
                console.log(this)
            }, 5000)
        }
    }
    artist.skills()  // returns the window
    ```

- JS way of solving this problem
    ```javascript
    const singer = {
        skills() {
            var that = this;
            setTimeout(function() {
                console.log(that)
            }, 3000) 
        }
    }
    singer.skills()
    ```

- ES6 way for solving this problem
    ```javascript
    const actor = {
        skills() {
            setTimeout(() => {
                console.log(this);
            },400)
        }
    }
    actor.skills();
    ```

## Arrays

- JS way
    ```javascript
    const names = ['ramoun', 'mike', 'mario'];
    const items = [];
    
    for (let i = 0; i < names.length; i++) {
        let listItem = "<li>" + names[i] + "</li>";
        items.push(listItem);
    }
    console.log(items);
    ```
    ```javascript
    // Another simpler JS way
    list = [];
    names.forEach((name) => {
        list.push("<li>" + name + "</li>");
    })
    console.log(list);
    ```

- ES6 way

    in ES6, we use `maps`: a map is a function that returns a new list.

    ```javascript
    // ES6 way (using the map)
        const list_of_items = names.map(name => "<li>" + name + "</li>");
    console.log(list_of_items);
    ```
    ```javascript
    // another simpler ES6 way
        const lis = names.map(name => `<li>${name}</li>`);
    console.log(lis);
    ```

- a very good tip

    ```javascript
    // when writing multi-line html code    
    const lis = names.map(name => `<li class='${name}'        
                                        id='${name}'>
                                        ${name}
                                    </li>`);
    // note: that won't work without the ``
    ```

## object destructuring

is used to elminate code repetation.

```javascript
// main object
const director = {
    first: 'ramoun',
    last: 'python',
    age: 23
}
```
```javascript
// traditional JS way
const first = director.first;
const last = director.last;
const age = director.age;
```
```javascript
// object destructuring in ES6
const {first, last, age} = director;
console.log(first);

const {first:f, last:l, age:a} = director;
console.log(a);

const {last: lolo} = director;
console.log(lolo);

const {fofo,lele,aa} = director;
console.log(fofo);
```

## Array Spread
