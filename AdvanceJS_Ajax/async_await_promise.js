

async function fetchData() {
  try {
    // Simulated API response (mock data)
    const response = await Promise.resolve({
      json: async () => ({
        userId: 1,
        id: 1,
        title: "Sample Post",
        body: "This is mock data for async/await demonstration"
      })
    });

    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error("Error fetching data:", error);
  }
}

fetchData();