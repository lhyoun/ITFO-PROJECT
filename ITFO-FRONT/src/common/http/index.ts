const root = "";

export const GET = (url: string) => {
  const headers = {};

  const response = fetch(url, {
    method: "GET",
    headers: headers,
  })
    .then(async (result) => {
      return result.json();
    })
    .catch((e) => {
      return {};
    });

  return response;
};
