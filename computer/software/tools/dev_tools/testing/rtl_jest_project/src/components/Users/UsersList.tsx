import React from "react";
import { User } from "../../interfaces";

const UsersList = ({ usersList }: { usersList: User[] }) => {
  const renderedUsers = usersList.map((user) => (
    <div className="user" key={user.name}>
      <h2>{user.name}</h2>
      <h3>{user.email}</h3>
    </div>
  ));

  return (
    <>
      <div>UsersList</div>
      {usersList.length > 0 ? renderedUsers : null}
    </>
  );
};

export default UsersList;
