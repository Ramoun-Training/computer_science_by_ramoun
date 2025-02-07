import React, { useState } from "react";
import UsersList from "./UsersList";
import { User } from "../../interfaces";
import UsersForm from "./UsersForm";

const Users = () => {
  const [users, setUsers] = useState<User[]>([]);

  const onUserAdd = (user: User): void => {
    setUsers((prev) => [...prev, user]);
  };

  return (
    <div>
      <UsersList usersList={users} />
      <UsersForm onUserAdd={onUserAdd} />
    </div>
  );
};

export default Users;
