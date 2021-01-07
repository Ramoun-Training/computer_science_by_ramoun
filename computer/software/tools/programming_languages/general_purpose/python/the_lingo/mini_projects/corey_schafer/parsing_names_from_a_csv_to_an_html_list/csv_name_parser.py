# trying to pares names form a csv and put them in the form of html
# link: https://www.youtube.com/watch?v=bkpLhQd6YQM&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=16

import csv

def html_tag(tag):
    def get_element(content):
        opening_tag = f'<{tag}>'
        closing_tag = f'</{tag}>'
        return f'{opening_tag}{content}{closing_tag}'
    return get_element
    
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

# def show_names(names):
#     '''prints firstnamse and last names on the screen'''
#     for f_name, l_name in names:
#         print('- ', end='')
#         print(f_name, l_name)

# def list_names(names):
#     '''returns a list of all names (first and last concatenated btw)'''
#     list_of_names = []
#     for f_name, l_name in names:
#         list_of_names.append((f_name, l_name))
#     return list_of_names

def list_names(names):
    '''returns a list of all names (first and last concatenated btw)'''
    list_of_names = []
    for f_name, l_name in names:
        list_of_names.append((f_name, l_name))
    return list_of_names

def html_parser(contributers_list):
    number_of_contributors = len(contributers_list)
    html_page = []
    
    # creating the h1 element
    h1_content = f'There are currently {number_of_contributors} public contributers.'
    h1_tag = html_tag('h1')
    h1_element = h1_tag(h1_content)
    html_page.append(h1_element)

    # creating the oredred list opening tag
    ol_openning_tag = '<ol>'
    html_page.append(ol_openning_tag)

    # creating the <li> items 
    li_tag = html_tag('li')    
    for name in contributers_list:
        li_element = li_tag(name) # wrapping the name in <li> tags
        html_page.append('\t' + li_element) # adding the full li elemnt with content to the html_page list

    # creating the ordered list closing tag
    ol_closing_tag = '</ol>'
    html_page.append(ol_closing_tag)

    return html_page


# the following code caused a logic error that took me alot of time to figure out that's why i left to remember it
# if __name__ == '__main__':
    # names = get_names('patrons.csv')
    # show_names(names) # this line will exhaust the generator (passed by refrence) leaving no items in it
    # print(list_names(names)) # so now there is no values in the generator , so nothing will be pritned.

if __name__ == '__main__':
    names = get_names('patrons.csv')
    contributers_list = [f'{f_name} {l_name}' for f_name, l_name in list_names(names)]
    # [print(full_name) for full_name in contributers_list]
    for item in html_parser(contributers_list):
        print(item)