# Ruby in 30 minutes

ruby is a dynamically typed language.

ruby was designed to be simple at its core and to be a true oop language (objects in ruby are fully inegrated into the language and not tacked on as a glorified add-on).

ruby focuses on the programmer and not the machine.

ruby code is interpreted (da!! a scripting language) but some implementations of ruby are compiled and run on a vm.

most popular interpretr is called mri (matz's ruby interpreter).

ruby utlizes a garbase collector.

## Printing

- `puts`: (put string) prints a new line at the end.
- `print`: doesn't print a new line at the end.

## Variables

- Names are case-sensitive and may begin-with: Letters, _
- After, may include: Letters, Numbers,_
- Convention says:
  - use snake_naming (start with lowercase word, then additional words are lowercase seperated by underscores)

```ruby
name = 'ramoun' # strings
age = 21        # integer
gpa = 3.5       # decimal
is_tall = true  # boolean
```

### Printing Variables on the screen

```ruby
puts "my name is #{ramoun}"
puts "I am " + age + " years old"
```

## Casting & Converting

```ruby
puts 3.13.to_i # to integer
puts 3.to_f    # to float
puts 3.0.to_s  # to string
```

> **Note**: ruby doesn't support implicit conversiont to strings during concatenation.

## Strings

### String Methods

```ruby
sample_text = "sample text"

puts sample_text.length           # 11
puts sample_text[0]               # s
puts sample_text[-1]              # t
puts sample_text[0..-1]           # sample text
puts sample_text[0...-1]          # sample tex
puts sample_text[0,3]             # sam
puts sample_text[0...3]           # sam
puts sample_text.include? "am"    # true
puts sample_text.include? ("am")  # true
```

> for more, search "Ruby String API"

## Numbers

### Basic Operations

```ruby
puts 3 * 4     # Basic Arithmatic
puts 3 ** 4    # Exponent
puts 3 % 4     # modulus
puts 3 + 4 / 4 # order of operations
puts 10 % 3.0  # ints and doubles
```

### Accumulations and such

```ruby
num = 10
num += 100
```

### Numbers Methods

```ruby
num = -200.8
puts num.abs()
puts num.round()
```

### Math Class

````ruby
puts Math.sqrt(144)
puts Math.log(0)
````

## User Input

```ruby
# .chomp: removes that extra newline character
puts "Enter first Number: "
num1 = gets.chomp
puts "Enter second Number: "
num2 = gets().chomp()
puts "Result = #{num1.to_f + num2.to_f}"
```

## Arrays

- since ruby is dynamic, you can store objects with different data types in the same array.

### Accessing & Manip

```ruby
arr = [1, 2, 'hello', 3.0]

puts arr[-1]
arr[1] = 2.0
print arr # puts, prints each element on a seprate line
print arr[2,3] # start at index 2 and grap the first 3 elements
print arr[2..-1] # grap elements starting from index 2 to the end of the array
print arr[2..10] # indexoutofrange? hahaha, of course not, it is gonna grap elements until it reaches the end of the array and then stops
```

> **Note**: same string slicing rules apply on arrays too.

### N-Dimentionals Arrays

```ruby
number_grid = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

### Array Methods

```ruby
friends = ['soso', 'lolo']
print friends.push 'toto'
print friends.reverse
print friends # doesn't affect the original array
print friends.sort # sorts alphabetically (if all elements are strings)
print friends.pop # removes the last element
print friends.include? 'nono'
```

## Methods

```ruby
def add_nums(num1, num2=10)
    return num1 + num2
end

result = add_nums 10
puts result
```

## if statements

```ruby
is_ramoun = true
is_happy = true

if is_ramoun and is_happy
    puts "ramoun is happy"
elsif is_ramoun and !is_happy
    puts "sorry, about that. Everything is gonna be alright"
else 
    puts "sorry, you are not ramoun"
end

if "a" < "b"
    puts "a comes before b in the alphabet (65, 66)"
end
```

## Switch Statement

```ruby
grade = "A"

case grade
    when "A"
        puts 'great'
    when "B"
        puts 'good'
    else
        puts 'not good'
end
```

## Dictionaries

```ruby
student = {
    :name => 'ramoun',
    "age" => 22,
    3 => "hello"
}

puts student[:name]
puts student["age"]
puts student[3]
```

## While Loop

```ruby
index = 0
while index <= 10
    puts index
    index += 1
end
```

## For Loop

```ruby
for i in 0..5
    puts i
end

4.times do |index|
    puts index
end

names = ['mike', 'stan', 'ramoun']
for name in names
    puts name
end

names.each {|name|
    puts name
}
```

## Exception Catching

```ruby
begin
    num = 10 / 0
rescue
    puts "error"
end

begin
    x = 3 + "3"
rescue => exception
    puts "implicit conversion error"
end

begin
    puts unknown_variable
    x = 10 / 0
rescue => ZeroDivisionError
    puts "zero division"
rescue
    puts "error"
end

raise "made up exception"
```

## Classes

```ruby
class Book
    attr_accessor :title, :author

    def read_book()
        puts "Reading #{self.title} by #{self.author}"
    end
end

book1 = Book.new()
book1.title = "Beginning Programming with Java for dummies"
book1.author = "barry Burd"

book1.read_book
```

## Constructors

```ruby
class Car
    attr_accessor :num_of_wheels, :color

    def initialize num_of_wheels, color
        @num_of_wheels = num_of_wheels
        @color = color
    end

    def start_engine
        puts "the #{self.num_of_wheels} are rolling"
    end
end

car = Car.new(4, "red")
```

## Getters and Setters
