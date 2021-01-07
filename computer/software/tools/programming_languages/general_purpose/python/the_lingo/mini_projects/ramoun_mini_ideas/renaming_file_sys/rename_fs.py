under_path = '/home/ramoun/Desktop/microverse-web-job/microverse_goal/training/computer_science_training/computer/software/tools/programming_languages/general_purpose/python/the_lingo/mini_projects/ramoun_mini_ideas'

import sys
sys.path.append(under_path)

import under
import os




def rename_fs(options):

    if options == '--all':

        for file_or_dir_name in os.listdir():

            old_title = file_or_dir_name
            file_or_dir_name = under.replace(file_or_dir_name)

            os.rename(old_title, file_or_dir_name)

            if os.path.isdir(file_or_dir_name):
                # directory = os.path.join(directory, old_title)
                # os.chdir(directory)
                # print(os.getcwd())
                
                os.chdir(file_or_dir_name)
                rename_fs(options)
                os.chdir('..')

            else:
                continue
        return None
    
    elif options == '--lvl1':

        for file_or_dir_name in os.listdir():

            old_title = file_or_dir_name
            file_or_dir_name = under.replace(file_or_dir_name)

            os.rename(old_title, file_or_dir_name)            

    else:
        return "ERROR - contant developer @: omartarekramoun@gmail.com"



directory = sys.argv[1]

try:
    options = sys.argv[2]
except:
    options = '--lvl1'


try:
    os.chdir(directory)
except:
    os.chdir(os.getcwd())

print(os.getcwd())
rename_fs(options)
