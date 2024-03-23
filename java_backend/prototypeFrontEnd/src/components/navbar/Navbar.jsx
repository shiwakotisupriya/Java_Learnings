import React from "react";
import { NavLink } from "react-router-dom";
import { navData } from "./navData";
import Cart from "../cart/Cart";
import "./navbar.css";

const Navbar = () => {
  return (
    <main className="w-full bg-white shadow-md sticky top-0 z-30">
      <section className="max-w-[1280px] mx-auto px-4 flex items-center justify-between h-16">
        <section className="flex gap-2 items-center">
          <div className="w-8 h-8 bg-red-400 rounded-full"></div>
          <div>
            <h1 className="font-bold text-3xl uppercase">LOGO</h1>
          </div>
        </section>
        <section className="flex gap-8" id="naviagtion">
          {navData.map((data, index) => (
            <NavLink
              key={index}
              to={data.path}
              className="font-medium text-xl h-full"
            >
              {data.title}
            </NavLink>
          ))}
        </section>
        <section>
          <Cart />
        </section>
      </section>
    </main>
  );
};

export default Navbar;
