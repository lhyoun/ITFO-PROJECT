import styled from "styled-components";
import React, { useEffect } from "react";
import { useTest } from "../../../common/hook/query";

const Header = () => {
  const test = useTest();

  return (
    <div style={{ backgroundColor: "yellow" }}>
      {`헤더입니다.` + test?.data}
    </div>
  );
};

export default Header;

const Header_ = styled.div`
  background: yellow;
`;
