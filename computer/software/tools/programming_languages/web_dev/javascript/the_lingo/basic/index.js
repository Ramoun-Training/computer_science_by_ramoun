console.log('hi js');
console.log('try using cl for console log since it used alot in js');

const name   =  'ramoun';
const age    =        22;
const rating =       4.8;
const isDope =      true; 
const empty  =      null;
const undef  = undefined;

// to get the types of data in each var
console.log( typeof name   );
console.log( typeof age    );
console.log( typeof rating );
console.log( typeof isDope );
console.log( typeof empty  );
console.log( typeof (empty));
console.log( typeof undef  );


const arr = ['this', 'is', 33];
arr[1]    =           'isn\'t';
console.log(arr);

arr.unshift('first');
arr.    push('last');
console.    log(arr);


// object literals

const person = {
    name:    'ramoun',
    33  :          20,
    true:        true,
    age :          22,
    hobbies: [
        'programming', 
        'programming', 
        'programming'
    ],
    contact: function() {
        console.log('omar.ramoun@gmail.com');
    },
    // embeded objects: objects within objects
    address: {
        street :        22,
        state  : 'florida',
        country:     'U.S'
    }        
}

console.log(person.name, person.address.state);
console.log(person.hobbies[1]);
console.log(person[33]);
console.log(person.true);

const { nameOfPerson, address } = person;
console.log(nameOfPerson);
console.log(address);


// an array of objects - used often

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
console.log(todos);
console.log(todos[1].text);


// JSON
const todosJSON = JSON.stringify(todos);
console.log(todosJSON);


// for loop
for (let i = 0; i <= 10; i++) {
    console.log(`this is iteration #${i}`);
}

for (let i = 0; i < todos.length; i++) {
    console.log(todos[i].text);
}


// for of
for (let todo of todos) {
    console.log(todo.id);
}

// forEach
todos.forEach(function(todo) {
    console.log(todo.text);
});

todos.forEach(todo => {
    console.log(todo.isCompleted);
});


// map
const todoText = todos.map(function (todo) {
    return todo.text;
});
console.log(todoText);

const todoIds = todos.map(todo => todo.id);
console.log(todoIds);

const completedTodos = todos.filter(todo => todo.isCompleted === true);
console.log(completedTodos);

// chains
const completedTodosText = todos.filter(function (todo) {
    return todo.isCompleted === true;
}).map(function (todo) {
    return todo.text;
});

// or in one line
const completedTodosText_arrow = todos.filter(todo => todo.isCompleted === true).map(todo => todo.text);

console.log(completedTodosText);
console.log(completedTodosText_arrow);


// conditionals

let a = 33;
let b = 44;
let c = 33;
let max;

if (a > b) {
    if (a > c) {
        max = a;
    } else {
        max = c;
    }
} else {
    if (b > c) {
        max = b;
    } else {
        max = c;
    }
}

if (a > b) {
    console.log("greater than b");
} else if (a === b) {
    console.log("is equal to b");
} else {
    console.log("is less than b");
}

console.log(max);


// ternary 

let x = 1;
let color = x == 0 ? 'black' : 'white';
console.log(color);

// switch 

switch (color) {
    case 'black':
        console.log('color is black');
        break;
    case 'white':
        console.log('color is white');
        break;
    default:
        console.log('doesn\'t match');
}

let y = 3;

switch (y) {
    case 1:
        console.log(1);
    case 2:
        console.log(2);
    case 3:
        console.log(3);
    case 4:
        console.log(4);
    default:
        console.log('finished');
}
