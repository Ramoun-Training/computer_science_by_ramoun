'''
generators
'''

def csv_read(file):
    '''
    csv reader generator
    '''
    for row in open(file, "r", encoding="utf-8"):
        yield row


# generator comprehension
gc = (row for row in open("text.txt", "r", encoding="utf=8"))
