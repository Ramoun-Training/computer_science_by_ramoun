welcome
>>> print('\a ok\a ok \a')
 ok ok 
>>> print("somthing\b")
somthing
>>> print("copy\cx")
copy\cx
>>> print("wee \fcame")
wee came
>>> print("new \n line")
new 
 line
>>> print("carriage \rreturn")
carriage return
>>> print("noe \rwor")
noe wor
>>> print("carriage return")
carriage return
>>> print("winrar\sBros")
winrar\sBros
>>> print('the\ttab\teffect')
the	tab	effect
>>> print('ehat\visthat')
ehatisthat
>>> 'dir'+'ection'
'direction'
>>> 'co'*2
'coco'
>>> 'co'*2+'pops'
'cocopops'
>>> 'cocopops'[5]
'o'
>>> 'cocopops'[4]
'p'
>>> 'cocopops'[0:4]
'coco'
>>> 'cocopops'[3:]
'opops'
>>> 'cocopops'[4:]
'pops'
>>> 'cocopops'[:4]
'coco'
>>> 'cgi'[0:3,2]
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: string indices must be integers
>>> 'cocopops'[3:5:6]
'o'
>>> 'cocopops'[:5:2]
'ccp'
>>> 'cocopops'[2::2]
'cpp'
>>> 'cocopops'[2,4,6]
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: string indices must be integers
>>> 'cocopops'[2,3]
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: string indices must be integers
>>> 'cocopops'[::2]
'ccpp'
>>> for xx in range(,29,2):
  File "<stdin>", line 1
    for xx in range(,29,2):
                    ^
SyntaxError: invalid syntax
>>> '''
... c:character
... d:decimal
... s:string
... f:float
... '''
'\nc:character\nd:decimal\ns:string\nf:float\n'
>>> '''
... f:flaotr
... c:character
... d:integers
... s:string
... '''
'\nf:flaotr\nc:character\nd:integers\ns:string\n'
>>> '%2.2f'%(234l.5467)
  File "<stdin>", line 1
    '%2.2f'%(234l.5467)
                ^
SyntaxError: invalid syntax
>>> print('%.2f'%(234.23434))
234.23
>>> print('%.2f'%34.35432)
34.35
>>> print('%.2f'%34.354732)
34.35
>>> print('%.2f'%34.357732)
34.36
>>> print('%2.2f'%343.354732)
343.35
>>> print(r'c:\pyton34\python')
c:\pyton34\python
>>> 
>>> print(u'that is very good')
>>>   File "<stdin>", line 1
    >>> print(u'that is very good')
     ^
SyntaxError: invalid syntax
>>> print('philip'.capitalize())
Philip
>>> print('i am interested in shouting'.upper())
I AM INTERESTED IN SHOUTING
>>> len('let\'s see how many characters are these?')
40
>>> len(55.66.4.4)
  File "<stdin>", line 1
    len(55.66.4.4)
              ^
SyntaxError: invalid syntax
>>> len(3490)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: object of type 'int' has no len()
>>> len(9)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: object of type 'int' has no len()
>>> len(['what','the'])
2
>>> 