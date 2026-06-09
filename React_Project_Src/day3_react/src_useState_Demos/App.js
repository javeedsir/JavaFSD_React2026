import './App.css';

import { useState } from 'react';
import { Demo } from './Demo';
import { Demo2 } from './Demo2';

function App() {
   const nameStateArray=useState("Alan");

    const handleClick=()=>
    {
           nameStateArray[1]("Kelvin"); 
    }
    return (
        <div>
            <h1>Name : {nameStateArray[0]}</h1>
            <button onClick={handleClick}>clickMe</button>

            <Demo></Demo>  <br/>

            <Demo2></Demo2>
        </div>
    )

}

export default App;
