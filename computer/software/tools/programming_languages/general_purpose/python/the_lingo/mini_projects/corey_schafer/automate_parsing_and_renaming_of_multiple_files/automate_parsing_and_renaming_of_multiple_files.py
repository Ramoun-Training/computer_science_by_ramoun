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
    for file in os.listdir():
        # splitting the extension
        f_name_and_ext = os.path.splitext(file)
        ext = f_name_and_ext[1]
        f_name = f_name_and_ext[0]


        # splitting the file name into parts
        f_name_parted = f_name.split('-')

        # adding space in front of the course name
        f_name_parted[0] = ' ' + f_name_parted[0]

        # moving number to the front with zfill and adding spaces
        number = f_name_parted.pop(1)
        number = number.strip().zfill(2)
        number += ' '
        f_name_parted.insert(0, number)

        # finally joining everything back together
        final_no_ext = '-'.join(f_name_parted)
        final_with_ext = final_no_ext + ext
        print(final_with_ext)
    

if __name__ == '__main__':
    rearrange()