


let xhttp = new XMLHttpRequest();

console.log(xhttp);

xhttp.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200 ) {

    
    
    console.log(this.responseText);

  }
};
xhttp.open("POST", "https://fakestoreapi.com/carts", true);

let str = `{
  "id": 121,
  "userId": 21,
  "products": [
    {
      "id": 91,
      "title": "LAPTOP",
      "price": 30000.0,
      "description": "dell laptop",
      "category": "touch screen",
      "image": "http://example.com"
    }
  ]
}`;

xhttp.send(str);




xhttp.open("GET", "https://fakestoreapi.com/carts", true);

xhttp.send();