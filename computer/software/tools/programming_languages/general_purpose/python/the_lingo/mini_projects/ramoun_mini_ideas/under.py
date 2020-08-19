'''
for more about remving non-alphanumeric symbols from a string in python checkout these:
    1. https://stackoverflow.com/questions/1276764/stripping-everything-but-alphanumeric-chars-from-a-string-in-python 
    2. https://www.kite.com/python/answers/how-to-remove-all-non-alphanumeric-characters-from-a-string-in-python#:~:text=Use%20filter()%20to%20remove,predicate%2C%20iterable)%20with%20str.
'''
import sys
import re

title = ' '.join(sys.argv[1:]).lower()


def replace_space_with_under(title):
    title_splitted = title.split()
    final_title = []

    for word in title_splitted:   
        if not word.isalnum():
            word = re.sub(r'\W+', '', word)

        final_title.append(word)
    return '_'.join(final_title)


if __name__ == '__main__':
    print(replace_space_with_under(title))    
