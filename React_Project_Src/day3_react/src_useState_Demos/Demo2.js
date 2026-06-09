
import { useState } from "react";

export function Demo2(){


     const [name,setName]=useState("Javeed");

    const handleClick=()=>
    {
           setName("Javeed Khan"); 
    }
    return (
        <div>
            <h1>Name : {name}</h1>
            <button onClick={handleClick}>clickMe</button>
        </div>
    )



}