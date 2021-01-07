# Basic PHP

What distinguishes PHP from something like client-side JavaScript is that the code is executed on the server, generating HTML which is then sent to the client. The client would receive the results of running that script, but would not know what the underlying code was. You can even configure your web server to process all your HTML files with PHP, and then there's really no way that users can tell what you have up your sleeve.

## what is PHP?

"if html had logic" - RAMOUN;

## What can PHP do?

- PHP can generate dynamic page content
- PHP can create, open, read, write, delete, and close files on the server
- PHP can collect form data
- PHP can send and receive cookies
- PHP can add, delete, modify data in your database
- PHP can be used to control user-access
- PHP can encrypt data
- With PHP you are not limited to output HTML. You can output images, PDF files, and even Flash movies. You can also output any text, such as XHTML and XML (like any other O.G porgramming language).

> **Note**: for more visit: [this link](https://www.php.net/manual/en/intro-whatcando.php)

## What is a PHP file? 

- PHP files can contain text, HTML, CSS, JavaScript, and PHP code
- PHP code is executed on the server, and the result is returned to the browser as plain HTML
- PHP files have extension `.php`

## Why PHP?

- PHP runs on various platforms (Windows, Linux, Unix, Mac OS X, etc.)
- PHP is compatible with almost all servers used today (Apache, IIS, etc.)
- PHP supports a wide range of databases
- PHP is free. Download it from the official PHP resource: www.php.net
- PHP is easy to learn and runs efficiently on the server side.    

## What's new in PHP7?

What's new in PHP 7
- PHP 7 is much faster than the previous popular stable release (PHP 5.6)
- PHP 7 has improved Error Handling
- PHP 7 supports stricter Type Declarations for function arguments
- PHP 7 supports new operators (like the spaceship operator: <=>)

## Syntax

### `<?PHP ?>`

The PHP code is enclosed in special start and end processing instructions `<?php` and `?>` that allow you to jump into and out of "PHP mode."

```html
<!DOCTYPE html>
<html>
    <head>
        <title>Example</title>
    </head>
    <body>

        <?php
            echo "Hi, I'm a PHP script!";
        ?>

    </body>
</html>
```

Everything outside of a pair of opening and closing tags is ignored by the PHP parser which allows PHP files to have mixed content. This allows PHP to be embedded in HTML documents, for example to create templates.

```html
<p>This is going to be ignored by PHP and displayed by the browser.</p>
<?php echo 'While this is going to be parsed.'; ?>
<p>This will also be ignored by PHP and displayed by the browser.</p>
```

This works as expected, because when the PHP interpreter hits the ?> closing tags, it simply starts outputting whatever it finds (except for an immediately following newline - see instruction separation) until it hits another opening tag unless in the middle of a conditional statement in which case the interpreter will determine the outcome of the conditional before making a decision of what to skip over. See the next example.
Using structures with conditions

```html
<?php if ($expression == true): ?>
  This will show if the expression is true.
<?php else: ?>
  Otherwise this will show.
<?php endif; ?>
```

In this example PHP will skip the blocks where the condition is not met, even though they are outside of the PHP open/close tags; PHP skips them according to the condition since **the PHP interpreter will jump over blocks contained within a condition that is not met**.

> **Note**: For outputting large blocks of text, dropping out of _PHP parsing mode_ is generally more efficient than sending all of the text through `echo` or `print`.

```html
1.  <?php echo 'if you want to serve PHP code in XHTML or XML documents,
                use these tags'; ?>

2.  You can use the short echo tag to <?= 'print this string' ?>.
    It's always enabled in PHP 5.4.0 and later, and is equivalent to
    <?php echo 'print this string' ?>.

3.  <? echo 'this code is within short tags, but will only work '.
            'if short_open_tag is enabled'; ?>

4.  <script language="php">
        echo 'some editors (like FrontPage) don\'t
              like processing instructions within these tags';
    </script>
    This syntax is removed in PHP 7.0.0.

5.  <% echo 'You may optionally use ASP-style tags'; %>
    Code within these tags <%= $variable; %> is a shortcut for this code <% echo $variable; %>
    Both of these syntaxes are removed in PHP 7.0.0.

// stay safe and use `<?php ?>`
```
> **Note**: PHP 7 removes support for ASP tags and `<script language="php">` tags. As such, **_we recommend only using `<?php ?>` and `<?= ?>` when writing PHP code to maximise compatibility._**

> **Note**: Short tags (example three) are only available when they are enabled via the short_open_tag `php.ini` configuration file directive, or if PHP was configured with the `--enable-short-tags` option.

> **Note**: ASP style tags (example five) are only available when they are enabled via the asp_tags `php.ini` configuration file directive, and have been removed in PHP 7.0.0.

> **Note**: Starting with PHP 5.4, short echo tag `<?=` is always recognized and valid, regardless of the short_open_tag setting.

> **Note**: In PHP 5.2 and earlier, the parser does not allow the <?php opening tag to be the only thing in a file. This is allowed as of PHP 5.3 provided there are one or more whitespace characters after the opening tag.

> **Note**: Using short tags should be avoided when developing applications or libraries that are meant for redistribution, or deployment on PHP servers which are not under your control, because short tags may not be supported on the target server. For portable, redistributable code, be sure not to use short tags.

<br>

When the documentation says that the PHP parser ignores everything outside the <?php ... ?> tags, it means literally **EVERYTHING**. Including things you normally wouldn't consider "valid", such as the following:

```html
<html><body>
<p<?php if ($highlight): ?> class="highlight"<?php endif;?>>This is a paragraph.</p>
</body></html>
```

Notice how the PHP code is embedded in the middle of an HTML opening tag. The PHP parser doesn't care that it's in the middle of an opening tag, and doesn't require that it be closed. It also doesn't care that after the closing `?>` tag is the end of the HTML opening tag. So, if `$highlight` is true, then the output will be:

```html
<html><body>
<p class="highlight">This is a paragraph.</p>
</body></html>
```

Otherwise, it will be:

```html
<html><body>
<p>This is a paragraph.</p>
</body></html>
```

Using this method, you can have HTML tags with optional attributes, depending on some PHP condition. Extremely flexible and useful!

```html
What will be the output you think if we add echo and print both at a time..

<?php

$a = 5;

print print $a;  // prints out: 51     inner 'print' prints the value of $a, then                                                                                                                                     // outer 'print' returns  the boolean true about print $a

echo print $a;  // prints out: 51     inner 'print' prints the value of $a, then
// outer 'echo' returns  the boolean true about print $a

echo echo $a;    // syntax error.. echo doesn't return

print echo $a;     // syntax error.. echo doesn't return

?>
```

<br><br>

#### notes

```html
When the PHP interpreter hits the ?> closing tags, it WON'T output right away if it's inside of a conditional statement:
(no matter if it's an Alternative Syntax or not)

<html>
<?php
$a = 1;
$b = 2;
if ($a === 1) {
    if ($b == 2) {
        ?><head></head><?php
    } else {
        ?><body></body><?php
    }
}
?>
</html>

This would output `<html><head></head></html>`.
Aside from conditional statements, the PHP interpreter also skip over functions! What a surprise!

<html>
<?php
function show($a) {
    ?>
    <a href="https://www.<?php echo $a ?>.com">
    Link
    </a>
    <?php
}
?>
<body>
    <?php show("google") ?>
</body>
</html>

This gives `<html><body><a href="https://www.google.com">Link</a></body></html>`.
These really confused me, because at first I thought it would output any HTML code right away, except for Alternative Syntaxes (https://www.php.net/manual/en/control-structures.alternative-syntax.php). There are more strange cases than I thought.
```

> **Note**: If you have to deal chunks of HTML, then consider having a templating system do the job for you. It is a poor idea to rely on the coding islands method as a template system in any way, and for reasons listed above.

- [php docs](https://www.php.net/manual/en/language.basic-syntax.phpmode.php)

<br>

### Instruction Separation

As in C or Perl, PHP requires instructions to be terminated with a semicolon at the end of each statement. The closing tag of a block of PHP code automatically implies a semicolon; you do not need to have a semicolon terminating the last line of a PHP block. The closing tag for the block will include the immediately trailing newline if one is present.

```html
<?php
    echo 'This is a test';
?>

<?php echo 'This is a test' ?>

<?php echo 'We omitted the last closing tag';
```

```html
Closing tag is optional and some cases omitting the closing tag is very helpful.
1.using include or require function
2.unwanted whitespace will not occur at the end of file
3.add header any time
```

- [php docs](https://www.php.net/manual/en/language.basic-syntax.instruction-separation.php)

### comments

1. single line c++ style comment(`//`)
2. single line Unix shell stype comment(`#`)
3. multi line c style comment(`/*/`)

```html
<h1>This is an <?php # echo 'simple';?> example</h1>
<p>The header above will say 'This is an  example'.</p>
```

```html
Make sure you don't nest 'C' style comments. It is easy to make this mistake if you are trying to comment out a large block of code.

<?php
 /*
    echo 'This is a test'; /* This comment will cause a problem */
 */
?>
```
- [docs on commenting](https://www.php.net/manual/en/language.basic-syntax.comments.php)


### DataTypes

- **Introduction**

    php supports **10** primitive data types:

    + **4** scalar types
        * boolean
        * integer
        * float (aka: double)
        * string
    + **4** compound types
        * array
        * object 
        * callable
        * iterable
    + **2** special types
        * resource
        * NULL
    + **4** pseudo-types
        > **Note**: the pseudo-types are introduced in the php manual for readiblity reasons.

        * mixed
        * number
        * array|object
        * void

        > **Note**: And the pseudo-variable `$...`.

        > **Note**: Some references to the type "double" may remain in the manual. Consider double the same as float; the two names exist only for historic reasons (something like backward compatiblity).        

    **php** is a dynamically loosley typed language. thus The type of a variable is not usually set by the programmer; rather, it is decided at runtime by PHP depending on the context in which that variable is used.

    > **Note**: To check the **type and value** of an expression, use the **`var_dump()`** function.

    > **Note**: To get a human-readable representation of a **type** for **debugging**, use the **`gettype()`** function. To check for a **certain type**, do not use `gettype()`, but rather the **`is_type()`** functions. 

    Some examples:
    ```html
    <?php
    # var_dump();  gettype();  is_type();
    ?>
    ```

    > **Note**: to get in-depth look of php data types see [php various type-related comparisons](https://www.php.net/manual/en/types.comparisons.php).


- **Booleans**

    This is the simplest type. A boolean expresses a truth value. It can be either TRUE or FALSE.

    + syntax

        To specify a boolean literal, use the constants TRUE or FALSE. Both are case-insensitive.

        ```html
        <?php
        $foo = True; // assign the value TRUE to $foo
        $poo = FaLsE; // this works too
        ?>
        ```

    + uses

        > **Note**: Typically, the result of an operator which returns a boolean value is passed on to a [control structure](https://www.php.net/manual/en/language.control-structures.php) (if, switch, ..etc).

        ```html
        <?php
        // == is an operator which tests
        // equality and returns a boolean
        if ($action == "show_version") {
            echo "The version is 1.23";
        }
        
        // this is not necessary...
        if ($show_separators == TRUE) {
            echo "<hr>\n";
        }
        
            // ...because this can be used with exactly the same meaning:
        if ($show_separators) {
            echo "<hr>\n";
        }
        ?>
        ```

    + converting to Boolean

        To explicitly convert a value to boolean, use the (bool) or (boolean) casts. However, in most cases the cast is unnecessary, since a value will be automatically converted if an operator, function or control structure requires a boolean argument.

        > **Note**: see also type juggling.

        * When converting to boolean, the following values are considered FALSE:
            - the boolean FALSE itself
            - the integers 0 and -0 (zero)
            - the floats 0.0 and -0.0 (zero)
            - the empty string, and the string "0"
            - an array with zero elements (empty array)
            - the special type NULL (including unset variables)
            - [SimpleXML](https://www.php.net/manual/en/ref.simplexml.php) objects created from empty tags

            > **Note**: Every other value is considered TRUE (including any **resource** and **NAN**).

            > **Warning**: -1 is considered TRUE, like any other non-zero (whether negative or positive) number!

            > **Tip**: The *correct* design of php would have been that *any* non-empty string is TRUE - period, end of story. For more seaarch for "php best practices".

        * boolean output of operators

            ```html
            <?php
            $x=TRUE;
            $y=FALSE;
            $z=$y OR $x;
            ?>
            
            Is $z TRUE or FALSE?
            <!--$z is FALSE-->
            ```
            > **Note**: the above code is equivalent to `<?php ($z=$y) OR $x ?>` rather than `<?php $z=($y OR $x) ?>` as might be expected - because the `OR` operator has lower precedence than assignment operators.

            ```html
            On the other hand, after this code sequence:
            <?php
                $x=TRUE;
                $y=FALSE;
                $z=$y || $x;
            ?>
            
            $z will be TRUE, as expected, because the || operator has higher precedence than assignment:  The code is equivalent to $z=($y OR $x).
            ```

            > **Note**: This is why you should NEVER use the `OR` operator without explicit parentheses around the expression where it is being used.

        * js booleans vs php booleans

            ```html
            Note for JavaScript developers:

            In PHP, an empty array evaluates to false, while in JavaScript an empty array evaluates to true.

            In PHP, you can test an empty array as <?php if(!$stuff) …; ?> which won’t work in JavaScript where you need to test the array length.

            This is because in JavaScript, an array is an object, and, while it may not have any elements, it is still regarded as something.

            Just a trap for young players who routinely work in both langauges.
            ```

        * boolean automatic conversion

            ```html
            Beware of certain control behavior with boolean and non boolean values :

            <?php
            // Consider that the 0 could by any parameters including itself
            var_dump(0 == 1); // false
            var_dump(0 == (bool)'all'); // false
            var_dump(0 == 'all'); // TRUE, take care
            var_dump(0 === 'all'); // false

            // To avoid this behavior, you need to cast your parameter as string like that :
            var_dump((string)0 == 'all'); // false
            ?>
            ```
            ```PHP
            a = 'a string';
            $b = 0;
            
            if ( $a == true && $b == false && $a == $b ) {
            exit;
            }
            ```

            > **Note**: 'a string' == true equates to true because PHP will evaluate any non empty string to true if compared with a boolean.

            > 0 == false equates to true because the integer 0 is evaluated as false when compared with a boolean.

            > **Note**: '`a string' == 0` evaluates to true because any string is converted into an integer when compared with an integer. If PHP can't properly convert the string then it is evaluated as 0. So 0 is equal to 0, which equates as true. To get around this issue you can use the `===` operator in place of the `==` operator. [link](https://www.hashbangcode.com/article/string-equals-zero-php).

            > **Note**: The type conversion does not take place when the comparison is `===` or `!==` as this involves comparing the type as well as the value.

            ```html
            Just something that will probably save time for many new developers: beware of interpreting FALSE and TRUE as integers.
            For example, a small function for deleting elements of an array may give unexpected results if you are not fully aware of what happens:

            <?php

            function remove_element($element, $array)
            {
            //array_search returns index of element, and FALSE if nothing is found
            $index = array_search($element, $array);
            unset ($array[$index]);
            return $array;
            }

            // this will remove element 'A'
            $array = ['A', 'B', 'C'];
            $array = remove_element('A', $array);

            //but any non-existent element will also remove 'A'!
            $array = ['A', 'B', 'C'];
            $array = remove_element('X', $array);
            ?>

            The problem here is, although array_search returns boolean false when it doesn't find specific element, it is interpreted as zero when used as array index.

            So you have to explicitly check for FALSE, otherwise you'll probably loose some elements:

            <?php
            //correct
            function remove_element($element, $array)
            {
            $index = array_search($element, $array);
            if ($index !== FALSE)
            {
                unset ($array[$index]);
            }
            return $array;
            } ?>
            ```
            ```html
            Beware that "0.00" converts to boolean TRUE !

            You may get such a string from your database, if you have columns of type DECIMAL or CURRENCY. In such cases you have to explicitly check if the value is != 0 or to explicitly convert the value to int also, not only to boolean.
            ```

            ```html
            PHP does not break any rules with the values of true and false.  The value false is not a constant for the number 0, it is a boolean value that indicates false.  The value true is also not a constant for 1, it is a special boolean value that indicates true.  It just happens to cast to integer 1 when you print it or use it in an expression, but it's not the same as a constant for the integer value 1 and you shouldn't use it as one.  Notice what it says at the top of the page:

            A boolean expresses a truth value.

            It does not say "a boolean expresses a 0 or 1".

            It's true that symbolic constants are specifically designed to always and only reference their constant value.  But booleans are not symbolic constants, they are values.  If you're trying to add 2 boolean values you might have other problems in your application.
            ```
            ```html
            It is correct that TRUE or FALSE should not be used as constants for the numbers 0 and 1. But there may be times when it might be helpful to see the value of the Boolean as a 1 or 0. Here's how to do it.

            <?php
            $var1 = TRUE;
            $var2 = FALSE;

            echo $var1; // Will display the number 1

            echo $var2; //Will display nothing

            /* To get it to display the number 0 for
            a false value you have to typecast it: */

            echo (int)$var2; //This will display the number 0 for false.
            ?>
            ```
            > **Note**: For those wondering why the string "0" is falsy, consider that a good deal of input data is actually string-typed, even when it is semantically numeral.PHP often tries to autoconvert these strings to numeral, as the programmer certainly intended (try 'echo "2"+3'). Consequently, PHP designers decided to treat 0 and "0" similarly, ie. falsy, for consistency and to avoid bugs where the programmer believes he got a true numeral that would happen to be truthy when zero.

        * negation trick
            ```html
            Note you can also use the '!' to convert a number to a boolean, as if it was an explicit (bool) cast then NOT.

            So you can do something like:

            <?php
            $t = !0; // This will === true;
            $f = !1; // This will === false;
            ?>

            And non-integers are casted as if to bool, then NOT.

            Example:
            <?php
            $a = !array();      // This will === true;
            $a = !array('a');   // This will === false;
            $s = !"";           // This will === true;
            $s = !"hello";      // This will === false;
            ?>

            To cast as if using a (bool) you can NOT the NOT with "!!" (double '!'), then you are casting to the correct (bool).

            Example:

            <?php
            $a = !!array();   // This will === false; (as expected)
            /*
            This can be a substitute for count($array) > 0 or !(empty($array)) to check to see if an array is empty or not  (you would use: !!$array).
            */

            $status = (!!$array ? 'complete' : 'incomplete');

            $s = !!"testing"; // This will === true; (as expected)
            /*
            Note: normal casting rules apply so a !!"0" would evaluate to an === false
            */
            ?>
            ```
        * precedence benfits
        
            ```html
            Note on the OR operator.

            A previous comment notes the trap you can fall into with this operator. This is about its usefulness.

            Both OR and || are short-circuited operators, which means they will stop evaluating once they reach a TRUE value. By design, OR is evaluated after assignment (while || is evaluated before assignment).

            This has the benefit of allowing some simple constructions such as:

            <?php
                $stuff=getStuff() or die('oops');
                $thing=something() or $thing=whatever();
            ?>

            The first example, often seen in PERL, could have been written as <?php if(!$stuff=getStuff()) die('oops'); ?> but reads a little more naturally. I have often used it in situations where null or false indicate failure.

            The second allows for an alternative value if a falsy one is regarded as insufficient. The following example

            <?php
                $page=@$_GET['page'] or $page=@$_COOKIE['page'] or $page=1;
            ?>

            is a simple way sequencing alternative values. (Note the usual warnings about using the @ operator or accepting unfiltered input …)

            All this presupposes that 0 is also an unacceptable value in the situation.
            ```
