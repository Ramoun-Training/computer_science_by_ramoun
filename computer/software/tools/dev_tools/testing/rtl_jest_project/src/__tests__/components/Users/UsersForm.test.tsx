/*
 Important Parts
 * rendering the component(show 2 inputs and one button)
 * using the component(submitting the form)
*/

// the imports
import { render, screen } from "@testing-library/react";
import user from "@testing-library/user-event";
import UsersForm from "../../../components/Users/UsersForm";
import { User } from "../../../interfaces";

test("Render the form component with 2 inputs and one button", () => {
  // Arrange
  render(<UsersForm />);

  // Act
  const inputs = screen.getAllByRole("textbox");
  const button = screen.getByRole("button");

  // Assert
  expect(inputs).toHaveLength(2);
  expect(button).toBeInTheDocument();
});

test("it calls onUserAdd when the form is submitted", () => {
  // Arrange
  const mockInput = {
    name: "omarramoun",
    email: "omar@soso.com",
  };
  const argList: User[] = [];
  const callback = (args: User) => argList.push(args);
  render(<UsersForm onUserAdd={callback} />);

  // Act
  const [userInput, emailInput] = screen.getAllByRole("textbox")
  const submitButton = screen.getByRole("button");
  user.type(userInput, mockInput.name);
  user.type(emailInput, mockInput.email);
  user.click(submitButton);

  // Assert
  expect(argList).toHaveLength(1);
  expect(argList[0]).toEqual({
    name: mockInput.name,
    email: mockInput.email,
  });
});
