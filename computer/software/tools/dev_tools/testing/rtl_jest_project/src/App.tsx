import { useMemo, useState } from "react";
import "./App.css";
import ProductList from "./components/ProductList";
import Users from "./components/Users";

function App() {
  const [showUsers, setShowUsers] = useState(false);
  console.log('how many times');
  return (
    <div className="container mx-auto">
      <ul className="nav flex-row border-solid border-orange-300 m-4">
        <li>
          <button
            className="border-solid border-orange-300 border-2 px-4 py-1 rounded mb-2 hover:bg-orange-300 active:bg-orange-500"
            onClick={() => setShowUsers(true)}
          >
            Users
          </button>
        </li>
        <li>
          <button
            className="border-solid border-orange-300 border-2 px-4 py-1 rounded hover:bg-orange-300 active:bg-orange-500"
            onClick={() => setShowUsers(false)}
          >
            Products
          </button>
        </li>
      </ul>
      {showUsers ? <Users /> : <ProductList />}
    </div>
  );
}

export default App;
