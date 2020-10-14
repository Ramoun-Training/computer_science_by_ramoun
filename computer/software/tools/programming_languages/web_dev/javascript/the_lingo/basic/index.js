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



// funfunfunctions

function func(x, y) {
    return x == y;
}

console.log(func(3, '3')      );
console.log(func(3, 3.0)      );
console.log(func(true, 'true'));
console.log(func(true, 1)     );
console.log(func(0, false)    );
console.log(func(0, '')       );
console.log(func(false, '')   );
console.log(func(false, [])   );

console.log(![]);
console.log(!'');
console.log(!0 );
console.log(!{});


function add(num1 = 0, num2 = 0) {
    return num1 + num2;
}
console.log(add());

// arrow functions

const addFun = (num1 = 1, num2 = 2) => {
    return num1 + num2;
}

const subFun =  (num1 = 0, num2 = 0) => {return num1 - num2}; // you cann't get rid of the braces if you use the return keyword
console.log(addFun(3, 3));
console.log(subFun(3, 3));

const cube = num1 => num1 * num1 * num1;
console.log(cube(3));


// objects through constructor functions

// constructor functions
function Person (firstName, lastName, dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = new Date(dob);
    this.getBrithYear = function () {
        return this.dob.getFullYear();
    }
}

Person.prototype.getFullName = () => {
    return this.firstName + ' ' + this.lastName;
}


// instanciate an object
const person1 = new Person('john', 'doe', '10-15-1988');
console.log(person1);
console.log(person1.lastName);
console.log(person1.dob);
console.log(person1.getBrithYear());


// Date

const date = new Date('2-28-1998');
console.log(date);
console.log(date.getDate());
console.log(date.getDay());
console.log(date.getFullYear());
console.log(date.getHours());
// ...etc

// ES6 classes


class Engineer {
    constructor(firstName, lastName, hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hobbies = hobbies;
    }
}
