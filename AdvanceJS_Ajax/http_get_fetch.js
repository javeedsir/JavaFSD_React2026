

//  main.js
 
//  GET request using fetch()
fetch("https://jsonplaceholder.typicode.com/users")
  
    // Converting received data to JSON
    .then(response => response.json())
    .then(json => {
 
        // Create a variable to store HTML
        let li = `<tr><th>Name</th><th>Email</th></tr>`;
      
        // Loop through each data and add a table row
        json.forEach(user => {
            li += `<tr>
                <td>${user.name} </td>
                <td>${user.email}</td>         
            </tr>`;
        });
 
    // Display result
    document.getElementById("users").innerHTML = li;
});