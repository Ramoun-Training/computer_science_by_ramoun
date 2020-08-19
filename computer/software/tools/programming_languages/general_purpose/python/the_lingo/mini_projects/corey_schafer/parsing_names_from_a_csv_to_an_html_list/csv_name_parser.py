# trying to pares names form a csv and put them in the form of html
# link: https://www.youtube.com/watch?v=bkpLhQd6YQM&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=16

import csv

    
def get_names(file_name):

    with open(file_name, 'r') as file:
        csv_dict = csv.DictReader(file) # returns a generator object
    
        # by default the DictReader removes the header line from output
    
        # removing the first line of bad data (description)
        next(csv_dict)
    
        for row in csv_dict:
            # removing people that don't want their names to appear on the site
            if row['FirstName'] == 'No Reward':
                break
            yield row['FirstName'], row['LastName'] # TODO: try to figure out how the 'yield' works

def show_names(names):
    '''prints firstnamse and last names on the screen'''
    for f_name, l_name in names:
        print('- ', end='')
        print(f_name, l_name)

def list_names(names):
    '''returns a list of all names (first and last concatenated btw)'''
    list_of_names = []
    for f_name, l_name in names:
        list_of_names.append(f_name, l_name)
    return list_of_names


if __name__ == '__main__':
    names = get_names('patrons.csv')
    show_names(names)
    print(list_names(names))
