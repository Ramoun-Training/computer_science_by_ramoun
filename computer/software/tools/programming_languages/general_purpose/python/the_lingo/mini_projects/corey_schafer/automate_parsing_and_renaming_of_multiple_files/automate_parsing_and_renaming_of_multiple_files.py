import os

"""
1. read all file-names of files in the dir.
2. split them and rearange :
    1. get rid of the extension
    2. split by '-'
    3. rearange
    4. join back    
3. add zfill
4. add the extension back
"""

# print(os.getcwd())

# changing the dir to the dir of the folder that contains the files we want to rename
os.chdir("python tuts proj")
# print(os.getcwd()) # making sure everything is alright

# print(os.listdir())

def rearrange():
    """a functions that automates parsing and renaming filenames in a system"""
    for file in os.listdir():
        # splitting the extension
        f_name, f_ext = os.path.splitext(file)

        # splitting the file name into parts
        f_name_parted = f_name.split('-')

        # adding space in front of the course name
        f_name_parted[0] = ' ' + f_name_parted[0]

        # moving number to the front with zfill and adding spaces
        number = f_name_parted[1]
        number = number.strip().zfill(2)
        number += ' '
        f_name_parted[1] = f_name_parted[0]
        f_name_parted[0] = number
        # x,y = y,x -> is a great way of swaping

        # finally joining everything back together
        final_no_ext = '-'.join(f_name_parted)
        final_with_ext = final_no_ext + f_ext
        yield (final_with_ext)


def rearrange_v2():
    """another version of the rearrange function with different more organized cleaner approach"""
    for f in os.listdir():
        # splitting the extension
        # returns a tuple of 2 values
        f_name, f_ext = os.path.splitext(f)

        # splitting the file name into parts
        f_course, f_num, f_title, f_part = f_name.split('-')

        # clearing space around parts of the file name and adding the zfill for the number
        f_course = f_course.strip()
        f_num = f_num.strip().zfill(2)
        f_title = f_title.strip()
        f_part = f_part.strip()

        # final join
        new_name = f"{f_num}" + (" - {}"*3).format(f_course, f_title, f_part) + f_ext

        yield new_name


def change_file_system(rearrange_function):
    new_name = rearrange_function() 
    for old_name in os.listdir():
        os.rename(old_name, next(new_name))


if __name__ == '__main__':
    # rearrange()
    change_file_system(rearrange_v2)