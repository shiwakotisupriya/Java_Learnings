import React from "react";

import { useState } from "react";
import { IoCartSharp } from "react-icons/io5";
import { NavLink } from "react-router-dom";

const Cart = () => {
  const [cartCount, setCartCount] = useState(0);
  return (
    <>
      <NavLink to="/my_cart">
        <div className="relative flex items-center gap-2 p-3 rounded-md hover:shadow-md">
          <IoCartSharp size={25} />
          <p className=" flex justify-center items-center absolute top-2 left-7 w-4 h-4 rounded-full bg-red-600 text-white text-xs">
            {cartCount}
          </p>
          <h2 className="uppercase font-semibold">Cart</h2>
        </div>
      </NavLink>
    </>
  );
};

export default Cart;
