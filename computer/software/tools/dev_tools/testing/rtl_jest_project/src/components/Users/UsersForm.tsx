import React, { useState } from "react";
import { User } from "../../interfaces";

const UsersForm = ({
  onUserAdd,
}: {
    onUserAdd?: (user: User) => void;
}) => {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    onUserAdd?.({name, email})
    setName("");
    setEmail("");
  };

  return (
    <form onSubmit={handleSubmit} action="">
      <div>UsersForm</div>
      <input
        placeholder="Username"
        name="username"
        type="text"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <input
        placeholder="Email"
        name="email"
        type="email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <input type="submit" value="Add" />
    </form>
  );
};

export default UsersForm;
