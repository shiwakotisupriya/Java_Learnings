import { useRouteError } from "react-router-dom";
import React from "react";
const ErrorPage = () => {
  const error = useRouteError();
  return (
    <div className="absolute inset-0 bg-zinc-100 flex justify-center items-center text-lg">
      <div className="text-center">
        <h1>Oops!</h1>
        <p>Sorry, an unexpected error has occurred.</p>
        <i>{error.statusText || error.message}</i>
      </div>
    </div>
  );
};

export default ErrorPage;
