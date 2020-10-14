# Javascript

A high level interpreted multiparadigm scripting language.

- **high level**: has a lot of abstraction (e.g: you don't have to deal with memory managment as in c+++/c).

- **Interpreted**: and that means your program is executed directly without running through a compiler.

- **JS** conforms to the specifcations of ECMAScript (note: there's other implementations of ECMAScript in other languages like ActionScript).

- **Multi-Paradigm**: means that you can write your code in many different paradigms (e.g: functional, OOP ...etc)(i.e: you are not forced to write in OOP like in **Java** for example).

- Runs on the client/browser as well as on the server (Node.js runtime environment (i.e: something like the **jre** for **java**)).


## Why JS?

1. It's the programming language of the browser (i.e: most of the known programming languages are all server-side and they can't deal with the **client-side** unless they use some library that generates javascript for the browser).

2. Build very Interactive interfaces with **JS frameworks** like: React and Angular.

3. Can be used for building very fast **server**-side and **full-stack** apps (unified code-base).

4. Can be used in **Mobile** Dev. (React Native, NativeScript, Ionic, PhoneGap ...etc).

5. Can be used in **Desktop** Apps (Electron JS).

Sot it's basically **EVERYWHERE**.


## JS REF.


### 1. `Console.log()` & `alert()`

- `console.log()`

    is a part of the window object and adds a pop up message. 

    the `console` object has a punch of methods attached to it and you can view 'em [here](https://www.google.com/search?q=mdn+console&oq=mdn+console&aqs=chrome..69i57j0l7.7041j0j1&sourceid=chrome&ie=UTF-8).

- `alert()`

    is a part of the window object and adds a pop up message. 

    It blocks the rest of the script from running and it's very ineffecient 

### 2. Variables

```javascript
let x; // declaration / initialization
x = 10; // assignment 

let x = 10; // 2x1 
```

- `var`

    used since the beginning of js, but not used that much anymore because it's globally scoped (i.e: if you have 2 variables with the same name and one defined inside of an `if` block and the ohter is outside that block, that will cause conflicts).

- `let`

    has a block-level scope and were added with **ES6**.

    used with **variables**.

    only `let` can be used for **initialization**.

- `const`

    has a block-level scope and were added with **ES6**.

    used with **constants**.

    > **Note**: always use `const` unless you know you're gonna reassign a value. That makes the code more robust and more secure and less prone to errors.

### 2. DataTypes

- **primitive** datatypes
    
    data is directly assigned to memory (data is not a resource).

    + **Strings:**

        can use double or single qoutes (it's preferred to use single quotes).

        ```javascript
        const name = 'ramoun'; 
        ```

        - **concatenation**

            ```javascript
            // old way

            const name = 'ramoun';
            const age  =       22;
            console.log('my name is ' + name + ' and i am ' + age + ' years old.'); // other datatypes are implicitly converted
            ```

            ```javascript
            // ES6 way (Template string)

            const name = 'ramoun';
            const age  =       22;
            console.log(`my name is ${name}  and i am ${age} years old.`); // other datatypes are implicitly converted
            ```

            > **Note**: you can convert any dtype into a string using this simple trick `'' + 4` => `'4'`.

        - **`length`**

            each string variable is a string object because "**EVERYTHING** in JS is an **Object**".

            and each string object has a `length` property that holds the number of characters of that string.

            ```javascript
            const string =     'hello';
            console.log(string.length);
            ```

        - **`toUpperCase()`**

            converts all letters to uppercase.

            ```javascript
            console.log(string.toUpperCase());
            ```

        - **`toLowerCase()`**

            converts all letters to uppercase.

            ```javascript
            console.log(string.toLowerCase());
            ```

        - **`substring()`**

            pulls a substring out of a string.

            ```javascript
            console.log(string.substring(0, 3)); // start (inclusive), end (exclusive)
            ```

        - **chaining**

            ```javascript
            console.log(string.substring(0, 4).toUpperCase());
            ```

        - **`split()`**

            splits a string into an array.

            ```javascript
            console.log(string.split('')); // by letter

            const x =  'this, is, splitted';
            console.log(string.split(', '));
            ```

    + **Numbers:**

        can be floats or ints but js doesn't have a seprate dtype for each one. It's just a number.

        ```javascript
        const age = 22; 
        const rating = 4.8; 
        ```

    + Boolean

        thanks mr George Boole.

        ```javascript
        const isDope = true; 
        ```

    + **null:**

        means empty (a variable with nothing in it).

        It's not a 0 and not a '' or "".        

        ```javascript
        const empty = null;
        ```


    + undefined

        ```javascript
        const undef = undefined;        
        ```

        > **Note**: using `let x;` makes `x` undefined.
    + Symbol

    ```javascript
    // to get the types of data in each var
    console.log( typeof name   );
    console.log( typeof age    );
    console.log( typeof rating );
    console.log( typeof isDope );
    console.log( typeof empty  ); // go research 'js null is object typeof' hint: it's not really an object
    console.log( typeof undef  );
    ```
- **objects** datatypes

    + object
    + Arrays

        they are variables that hold multiple values.

        you can **add / manipulate / use** methods on values of the array even if it's `const` (the only thing you cannot do to a `const` array is reassigning the whole array).

        - **Creation:**

            ```javascript
            // creating an array with and Array() constructor - not used that much
            
            const numbers = new Array(1,2,3); // the new keyword is used in a lot of programming languages to indicate a constructor call and to differentiate between a constructor call and a function call
            ```

            ```javascript
            // using brackets - used usually

            const names = ['john', 'mike']; // faster
            ```

            ```javascript
            // in js you can have multiple datatypes in the same array (just like python) + you don't have to explicitly write the number of objects in an array (like java or c++ for example)

            const array = ['my', 'name', 33, true];
            ```

        - **Accessing:**

            ```javascript
            console.log(array[0]); // arrays are 0 based in every language
            ```

        - **Traversing:**            

            ```javascript
            for (let i = 0; i < array.length; i++) {
                console.log(array[i]);
            }
            ```

        - **Adding:**

            ```javascript
            array[4] = 'this element wasn\'t here before';
            ```

            ```javascript
            // if you wanna add to the end without knowing the last element index
            array.push('this is gonnna be added to the end of the array');
            ```

            ```javascript
            // if you wanna add to the beginning of the array
            array.unshift('this should be added to the beginning of the array');
            ```            

        - **removing:**

            ```javascript
            // removing the last element of an array
            array.pop();
            ```

        - **checking:**

            ```javascript
            // if you wanna check if somehting is an array
            console.log(Array.isArray('this should return false'));
            ```

        - **index:**

            ```javascript
            // let's see what is the index of 'name'
            console.log(arr.indexOf('name'));
            ```

        > **Note**: javascirpt is a dynamically typed programming language (so you can't do semehting like this: `const x:string`), if you like static typing you can use Typescirpt (a javascript preprocessor).

    + Object Literals

        are basically key:value pairs (like dictionaries in python but with little differences).

        - **creation:**

            ```javascript
            const person = {
                name: 'ramoun',
                33  :       20,
                true:     true,
                age :       22,
                hobbies: ['programming', 'programming', 'programming'];
                contact: function() {
                    console.log('omar.ramoun@gmail.com');
                }
                // embeded objects: objects within objects
                address: {
                    street :        22,
                    state  : 'florida',
                    country:     'U.S'
                }        
            }
            
            console.log(person.name, person.address.state);
            console.log(person.hobbies[1]);
            console.log(person.33);
            console.log(person.true);
            ```
        
        - **destructuring:**

            converting key parts of an object to variables (aka: pulling variables of an object).

            It's not assigning something, but pulling different things out.

            It's part of **ES6**.

            ```javascript
            const { name, age, address } = person;
            console.log(name); // the variable names must match the keys in the literal object in order for this to work or thesse vars will be all undefined.

            const { 33, true } = person; // this is a syntax error 'cus it violates rules of naming identifiers inside of js 
            // that's why the keys should always be ruled with the naming rules of identifiers in order to pull 'em out if needed.
            ```

            ```javascript
            // pulling embbeded objects is easy
            const { hobbies, address { city } } = person;
            console.log(city);
            ```
        
        - **adding properties:**

            ```javascript
            person.email = 'omar.ramoun@gmail.com';
            console.log(perosn;)
            ```

        - **arrays of objects:**

            ```javascript
            const todos = [
                {
                    id  :                             1,
                    text: 'get a job as a software dev',
                    isCompleted : false
                },
                {
                    id  :                              2,
                    text: 'write better javascript code',
                    isCompleted : true
                },
                {
                    id  :                               3,
                    text: 'organise some of my bookmarks',
                    isCompleted : false
                }
            ]
            console.log(toos);
            ```

### 3. JSON            

**J**ava**S**cript **O**bject **N**otation is a data format that is used alot within fullstack development using APIs sending data to a server and recieving too.

> **Note**: It's very similar to **object literals**. The only difference is that we have **double qoutes** around all the keys and we have **dobule qoutes** around all the strings (so no single qoutes in json that would give us an error).

- converting an **array of objects** to **JSON**

    ```javascript
    // maybe you want to get it ready to be sent to a server or something like that

    //easy
    const todosJSON = JSON.stringify(todos);
    console.log(todosJSON);
    // and this is how we would send data to a server
    ```

### 4. Loops

- `for` loop

    ```javascript
    // the i is iterator
    for (let i = 0; i < 10; i++) {
        // run this code until the condition is not true
        console.log(`for loop number: ${i}`);
    }
    ```

    ```javascript
    for (let i = 0; i < todos.length; i++) {
        console.log(todos[i].text);
    }
    ```
- `for` `of` loop    

    like the traditional for loop but much more readable and suitable for traversing arrays

    ```javascript
    for (let todo of todos) {
        console.log(todo.id);
        console.log(todo.text);
    }
    ```

- `while` loop 

    ```javascript
    let i = 0;
    while (i < 10) {
        // code goes here
        i++;
    }
    ```
### 5. High Order Array Mehtods

> **Note**: Theses high order array methods they take as a parameter a function.

- `forEach`

    allows us to loop through and array almost identical to the `for .. of` statement.

    ```javascript
    // the function can take multiple items but the first one will always be the varaible you are gonna use to represent each item
    todos.forEach(function (todo) {
        console.log(todo.text);
    });

    // you can also use arrow functions
    todos.forEach(todo => {
        console.log(todo.text);
    });
    ```

- `map`

    allows us to create a new array from an existing one.

    It returns an array.

    ```javascript
    const todoText = todos.map(function (todo) {
        return todo.text;
    });
    console.log(todoText);
    ```

    ```javascript
    const todoText = todos.map(todo => {
        return todo.text;
    });
    console.log(todo.text);
    ```

- `filter`

    allows us to create a new array based on a condition (i.e: as the name suggests it allows you to filter your array)

    ```javascript
    const completedTodos = todos.filter(function () {
        return todo.isCompleted === true;
    });
    console.log(completedTodos);

    // same with arrow functions
    ```

- chained

    ```javascript
    const completedTodosText = todos.filter(function (todo) {
        return todo.isCompleted === true;
    }).map(function (todo) { return todo.text });
    ```

### 6. Equal sign

- double equal (`==`)
    
    matches only the values and not the data types (e.g: `'10' == 10` returns `true`).

- triple equal (`===`)

    matches the values and teh data types (e.g: `'10' === 10` returns `false`).

> **Note**: most developers use triple equal (`===`) because for the most part they always wanna match the types.
 
> **Tip**: alot of the stuff generally in programming is prefrence. 

## Refrences

- [mdn]()
- [w3schools]()