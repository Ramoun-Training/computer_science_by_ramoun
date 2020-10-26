# PHP

this is a brief of bucky's php tuts by phpacademy

> **Note**: php is a c-like language (e.g: c#, javascript, java)

## general notes

### XAMP

- xamp comes pre-bundled with mysql and apache web server.

### php.ini

php.ini is the configuration file of php (very important file especially in the production phase)

## `echo` and `print`

- `echo` and `print` both are language constructs and not functions.
- `echo` can take multiple args
- `print` can only take one arg (you can overcome this using concatenation).
- you can output html code in phph
- php ("`<?php ?>`") (ex: `echo '<input type="text" value"<?php echo $variable ?>"'`)

## error reporting
you can configure error reporting for production phase in the php.ini file.

## concatenation

- concatenation use `.` (e.g: `$x.$y`)
- implicit conversion in concat. is not possible unless you use variable names and not literals. 
- shorthand (`$x .= $y`)

## quotation

- `''` single quotation marks are faster because they don't look for variables inside of 'em but it's hard for variable replacement (e.g: `echo 'this is '.$name.' and he is '.$age;`)
- `""` double quotation marks are slower but they ar very easy for variable replacement (e.g: `echo "i am $name and i am $age years old."`)

## logical operators

```php
$upper = 1000;
$lower = 500;
$number= 700;

if ($number > $lower && $number < $upper) {
    echo 'this number fits in';
} else if ($number>=$lower and $number<=$upper) {
    echo 'this number is on the edges';
}
```

## `==` vs `===` 

- `==` : compares values only
- `===`: compares values and data types

> **Note**: we have to tell the difference between a number and a graphical representation of a string number;

## loops

- while()
    ```php
    $counter = 0;
    while ($counter <= 10) {
        echo 'hello<br>';
        $counter++;
    }
    ```
- do..while()
    ```php
    $counter = 0;
    do {
        echo 'this line will be executed no matter what at least once';
    } while ($counter < 10);
    ```
- for()
    ```php
    // for is a shorthand for while
    for ($var=0; $var<=10; $var++) {
        echo 's';
    }
    ```

## switch    

one of the c-inherited flow-contorl structures (it is cleaner than `if`)

```php
$num = 33;

switch ($num) {
    case 1: 
        echo 'this is one';
    case 2: 
        echo 'this is two';
    case 3:
        echo 'this is 3';
        break;
    default: 
        echo "it is $num";
}
```

> **Note**: hen you have no break in between two cases, it's called "falling through".

## semicolon

like any other programming lanuge that uses semicolons, the semicolon can be ommited if there's only one line of code.

## precedence

1. assignment

1. arithmatic
    - `()`
    - `/ * %` 
    - `+ -`
1. comparison
    - `=== == != <>`
    - `> < >= <=`
1. logical
    - `not !`
    - `and &&`
    - `or ||`

## php functions

- syntax

    ```php
    function funcName($arg1, $arg2) {
        echo 'void';
        return 'something';
    }
    ```


### - `die()` and `exit()`

used to exit the program immeditaly (optional: with an error msg)

```php
echo 'hi';
die();
echo 'why';
```

```php
@mysqli_connect("localhost", "root", "") or die("an error occured");
```

### - `preg_match()`

regular expressions matching

```php
$string = 'this is real';

if (preg_match('/is/', $string)) {
    echo 'matching';
} else {
    echo 'not matching';
}

```

### - `phpinfo()`