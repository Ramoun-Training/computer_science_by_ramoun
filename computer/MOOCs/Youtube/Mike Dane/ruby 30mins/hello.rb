# P R I N T I N G
print 'HELLO, '
puts "ruby"


# V A R I A B L E S
name = 'ramoun'
age = 22
puts "my name is " + name
puts "I am #{age} years old"


# C A S T I N G   &   C O N V E R T I N G
salary = 70000.00
puts "My salary is " + salary.to_s


# S T R I N G S
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
puts sample_text.include? ("am")  # true


# N U M B E R S
num1 = 10
num2 = num1
num2 += 100.8

puts num1 / 3.0 # returns decimal
puts num2.round()
puts Math.sqrt(144)


# U S E R    I N P U t
puts "Enter first Number: "
num1 = gets.chomp
puts "Enter second Number: "
num2 = gets().chomp()
puts "Result = #{num1.to_f + num2.to_f}"


# A R R A Y S
arr = [1, 2, 'hello', 3.0, 4, 6, 7, 10]

puts arr[-1]
arr[1] = 2.0
print arr
print arr[2,3]
puts
print arr[2..4]


# N - D I M E N T I O N A L    A R R A Y S
number_grid = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
puts
print number_grid
puts


# A R R A Y    M E T H O D S
friends = []
friends.push('soso')
friends.push('lolo')
friends.push('nono')

print friends
puts
print friends.reverse
print friends # doesn't affect the original array
puts
print friends.sort # sorts alphabetically (if all elements are strings)
puts
print friends.pop # removes the last element
puts
print friends.include? 'nono'
puts


# M E T H O D S
def add_nums(num1, num2=10)
    return num1 + num2
end

result = add_nums 10
puts result


# I F    S T A T E M E N T S
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


# S W I T C H    S T A T E M E N T
# a special type of if statement

grade = "A"

case grade
    when "A"
        puts 'great'
    when "B"
        puts 'good'
    else
        puts 'not good'
end


# D I C T I O N A R I E S
student = {
    :name => 'ramoun',
    "age" => 22,
    3 => "hello"
}

puts student[:name]
puts student["age"]
puts student[3]


# W H I L E    L O O P
index = 0
while index <= 10
    puts index
    index += 1
end


# F O R    L O O P
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


# E X C E P T I O N    C A T C H I N G
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


# C L A S S E S
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


# C O N S T R U C T O R S
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


# G E T T E R S    A N D    S E T T E R S
