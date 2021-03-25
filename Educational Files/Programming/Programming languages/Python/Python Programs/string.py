'''
string1='string1'
string2="say it ,say it say"
print(string1[1])
print(string2[0:4])
print('love'[:1]+'ike')
_______________________________________________________
WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW
Escape character:
=================
------------------------------------------------
Notation |Decribtion
------------------------------------------------
\a       |alert{no-effect}
\b		   |backspace{no-effect}
\cx,\C-x |control-x(unavailable)
\e       |escape(unavailable)
\f       |formfeed{no-effect}
\n       |newline
\r       |carriage return{no-effect}
\\       |backslash
\s       |space(unavialable)
\t       |tab
\v       |vertical tab{no-effect}
------------------------------------------------

><><><><><><><><><><><><><><><><><><><><><><><><><><><><
string operator:
================

+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-
operator - describtion
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-
    +    - concatenation
    *	   - repeatation
   [ ]   - slicing
   [:]   - range slicing
    %    - formatting
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-

.........................................................
String Formatting operaors:
===========================

++++++++++++++++++++++++++++++++++++++++++++++++
symobol | conversion
++++++++++++++++++++++++++++++++++++++++++++++++
%c*		  | character
%s*     | string conversion with str prior to formattin
%i      | signed decimal integers
%d*     | signed decimal integers
%u      | unsigned decimal integers
%o      | octal integers
%x-%X   | hex decimal intgers
%e-%E   | exponintial notation
%f*     | floating point real number
%g-%G   | - 
++++++++++++++++++++++++++++++++++++++++++++++++
#d:string  s:string  f:flaot  c:character
#ex:%2.2f
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
String Special Characters:
==========================
 r:shows the string as it is and escape characters are not converted
   to its printable form
 u:converts the string t unicode 
 #normal strngs in python are sorted internally as 8-bit ascii
 #while unicode strings are sorted as 16-bit 

 +=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+
 Built-in Strings Methods(functions):
 ====================================
 ____________________________________________________
 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 Methods(functions) |: Describtion
 ____________________________________________________
 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 capitalize() |:makes the first letter in upper 
 			        | caps.
 upper()      |:converts the string to uppercase.
 len(x,[y])   |:counts the number of digits in a
 			        | string or number of elements in
 			        | lists.
 lower()      |:converts the string to lowercase.
 max(x)       |:max vlaue of numbers,
 			        | max value of strings(z>a,z>Z)
 min(x)       |:min value of numbers,
 			        | min value of strings(a>z,A>a)
 swapcase()   |:It just swaps cases.
 ***************************************************
 islower()    |:checks if the string in lowercase.
 isalpha()    |:checks if the string is alphabetical,
 			        | alpha means letters only no spaces or
 			        | numbers.
 isnumeric()  |:checks if the string is a int mumber
 			        | with no spaces or floating point.
 isdigit()    |:checks if the string is a int mumber
 			        | with no spaces or floating point.
 isupper()    |:checks if the string is uppercase.
 isspace()    |:checks if the string contains only
 			        | spaces no characters ,no digits.
 isdecimal()  |:checks if string is decimal.
 lstrip()     |:removes all leading whitespace in str.
 rstrip()     |:removes all trailing whitespace in str.
 isalnum()    |:it is just like isalpha and isdigit 
              | together.
 isalpha()    |:checks if a string contains only one
              | word with no spaces or numbers.
 istitle()    |:checks if the string is Titled.
 ****************************************************
 center()     |:
 count('x',   |:counts how many times a str(x) appear 
 beg=0,end=l) | in string.ex:'string'.count('str')
 endswith('x',|:checks if a string ends with a suffix
 beg=0,end=l) | 'x',returns True or False.
 expandtabs(  |:expands tabs in a string to 8 by 
 tabsize=x)   | default if x is not provided.    
 replace(old, |:replaces all occurrences of old in
 new,[,max])  | string with new or at most max 
 			        | occurrence if max given.
 startswith('x|:checks if a string starts with a suffix
 ',beg=0,end=l| 'x',returns True or False.
 title()      |:returns title cased version of string
 find('x')    |:returns 0 if found and -1 if not.
 split()      |:rerurns a version of a string split-
              | ed in a list according to spaces.
 splitlines() |:rerurns a version of a string split-
              | ed in a list according to \n.
 ____________________________________________________
 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

#the .notation means it works only with strings(methods)
#like :.capitalize(),.upper()
#but the other functions like :len(),max()
#can work with other types like integers,lists.
#when using one of the methods like :lower(),lstrip()
#they return another version of the given string.
'''
Best wishes R}am#un>