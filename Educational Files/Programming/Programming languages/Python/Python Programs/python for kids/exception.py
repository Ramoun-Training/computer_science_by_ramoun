try:
    print('.:EXCEPTION TEST:.')
    files=open('c:\\test.txt','r')
    files.write('where is the old text??')
except IOError:
    print('Error,cat\'t find the file.')
else:
    print('Written to file sucessfuly.:)')
    files.close()
