import React from "react";
import {
  Route,
  RouterProvider,
  createBrowserRouter,
  createRoutesFromElements,
} from "react-router-dom";

import Navbar from "../components/navbar/Navbar";
import Login from "../components/Login";
import Product from "../pages/product/Product";
import Category from "../pages/category/Category";
import Service from "../pages/service/Service";
import Layout from "../layout/Layout";
import ErrorPage from "../pages/error/ErrorPage";
import Cart from "../components/cart/Cart";
import Signup from "../components/Signup";

const MainRoute = () => {
  const router = createBrowserRouter(
    createRoutesFromElements(
      <Route path="/" element={<Layout />} errorElement={<ErrorPage />}>
        <Route path="/product" element={<Product />} />
        <Route index element={<Login />} />
        <Route path="/Signup" element={<Signup />} />
        <Route path="/service" element={<Service />} />
        <Route path="/category" element={<Category />} />
        <Route path="/my_cart" element={<Cart />} />
      </Route>
    )
  );

  return (
    <>
      <RouterProvider router={router} />
    </>
  );
};

export default MainRoute;
