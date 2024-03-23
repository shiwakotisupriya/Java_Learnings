import React from "react";
import { Outlet } from "react-router-dom";
import Navbar from "../components/navbar/Navbar";
const Layout = () => {
  return (
    <main>
      <Navbar />
      <section>
        <Outlet />
      </section>
    </main>
  );
};

export default Layout;
