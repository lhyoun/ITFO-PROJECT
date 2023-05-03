import { useQuery } from "react-query";
import { GET } from "../../http";
import { url } from "../../http/url";
import { keys } from "./key";

export const useTest = () => {
  return useQuery(keys.test, () => GET(url.test));
};
