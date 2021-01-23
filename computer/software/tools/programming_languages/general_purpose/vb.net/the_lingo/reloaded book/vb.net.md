# `VB.NET` Reloaded

## Chapter #2

### HOW TO PLAN AN APPLICATION

> **Note**: Involove the user in the planning phase. Sit Down with the user (sales manager for example) to determine the App _requirements_.

1. Identify the _**T**asks_ the App needs to perform.
2. Identify the _**O**bjects_ to which you'll assign those tasks.
3. Identify the _**E**vents_ required to trigger an object into performing its assigned tasks.
4. Design The _user Interface_.

### CASE STUDY

- __Identify The APP Tasks__:

    + View the current Forms and Procedures:
        * Helps you gain a better understanding of the app.
        * a guide for designing the user interface.
    + Questions To Help you Identify the tasks fo the APP:
        * What Information, if any, will the Application need to display on the screen and/or print on the printer?(O/P)
          ``` 
          - The App should display the customer's name, street, address, city, state, zip code, the # blue boards ordered, the # yellow boards ordered, the total # boards ordred, and the total price of the order.
          - In this case the App doesn't need to print anything on the printer.
          ```
        
        * What Information, if any, will the user need to enter into the user interface to display and/or print the desired information?(I/P)
          ```
          the sales-person (the user) must enter the customer's name, street address, city, state, zip code, and the # blue and yellow boards ordred.
          ```

        * What Information, if any, will the Application need to calculate to display and/or print the desired information?(PROCESS)
          ```
          the total number of boards ordered and the total price of the order. 
          ```

        * How will the user end the Application?(MISC.)
          ```
          the App will use an Exit button.
          ```

        * will previous information need to be cleared from the screen before new information is entered?(MISC.)
          ```
          App should clear the screen for the next order.
          ```

    > **Note**: The tasks in a _TOE_ chart do not need to be listed in any particular order.

    > **Note**: For The Skateboard App Case, the __data entry__ tasks are listed first, followed by the __calculation__ tasks, __display__ tasks, __application ending__ tasks, and __screen clearing__ task.

 __Identify The APP Objects__:

    + Choose The object based on the task (Ex: if the task is data entry then the object is a textbox and so on...).

    + Questions To Help you Identify the objects for the Tasks:
        * Can The User Control When the task is perfomed (btn)?        
        
        * Do the Task Involves Data Entry (txt)?          

        * Do the Task Involves Display (lbl)?                  

    > **Note**: The Task can be assigned to multiple object (lbl, btn).    

__Identify The APP Events__:

    + Determine which objects need an event to occur for the object to do its assigned task.

    + Questions To Help you Identify the Events for the Objects:
        * Does The Object Accept or Display Information?         
            ```
            no special event is necessary to them to do their assigned task.
            ```                         

    > **Note**: Not all objects in a user-interface will need an event to occur in order for the object to perform its assigned tasks.    

> **Note**: If the application you are creating is small, you can use the TOE chart (ordered by task) to help you write your visual basic .net code. When the application you are writting is large, however, it is helpful to rearrange the TOE chart so that it is ordered by object instead of by task.