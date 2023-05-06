import { BrowserRouter, Route, Routes } from "react-router-dom";
import React from "react";
import "./App.css";
import Header from "./modules/common/header/Header";
import MainContainer from "./modules/main/MainContainer";
import BoardContainer from "./modules/board/BoardContainer";
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <div className="App">
      <Header />
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<MainContainer />}></Route>
          <Route path="/board" element={<BoardContainer />}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
