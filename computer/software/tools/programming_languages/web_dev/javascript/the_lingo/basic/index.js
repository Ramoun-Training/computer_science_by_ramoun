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