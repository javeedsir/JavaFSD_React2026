

function myFunction(callback) {
    setTimeout(() => {
        const data = { name: "Aman", age: 21 };
        callback(data);
    }, 3000);
}

myFunction((data) => {
    console.log("Data:", data);
});