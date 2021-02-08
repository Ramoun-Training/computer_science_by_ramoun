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

- __Identify The APP Objects__:

    + Choose The object based on the task (Ex: if the task is data entry then the object is a textbox and so on...).

    + Questions To Help you Identify the objects for the Tasks:
        * Can The User Control When the task is perfomed (btn)?        
        
        * Do the Task Involves Data Entry (txt)?          

        * Do the Task Involves Display (lbl)?                  

    > **Note**: The Task can be assigned to multiple object (lbl, btn).    

- __Identify The APP Events__:

    + Determine which objects need an event to occur for the object to do its assigned task.

    + Questions To Help you Identify the Events for the Objects:
        * Does The Object Accept or Display Information?         
            ```
            no special event is necessary to them to do their assigned task.
            ```                         

    > **Note**: Not all objects in a user-interface will need an event to occur in order for the object to perform its assigned tasks.    

> **Note**: If the application you are creating is small, you can use the TOE chart (ordered by task) to help you write your visual basic .net code. When the application you are writting is large, however, it is helpful to rearrange the TOE chart so that it is ordered by object instead of by task.

- __Designing the User Interface__

    + TOE chart only tells you what are the objects to use but doesn't tell where to place those objects.
    + There are some guidelines to which you should adhere so that your application is consistant with the Windows standards:
        * The Consistency is gonna make the application easier to both learn and use, cause the UI will have familiar llok to it.

    > **Note**: the guidelines are referred to as _GUI Guidelines_.

    + Some of the __Windows GUI Guidelines__:
        + Most windows apps consist of a __main window__, possibly some other __primary windows__, and one or more secondary windows, called __dialog boxes__.
        + The primary viewing and editing of your applications's data takes place in a primary window.
        + __Dialog boxes__ are used to support and supplement a user's activities in the __primary windows__.
        + __Primary windows__ can be resized, minimized, maximized, and closed by the user.
        + Unlike __Primary windows__, __dialog boxes__ can be closed only.
        + The only buttons that appear in a dialog box's title bar are the close button and, in some cases, the Help button.
        + In vb .net, we use the Windows Form Object (form) to create both __primary windows__ and __dialog boxes__.
        + If the form represents a primary window, you learn the formn's FormBorderStyle property at its default setting `Sizable`. You also leave the minimize and maximize properties set to their default setting `True`. The User should always be able to minimize a primary window and in most cases, also maximize it.
        + If the form represents a dialog box, you usually represent the FormBorderStyle property to FixedDialog. The dialog box should not have the Minimize and Maximize buttons on its title bar.

