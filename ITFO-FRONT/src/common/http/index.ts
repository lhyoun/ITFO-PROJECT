const root = "http://127.0.0.1:8080";

export const GET = async (url: string) => {
  const headers = {
    "Content-Type": "application/json",
  };

  const response = await fetch(`${root}/${url}`, {
    method: "GET",
    headers: headers,
  })
    .then((result) => {
      return result.text();
    })
    .catch((e) => {
      return {};
    });

  return response;
};
