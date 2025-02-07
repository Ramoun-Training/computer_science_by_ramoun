# React Testing Library

## use case [small e-commerce]

1. App starts up [#test1]
2. 6 products visible [#test1]
3. click the 'load more' button [#test2]
4. 12 product visible [#test2]

```jsx {"id":"01J2PVR638AQ7M865RZS3EG8P2"}
// App.test.js
import { render, screen, waitFor } from '@testing-library/react';
import user from '@testing-library/user-event';
import App from './App';

test('shows 6 products by default', async () => {
    // Arrange
    render(<App />);

    // Act
    const headings = await screen.findAllByRole('heading');

    // Assert
    expect(headings).toHaveLength(6);
});

test('clicking on the "load more" button ', async () => {
    // Arrange
    render(<App />);

    // Act
    const button = await screen.findByRole('button', {
        name: /load more/i
    });
    await user.click(button);

    // Assert
    await waitFor(async () => {
        const headings = await screen.findAllByRole('heading');
        expect(headings).toHaveLength(12);
    });
});
```

## Import Statements

Library | Purpose
--------|---------
@testing-library/react | Uses ReactDOM to render a component for testing
@testing-library/user-event | Helps Simulate user input
@testing-library/dom | Helps find elements that are rendered by our components (used by `@testing-library/react` under the hood)
jest | Runs our tests, Reports results
jsdom | Simulates a browser when running in a node environment

## How tests are found

jest is in charge of finding all the different test files in our project and executing them (`src/`). Any file ending with `.spec.js`, `.test.js` or inside a folder called `__test__` will be run by __Jest__.

## Explaining the Code

`test()` is a built-in function. built-in the global environment It's provided by our test runner (jest).

## Test Writing Process

1. **Pick** one out **component** to test all by itself
2. **create a test file** for that component if one does not already exist
3. **Decide** the **important parts** of the component.
4. **write tests** to make sure each part **works as expected**
5. **Run tests** at the command line.

### Code

After doing all above steps, start coding.

1. imports:

```tsx {"id":"01J2S36T0B8FDNRTADADVPKPF6"}
import {screen, render} from '@testing-library/react';
import user form '@testing-library/user-event';
import Component from './components'; // the component you wanna test

```

2. write test description + AAA

```tsx {"id":"01J2S36T0B8FDNRTADAGMKFD7M"}
test('it shows two inputs and a button', async () => {
// Arrange - usually render the component
render(<Component />);

    // Act - manipulate the component or find an element in it
    // simulation of clicking, typing, ...etc
    const inputs = await screen.findAllByRole('input');

    // Assert
    // make sure the component is doing what we expect it to do
    // e.g: calls a callback, shows an element on screen, ...etc
    expect(inputs).toHaveLength(2);

});

```

```tsx {"id":"01J2S9YTMBZWJNBMXJ0EK54V26"}
test('it calls onUserAdd when the form is submitted', () => {
// NOT THE BEST IMPLEMENTATION - VERBOSE_LEVEL = HIGH
// Arrange
// render the component
const mockInput = {
name: "omarramoun",
email: "omar@soso.com",
};
const argList = [];
const callback = (...args) => argList.push(args)
render(<UserForm onUserAdd={callback} />);

    // Act
    // find the 2 inputs
    const userInput = screen.getByPlaceholderText("Username");
    const emailInput = screen.getByPlaceholderText("email");
    // find the button
    const submitBtn = screen.getByRole("button");
    // simulate typing name/email
    user.type(userInput, mockInput.name);
    user.type(emailInput, mockInput.email);
    // simulate clicking a button
    user.click(submitBtn);

    // check if the onUserAdd function get called with name/email
    expect(argList).toHaveLength(1)
    expect(argList[0]).toEqual({name: mockInput.name, email: mockInput.email});

});

```

```tsx {"id":"01J2SAN7PPMV3P9780BYFWZZ84"}
test('it calls onUserAdd when the form is submitted', () => {
// NOT THE BEST IMPLEMENTATION - VERBOSE_LEVEL = MED
// Arrange
// render the component
const mockInput = {
name: "omarramoun",
email: "omar@soso.com",
};
const argList: User[] = [];
const callback = (args: User) => argList.push(args);
render(<UsersForm onUserAdd={callback} />);

    // Act
    // find the 2 inputs
    const [user, email] = screen.getAllByRole("textbox");
    // find the button
    const submitBtn = screen.getByRole("button");
    // simulate typing name/email
    user.click(user);
    user.keyboard('hello')
    // simulate clicking a button
    user.click(submitBtn);

    // check if the onUserAdd function get called with name/email
    expect(argList).toHaveLength(1);
    expect(argList[0]).toEqual({
      name: mockInput.name,
      email: mockInput.email,
    });

})

```

```tsx {"id":"01J2SDCHPAN4NSH8H504P782D1"}
test('it calls onUserAdd when the form is submitted', () => {
// Arrange
// render the component
const mockInput = {
name: "omarramoun",
email: "omar@soso.com",
};
const argList: User[] = [];
const callback = (args: User) => argList.push(args);
render(<UsersForm onUserAdd={callback} />);

    // Act
    // find the 2 inputs
    const [user, email] = screen.getAllByRole("textbox");
    // find the button
    const submitBtn = screen.getByRole("button");
    // simulate typing name/email
    user.click(user);
    user.keyboard('hello')
    // simulate clicking a button
    user.click(submitBtn);

    // check if the onUserAdd function get called with name/email
    expect(argList).toHaveLength(1);
    expect(argList[0]).toEqual({
      name: mockInput.name,
      email: mockInput.email,
    });

})

```

> **Note:** Difference between `getByRole` and `findByRole`:
>
> - `getByRole` : synchronous. used when you expect the element to be in present in the DOM and don't need to wait for any asynchronous behavior.
> - `findByRole` : async - used when you need to wait for an element to appear in the DOM due to some asynchronous operation.

> **Note:** `findByRole` will keep trying until the default timeout is reached.

> **Note:** part of testing is not only knowing 'what to test' but also knowing the best way of iplementing that.

### Queries

the `render` function renders a fake html document in node and allows you to navigate it.

> **Note:** A super important part of testing is finding the elements that our component created.
> to test form submission -> need to fin a button to click
>
> to test navigation -> need to find a link to click
>
> to make sure header is visible -> need to find a header

#### List of most used RTL Query Functions

- `getByRole`
- `queryByRole`
- `findByRole`
- `findByTitle`
- `findAllByTitle`
- `findAllByDisplayValue`
- `queryAllByRole`
- `queryByLabelText`
- `getByLabelText`

### Aria Role

- Aria Roles clarify the purpose of an html element.
- Traditionally, they are used by screen readers softwares to help people understand teh content of the screen.
- Many HTML elements have an 'implicit' or automatically assigned role
- elements can be assigned manually assigned a role. Btw, even trained engineers do this incorrectly.

> **Note:** usually we don't assign roles unless we are experts in what we are doing

#### List of Arias

`ul`, `li` -> list

### Assertions

the `expect` function is a global variable provided by jest testing framework.

> **Note:** with `expect` you can chain matchers to assert certain criteria.

#### Matchers from Jest

they are for the more general program logic assertions. it is made for any thing javascript.

Matcher | Description
--------|-------------
`expect(['a', 'b']).toHaveLength(2)` | makes sure the value is an array with a particular length
`expect(5).toEqual(5)` | compares a value to another value
`expect(['a', 'b']).toContain('b')` | makes sure an array contains a value, or make sur a string contains another string.
`expect(fn).toThrow()` | makes sure a function throws an error when called
`expect(mock).toHaveBeenCalled()` | makes sure a mock function has been called

> **Note:** for more information about the `expect` function, follow the [link](https://jestjs.io/docs/expect)

#### Matchers from RTL

they are for the more dom-related assertions

Matcher | Description
--------|------------
`expect(element).toBeInTheDocument()` | makes sure the element is present on the page
`expect(element).toBeEnabled()` | makes sure an element (like an input) is not disabled
`expect(element).toHaveClass()` | makes sure an element has a class name.
`expect(element).toHaveTextContent()` | makes sure an element has some particular text.
`expect(element).toHaveValue()` | makes sure an input, select, or textarea ha a value.

> **Note:** for more info, check the [docs](https://github.com/testing-library/jest-dom#custom-matchers).

#### Mock Functions

sometimes we want to verify that what we passed down to the component is actually called and make sure it is called with correct args.

since this is a very common scenario. there is a feature in jest for it. it's name is 'mock functions'

##### Features

- in english 'mock' can mean 'not real'
- fake function that doesn't do anything.
- records whenever it gets called, and the arguments it was called with.
- used very often when we need to make sure a component calls a callback.

##### Diagram

[mock-function](mock-function.png)

##### Code

```tsx {"id":"01J2XJ0P8QEQ0CM6ZYVYCRFQ3T"}
const mock = jest.fn();

render(<UserForm onUserAdd={mock} /> );

expoect(mock).toHaveBeenCalled(); // is it called
expoect(mock).toHaveBeenCalledWith({name: 'jane', email 'soso@gmail.com'}); // what args are you expecting to recieve when the function is called.

```

### Querying

> **Note:** always avid brittle tests. brittle tests are the ones that are easy to break. you can break it using simple stuff like: 'reordering elements' or 'changing content or attributes', ...etc.

```tsx {"id":"01J2XN1D2F2DQNQ917WGZW7DVM"}
const nameInput = screen.getByRole('textbox', {
name: /name/i,
});
const emailInput = screen.getByRole('textbox', {
name: /email/i
}); // reorder and add more elements freely, it won't break the test

```

```tsx {"id":"01J2XNJ0R04J9RBAN9F6XFSE4B"}
test('render one row per user', () => {
const users = [
{name: 'name', email: 'borin-emaail'},
{name: 'scnd', email: 'snd-mail'},
]
render(<UserList users={users} />);
})

```

##### How to select the best query function

- memorizing all query functions is so hard.abs
- to get help finding an element use this `screen.logTestingPlaygroundURL()`
- it takes the html currently rendered by your component and creates a link to view that HTML in the 'Testing PLayground' tool

> **Note:** waitFor should only be used to assert the state change or DOM update