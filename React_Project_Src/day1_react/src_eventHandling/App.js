import logo from './logo.svg';
import './App.css'
import { useState } from 'react';


function App() {

    const[name,setName] =         useState("");


  return (
   
    <div>

      

      <h1>HELLO FRIENDS</h1>

        <button type="button" onClick={ ()=>{  setName('javeed')  }   }  >HandleEvent1</button>

        <button type="button" onClick= {  handle } >HandleEvent2</button>

        <h2>Name:  {name}</h2>
    

    </div>

  );


  function  handle(){

        f1('king khan');

  }



function f1(data){

    setName(data);


}





}

export default App;