- __Arranging the Controls__        

    + (layout) In __Western countries__, you should organize the user interface so that the information flows either _vertically_ or _horizontally_, with the most important information always located in the __upper-left corner__ of the screen and result usually in the bottom-right corner:
        * In a __Vertical Arrangment__:
            - The Information flows from top to bottom.
            - The essential information is located in the first column of the screen.
            - Secondary information is placed in subsequent columns.
        * In a __Horizontal Arrangement__: 
            - The Information flows from left to right.
            - The essential Information is located in the first row of the screen.
            - Secondary information is placed in subsequent rows.

            > **Note**: You can use white (empty) space (most used with vertical alignment), a group box control, or a panel control to group related controls together (most used with horizontal alignment).

    + (labeling) Each text box and button control in the UI must be labeled so that the user knows the control's pupose:
        * Labels That Identify __Text boxes__:
            - should be left-aligned and positioned either above or to the __left__ of the text box.
            - should end up with a colon (a `:` distinguishes an identifying label from other text on the interface, such as the heading text).
        * Captions are used to Identify __Buttons__
        * For both __Labels__ and __Captions__:
            - They should be from one to three words only.
            - Each should appear on one line.
            - They should be meaningful (The label that identifies a textbox for example should be able to tell the user the type of information to enter, A button caption on the other hand should indicate the action the button will perform when it is clicked).
            - The Windows standard for identifying labels is to use __sentence capitalization__ (you capitalize only the first letter in the first word and in any words that are customarily caplitalized).
            - The Windows standard for identifying button captions is to use __book title capitalization__ (you capitalize the first letter in each word, except for articles, conjunctions, and prepositions that don't occur at either the beginning or the end of the caption).

    + (margins) When positioning controls, make sure to maintain a consistent margin from the edge of the form (2 to 3 dots is recommended):
        * Margins:
            - Related controls typically are placed on succeeding dots.
            - Controls that are not part of any logical grouping may be positioned from two to four dots away from other controls.
            - always size the buttons in the interface relative to each other when the buttons are positioned __horizontally__, all the buttons should be the same hight; their widths, hover, may vary if necessar. If the buttons are stacked __vertically__, all the buttons should be the same height and width.
            - Try to minimize the number of different margins so that the user can more easily scan the information, you can do so by aligning the borders of the controls whenever possible. 

- __Aligning and Sizing Controls__

    > **Note**: when selecting multiple controls, the last control selected will have black sizing handles.

    > **Note**: the align and make same size options on the format menu use the control with the black sizing handles as the _refrence control_ when aligning and sizing the selected controls.

    - When building The GUI, keep in mind that you wanna create a screen that no one notices. Snazzy interfaces may get "oohs" and "aahs" during their initial use, but they become tiresome after a while. 
    - The most important point to remember is that the interface should not distract the user from doing her/his work.
    - Remember to not overload your user interface with too much color, too many fonts, and too many graphics:
        + __Include Graphics in the User Interface__:
            * Human eyes are attracted to pictures before text, so include a graphic only if it is necessary to do so.
            * Grahpics typically are used to either _emphasize_ or _clarify_ a portion of the screen.
            * You also can use a graphic for _aesthetic_ purposes, as long as the graphic is small and placed in a location that does not distract the user.
            * IF you want to make a graphic for aesthetic purposes without distracting the user, you can place it in the upper-left corner of the Windows Form Object which is where you want the user's eye to be drawn first anyway. The graphic adds a personal touch to the form without being distracting.

        + __Include Fonts in the User Interface__:
            * Use an object Font Property to change the type, style, and size of the font used to display text in the object.
            ```
            Font: is the general shape of the characters in the text;
            Font Type: Courier, Tahoma, Arial;
            Font Styles: regular, bold, italic;
            Font Size: 12pt, 18pt
            *Point = 1/72 of an inch
            ```
            * Some Fonts are **Serif** (those are easier to read on the printed page).
            * **Sans Serif** (are easier to read on the screen).
            * You should only use one font for all of the interface.
            * You can use font sizes of : 8, 9, 10, 11, 12. btw, 12pt size is easier to read on high res screens.
            * Be sure to limit the number of font sizes used to either 1 or 2.
            * You should change the Form's font property before adding any controls to the form.
            * Avoid using italics and underlining in interfaces, because both make text difficult to read.
            * Limit the use of bold text to titles, headings, and key items that you want to emphasize.

            > **Note**: For Windows apps use `Tahoma` because it provides great readability and global support.

            > **Note**: vb .net automatically assigns the value Microsoft Sans serif, 8.25pt to the Form's font property when the form is created.

            > **Note**: when you add a control to the form, the form's font property value is automatically assigned to the control's font property.

        + __Include Colors in the User Interface__:
            * human eye is attracted to color before black and white, so use color sparingly.
            * It is good practice to build the UI using black, white, and gray first, Then add color only if you have good reason to do so.
            * Keep the following 4 points in mind when deciding to include color in an interface:
                - some users will be working on monochrome monitors.
                - Many people have a form of color-blindness or color confusion, so they have trouble distinguishing color.
                - color is very subjective, a pretty color to you, may look hadious for someone else.
                - a color may have a different meaning in different culutre.
            * Usually, it is better to user black text on white, off-white, or gray background because it is the easiest to read. if you reverse that, the black background is hard on the eyes and the white text appears blury.
            * limit the number of colors to 3, not including black, white, and gray.
            * make sure that the colors you choose compliment each other.

            > **Note**: for me colors are dark and light + hot and cold.

            > **Note**: Although color can be used to identify an important element in the GUI, you shouldn't use it as the only means of identification (you can add lables for example).

- __Assigning Access Keys__

An Access key allows the user to select an object using the Alt key in comibination with a letter or a number.

> **Note**: Access Keys are not case-sensitive (E.g: you can select the File Menu by pressing either `Alt+F` or `Alt+f`, because the letter `F` is the access key of the File Menu).

- you should assign an access key to all the controls (in the interface) that can accept user input. Examples of those controls inlcude: textboxes and buttons.
- It's important to assign access keys to these controls for the following reasons:
    + Access keys allows the user to work with app even if the mouse becomes inoperative.
    + Access keys allows fast typists to keep their hands on the keyboard.
    + Access keys allow people with disabilities, which may prevent them from using the mouse.

- You assign an access key by including an ampersand(&) in the control's caption or identifying label (aka: Text Property).    
- You enter the ampersand to the immediate left of the character you wan tto designate as the access key.(e.g: `&Calculate`).