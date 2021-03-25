input = gets
input = input.upcase()
output = ""

input.each_char {
    |c|
    if c==" "
        c += "  "
    else 
        c += " "
    end
    output += c
}

puts output
