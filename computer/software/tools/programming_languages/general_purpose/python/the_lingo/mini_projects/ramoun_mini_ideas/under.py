'''
for more about remving non-alphanumeric symbols from a string in python checkout these:
    1. https://stackoverflow.com/questions/1276764/stripping-everything-but-alphanumeric-chars-from-a-string-in-python 
    2. https://www.kite.com/python/answers/how-to-remove-all-non-alphanumeric-characters-from-a-string-in-python#:~:text=Use%20filter()%20to%20remove,predicate%2C%20iterable)%20with%20str.
'''
import sys
import re
import os


def replace_camel_with_space(title):
    title_splitted = re.split('(?=[A-Z])', title)

    return ' '.join(title_splitted)


def replace_space_with_under(title_splitted):
    return '_'.join(title_splitted)


# def remove_non_alnum(title_splitted):
#     title_with_no_non_alnums = []

#     for word in title_splitted:

#         if word.isalnum():
#             # if '_' in word:
#             #     word = word.replace('_', '')
#             # word = re.sub(r'\W+', '', word)

#             title_with_no_non_alnums.append(word)

#   return title_with_no_non_alnums


def replace(title):

    # removing the extension
    title, extension = os.path.splitext(title)

    # removing the starting '.'
    if title.startswith('.'):
        dot, title = title[0], title[1:]
    else:
        dot = ''

    # checking if the title is all uppercase or not
    if title.isupper():
        return title + extension

    # splitting the title on non-alnums
    title = ' '.join(title.split('_'))
    title = re.split(r'\W+', title)

    # removing non-alnums
    # title = remove_non_alnum(title_splitted)

    # split words on camelCase
    # title = replace_camel_with_space(title)    
    title_splitted = [re.split('(?=[A-Z])', word) for word in title if word != '']
    [word.remove(empty) for word in title_splitted for empty in word if empty == '']
    title_splitted = [single_word for word in title_splitted for single_word in word]

    # replace space with '_'
    title = replace_space_with_under(title_splitted)

    # make all lowercase
    title = title.lower()

    # adding the extension and the starting '.' again
    title = dot + title
    title += extension

    return title


if __name__ == '__main__':

    title = ' '.join(sys.argv[1:])
    title = replace(title)

    # title = 'sir.M_Rg/ol.text'
    # title = 'README.md'

    print(replace(title))


# re.split('(?=[A-Z])', 'theLongAndWindingRoad') -> for splitting a str at uppercase
# re.findall('[A-Z][a-z]*', 'TheLongAndWindingRoad') -> another way
