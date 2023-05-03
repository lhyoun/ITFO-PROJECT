import { BrowserRouter, Route, Routes } from "react-router-dom";
import React from "react";
import "./App.css";
import Header from "./modules/common/header/Header";

function App() {
  return (
    <div className="App">
      <Header />
      <BrowserRouter>
        <Routes>{/* <Route path="" element={<Test/>}></Route> */}</Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
