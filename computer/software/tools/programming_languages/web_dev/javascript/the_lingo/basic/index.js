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