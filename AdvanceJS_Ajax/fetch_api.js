

fetch('https://fakestoreapi.com/carts')
  .then(response => response.json())
  .then(data => console.log(data))
  .catch((err)=>{ console.log(err)});