import sys

title = ' '.join(sys.argv[1:]).lower()


def replace_space_with_under(title):
    return '_'.join(title.split())


if __name__ == '__main__':
    print(replace_space_with_under(title))    
