---
runme:
  id: 01HWV22P91M5619HMPBTNYXF1H
  version: v3
---

# Regular Expressions (Regex)

a way to search for patterns in strings.

> **Warn**: Regex can be incredibly intimidating at the beginning due to their weird syntax

> **Note**: Regex are used with "urls" in django.

## module

in order to use regex in python, you have to import the built-in `re` package.

```py
import re
```

### methods

#### `re.search`

```python {"custom":"[object Object]","id":"01HWV2C51SQFVFASQA1D38NNNS"}
import re

patterns = ['pattern1', 'pattern2']
text_to_be_parsed = 'i really want you to search for pattern1 but not the other one'

for pattern in patterns:
    print(f'searching for {pattern}:')
    match = re.search(pattern, text_to_be_parsed)
    # put in your mind that match is an object that contains all details about the match such as where it was found
    if match:
        print(f'Found it at {match.start()} index')
    else:
        print("Couldn't find it")

```

#### `re.split`

```python {"custom":"[object Object]","id":"01HWV2VK8Y5HV09VN697AMS1E5"}
import re

email = 'soso@omar.com'

user, domain = re.split("@", email)
print(user) #=> soso
print(domain) #=> omar.com

```

#### `re.findAll`

finds all instances of a pattern in a string

```python {"id":"01HWV339PGPSKNH54A20WQSPAR"}
import re

print(re.findall('match', 'i like to match when i watch the match'))
```

### Meta Character Syntax

#### `*` (repetition) [>= 0]

a pattern followed by the `*` is repeated zero or more times

```python {"id":"01HWV3C43P99E98STXMMX4T0RV"}
import re

def find_all_patterns(patterns, text):
    for pattern in patterns:
        print('searching for the pattern: ', pattern)
        print(re.findall(pattern, text))
        print('\n')

text = 'sdsd. sssddd. sdddsddd.. dsds...dssssss...sddddd'
patterns = ['sd*'] # looking for and 's' followed by a "zero or more" 'd's

find_all_patterns(patterns, text)
'''
searching for the pattern:  sd*
['sd', 'sd', 's', 's', 'sddd', 'sddd', 'sddd', 'sd', 's', 's', 's', 's', 's', 's', 's', 'sddddd']
'''
```

#### `+` (repetition) [>= 1]

```python {"id":"01HWV3QMH9F92PKSQM768A6FWF"}
import re

text = 'sdsd. sssddd. sdddsddd.. dsds...dssssss...sddddd'
pattern = 'sd+' # looking for and 's' followed by a "one or more" 'd's

print(re.findall(pattern, text)) # ['sd', 'sd', 'sddd', 'sddd', 'sddd', 'sd', 'sddddd']
```

#### `?` [0 or 1]

```python {"id":"01HWV4307P8FKZ4QWKYXGQC9C5"}
import re

text = 'sdsd. sssddd. sdddsddd.. dsds...dssssss...sddddd'
pattern = 'sd?' # looking for and 's' followed by a "one or zero" 'd's

print(re.findall(pattern, text)) #['sd', 'sd', 's', 's', 'sd', 'sd', 'sd', 'sd', 's', 's', 's', 's', 's', 's', 's', 'sd'] 
```

#### `{}` Custom Number

```python {"id":"01HWV468Z59VXY9RP0GVNAVGR9"}
import re

text = 'sdsd. sssddd. sdddsddd.. dsds...dssssss...sddddd'
pattern = 'sd{1,3}' # looking for and 's' followed by a "one or three" 'd's

print(re.findall(pattern, text)) # ['sd', 'sd', 'sddd', 'sddd', 'sddd', 'sd', 'sddd']
```