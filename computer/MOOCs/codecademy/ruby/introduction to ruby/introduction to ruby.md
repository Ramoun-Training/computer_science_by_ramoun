# introduction to Ruby

## Everything in ruby is an object

Because everything in Ruby is an object (more on this later), everything in Ruby has certain built-in abilities called methods. You can think of methods as “skills” that certain objects have. For instance, strings (words or phrases) have built-in methods that can tell you the length of the string, reverse the string, and more.

> Note: We also promised to tell you more about the interpreter. The interpreter is the program that takes the code you write and runs it. You type code in the editor, the interpreter reads your code, and it shows you the result of running your code in the console.

> **Note**: you can chain mehtod calls in ruby.

## `.length`

Methods are summoned using a `.`. If you have a string, "I love espresso", and take the `.length` of it, Ruby will return the length of the string (that is, the number of characters—letters, numbers, spaces, and symbols). Check it out:

```ruby
"I love espresso".length
# ==> 15 
```

> **Note**: Taking the length of input can be useful if, for example, you want to make a website that takes credit card payments. Ruby can check to make sure the credit card number appears to be valid.

## `.reverse`

The `.reverse` method is called the same way `.length` is, but instead of asking Ruby to tell you how long a string is, it spits out a backwards version of the string you gave it. For instance,

```ruby
"Eric".reverse

# will result in
# "cirE"
```
> **Note**: Reversing input can be useful if you want to sort a list of values from highest to lowest instead of lowest to highest. (We’ll get to sorting in later lessons.)

## `.upcase` & `.downcase`

Let’s try one more method (er, two methods). As you might have guessed, the `.upcase` and `.downcase` methods convert a string to ALL UPPER CASE or all lower case, respectively.

## Single-Line Comments

You probably saw us use the `#` sign a few times in earlier exercises. The `#` sign is for comments in Ruby. A comment is a bit of text that Ruby won’t try to run as code: it’s just for humans to read. __Writing good comments not only clarifies your code for other people who may read it, but helps remind you of what you were doing when you wrote the code days, months, or even years earlier.__

The `#` sign should come before your comment and affects anything you write after it, so long as you’re on a single line. (We’ll show you how to do multi-line comments in a second.) Check out these examples:

```ruby
# I'm a full line comment!
"Eric".length # I'm a comment, too!
```

The second example will return `4`, since the comment comes after the code that Ruby will execute.

## Multi-Line Comments

You can write a comment that spans multiple lines by starting each line with a `#`, but there’s an easier way. If you start with `=begin` and end with `=end`, everything between those two expressions will be a comment. Take a look at this example:

```ruby
=begin
I'm a comment!
I don't need any # symbols.
=end
```

> **Note**: Don’t put any space between the `=` sign and the words begin or end. You can do that with math (`2 + 5`is the same as `2+5`), but in this case, Ruby will get confused. `=begin` and `=end` also need to be on lines all by themselves, just as shown above.

## Naming Conventions

There are many different kinds of variables you’ll encounter as you progress through these courses, but right now we’re just concerned with regular old local variables. By convention, these variables should:
- start with a lowercase letter.
- words should be separated by underscores, like `counter` and `masterful_method`. 

> **Note**: Ruby won’t stop you from starting your local variables with other symbols, such as _capital letters_, `$`s, or `@`s, __but by convention these mean different things__, so it’s best to avoid confusion by doing what the Ruby community does.