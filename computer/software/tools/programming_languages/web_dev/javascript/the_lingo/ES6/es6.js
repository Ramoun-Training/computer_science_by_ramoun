// var // JS
for(var i = 0; i < 5; i++){
    console.log(i);
}
console.log(i);

// let // ES6
for(let j = 0; j < 5; j++){
    console.log(j);
}
// console.log(j) // j is not defined

// const // ES6
// for(const i = 0; i < 5; i++){
//     console.log(i) // constants can not be changed
// }
// console.log(i)

// objects // JS
const designer = {
    name: 'ramoun',
    // mehtod (function of an object)    
    age: 22,
    programs: function (){
        console.log('photoshop');
    }
}
console.log(designer.name);
console.log(designer.programs());
designer.programs();

// objects //es6
const designer2 = {
    name: 'ramoun',
    // mehtod (function of an object)    
    age: 22,
    programs(){
        console.log('photoshop');
    }
}
console.log(designer2.name);
console.log(designer2.programs());
designer2.programs();

// this // JS
const Employee = {
    name: 'ramoun',
    apply_raise(){
        console.log(this);    
    }
}
Employee.apply_raise()

apply_raise = Employee.apply_raise();
console.log(apply_raise)

apply_raise = Employee.apply_raise;
console.log(apply_raise)
apply_raise()

// solving the problem
const apply_raise_binded = Employee.apply_raise.bind(Employee);
apply_raise_binded()

// arrow functions (=>) // JS
const square =  function (n){
    return n * n;
}

console.log(square(3))

// arrow functions (=>) // ES^
const square2 = (n) => {
    return n * n;
}
console.log(square2(5))

// if only one parameter
const square3 = n => {
    return n * n;
}

// if only one line of code
const square4 = n =>
    n * n
console.log(square4(10))    

//or
const square5 = n => n * n;

// real-world exaple of an arrow function
const developers = [
    {name: 'ramoun', free: false},
    {name: 'mike', free: true}
];

console.log(developers[1])

const freeDevelopers = developers.filter(function (developer) {
    return developer.free;
});
console.log(freeDevelopers[0].name)


const nonFreeDevelopers = developers.filter(developer => !developer.free);
console.log(nonFreeDevelopers[0].name)

// DOM Functions
const artist = {
    skills() {
        setTimeout(function() {
            console.log(this)
        }, 3000) 
    }
}
artist.skills() // returns the window

// JS way of solving this problem
const singer = {
    skills() {
        var that = this;
        setTimeout(function() {
            console.log(that)
        }, 3000) 
    }
}
singer.skills() 

// ES6 way for solving this problem
const actor = {
    skills() {
        setTimeout(() => {
            console.log(this);
        },400)
    }
}
actor.skills();


// Arrays
// JS way
const names = ['ramoun', 'mike', 'mario'];
const items = [];

for (let i = 0; i < names.length; i++) {
    let listItem = "<li>" + names[i] + "</li>";
    items.push(listItem);
}
console.log(items);

// Another simpler JS way
list = []
names.forEach((name) => {
    list.push("<li>" + name + "</li>");
})
console.log(list);

// ES6 way (using the map)
const list_of_items = names.map(name => "<li>" + name + "</li>");
console.log(list_of_items);

// another simpler ES6 way
const lis = names.map(name => `<li>${name}</li>`);
console.log(lis);

// a very good tip
// when writing multi-line html code    
const listy = names.map(name => `<li class='${name}'        
                                   id='${name}'>
                                   ${name}
                               </li>`);
// note: that won't work without the ``
console.log(listy);


// object destructuring

const director = {
    first: 'ramoun',
    last: 'python',
    age: 23
}

// const first = director.first;
// const last = director.last;
// const age = director.age;

// creating a new object
const {first, last, age} = director;
console.log(first);

const {first:f, last:l, age:a} = director;
console.log(a);

const {last: lolo} = director;
console.log(lolo);

const {fofo,lele,aa} = director;
console.log(fofo);


// Array Spread

// traditional JS way to concatenate 2 arrays

const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const arr3 = [7, 8, 9];

const arrays = arr1.concat(arr2);
const biggerArrays = arrays.concat(arr3);

console.log(arrays);
console.log(biggerArrays);

// as you can see the traditional way is very tedious
// the new ES6 way
arrayOfArrays = [arr1, arr2, arr3];
betterArrays = [...arr1, 'this', ...arr2, 'is', ...arr3, 'cool'];
console.log(betterArrays);

// same stuff for objects (objects spreading)
const obj1 = {name: 'ramoun', age: 23};
const obj2 = {name: 'soso', age: 20};

const objects = {...obj1, ...obj2, country: 'my rubuplic'};
const objectOfObjects = {obj1, obj2};

// watch out the overriding
console.log(objects);
console.log(objectOfObjects);



// -----------------------------------------------------------------
// Classes 

// let's create an object first
const obj_1 = {
    name: 'object 1',
    info(){
        console.log('this is comming from object 1');
    }
};

const obj_2 = {
    name: 'object 2',
    info(){
        console.log('this is comming from object 2');
    }
};

// as you can see, very tidious and not effiecient, so classes are needed
// let's create a class
class Laptop {
    constructor(model, year, company) {
        this.model = model;
        this.year = year;
        this.company = company;
    }

    getInfo() {
        return `model:${this.model}, year:${this.year}, company: ${this.company}`;
    }
}

// instanciating the class
dell_laptop = new Laptop('d-123', 2018, 'Dell');
console.log(dell_laptop.getInfo());


// ---------------------------------------------------------------
// Inheritance

class Phone extends Laptop {
    color = 'black';

    getColor() {
        return this.color;
    }
}

myphone = new Phone('iph-12', 2019, 'motorola');
console.log(myphone.getInfo());
console.log(myphone.getColor());

//-----------------------------------------------------------
// super()

class Tabet extends Phone {
    constructor(model, year, company, os) {
        super(model, year, company);
        this.os = os;
    }
}

mytab = new Tabet('tb-22', 2018, 'motorola', 'android');
console.log(mytab.getColor());
console.log(mytab.getInfo());
console.log(mytab.os);
mytab.mac = 'aa:bb:cc:dd:ee:ff';
console.log(mytab.mac);

//-----------------------------------------------------------
// modules

// don't forget to change the type of script in the html file to `module`.

//-----------------------------------------------------------
// export

//named export: {}
// default export: 
// from React, {compnent} import 'react'