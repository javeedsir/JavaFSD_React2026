

function mydata() {

    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const data = { name: "Rohit", age: 23 };
            resolve(data);
            
        }, 2000);
    });
}

mydata()
    .then((data) => {

        console.log("Data:", data);

        throw new Error('something went wrong');
    })
    .catch((error) => {
        console.error("Error: from catch ", error);
    });