# csv_module

**csv**: stands for **c**omma **s**eprated **v**alues. It allow us to put into a plain text file some data and uses some type of delimiter usually a comma (`,`) to sprate the different fields.

> **Note**: `.csv` files are not meand to be read directly. This is just how the data is stored and we can use our programs to parse out the information we want.

> **Note**: commas (`,`) are the most common delemiters (what seprates the values) in .csv files but you can use just about anything (dashes, tabs ...etc).

> **Tip**: string mehtods can be used to parse values from .csv files but it's not recommended csv module makes parsing these files so much easier (e.g: someone puts a comma in their name - splitting won't be useful in this situation), csv module handles new lines ...etc.


## Reading CSV Files

- using the csv reader

    ```python
    import csv
    with open('names.csv', 'r') as csv_file:
        csv_reader = csv.reader(csv_file)
        # csv_reader is an object (iterable/iterator)
    ```

    > **Note**: in the background, the `csv.reader()` method is using something called a dilect that has some preset params for what it expects the format of the csv file to be, so by default it is expecting values to be seprated by a comma and few other things (passed-in as args).

    ```python
    import csv
    with open('names.csv', 'r') as csv_file:
        csv_reader = csv.reader(csv_file) # creating a generator object that holds all data inside of the file
        
        for line in csv_reader:
            print(line) # each line is a list of all the values
    ```

    > **Note**: the first line of any csv file is the field names.

    > **Remember**: you can step over values in an iterable by calling `next()` [see the generators lesson].

    ```python
    import csv
    with open('names.csv', 'r') as csv_file:
        csv_reader = csv.reader(csv_file)
    
        next(csv_reader)    
    
        for line in csv_reader:
            print(line) # each line is a list of all the values
    ```

- using the dictionary reader

    ```python
    import csv
    with open('names.csv', 'r') as csv_file:
        dict_reader = csv.DictReader(csv_file)
        
        for line in dict_reader:
            print(line)
    ```



## Writing to CSV Files

you can write to any csv file using any list of vlaues.

- using the csv writer

    ```python
    import csv
    with open('names.csv', 'r') as csv_file:
        csv_reader = csv.reader(csv_file) 
    
        with open('new_names.csv', 'w') as csv_new_file:
            csv_writer = csv.writer(csv_new_file, delimiter='-')    
        
            for line in csv_reader:
                csv_writer.writerow(line)
    
    '''
    output:
    first_name-last_name-email
    John-Doe-"john-doe@bogusemail.com"
    Mary-"Smith-Robinson"-maryjacobs@bogusemail.com
    Dave-Smith-davesmith@bogusemail.com
    '''
    ```

    > **Note**: if the csv writer is using the '`-`' as a delimiter and if there is some values with '`-`' in them, the csv wirter will add quotation marks around those values so that it can tell the difference between a delimiter and a value that happen to contain dashes. So that when the csv is read back in it will knwo that the e-mail is one whole value and shouldn't be split on the dash wihtin the e-mail iteself.

    > **Tip**: one of the most common delimiters aside from commas are tabs (`'/t'`)

    > **Note**: you have to pass the delimiter arg to the csv reader if the delimiter is not a comma (because commas are the default delimiters).

    > **Tip**: try reading a tab delimited file using a csv reader without specifying the tab the delimiter.


- using the dictionary wirter

    for dictionary writers you need to provide the filed names of the file.

    ```python
    import csv
    
    with open('names.csv') as csv_file:
        dict_reader = csv.DictReader(csv_file)

        with open('final_names_copy.csv', 'w') as csv_file_final:
        
            field_names = ['first_name', 'last_name', 'email']
            
            dict_writer = csv.DictWriter(csv_file_final, fieldnames=field_names)
    
            # if you want to write the headers
            dict_writer.writeheader()

            for row in dict_reader:
                dict_writer.writerow(row)
    ``` 

> **Note**: working with csv files using readers and writers is the most common way to work with csv data since they're the first thing to come up in the python documentation. But, the prefered method is working with csv data using the dictionary reader and the dictionary writer. Because, they make it alot eaiser to parse the info that you want providing more readabilty for the code.

Example of readability issue in the csv reader/writer:

```python
import csv
with open('names.csv', 'r') as csv_file:
    csv_reader = csv.reader(csv_file) 
    
    for line in csv_reader:
        print(line[2]) # the e-mail part but for others it's not obvious, you have to go intor the csv file to find what does that index refer to.

```

```python
import csv
with open('names.csv', 'r') as csv_file:
    dict_reader = csv.DictReader(csv_file) 
    
    for line in dict_reader:
        print(line['email']) # now it is more abvious
```


