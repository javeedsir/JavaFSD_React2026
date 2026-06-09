
import { useState } from "react";


export function Demo(){


const nameStateVariable=useState("Alan");
    const name=nameStateVariable[0];
    const setName=nameStateVariable[1];

    const handleClick=()=>
    {
           setName("Kelvin"); 
    }
    return (
        <div>
            <h1>Name : {name}</h1>
            <button onClick={handleClick}>clickMe</button>
        </div>
    )









}