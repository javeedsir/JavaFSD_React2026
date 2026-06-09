import { useState, useEffect } from "react";
function App()
{
    const [count,setCount]=useState(0);

    const handleClick=()=>
    {
           setCount(count+1); 
    }

    useEffect(() => {  
        // Update the document title using the browser API  
        document.title = `You clicked ${count} times`;  
      });  
    return (
        <div>
            <h1>You clicked  {count} Times</h1>
            <button onClick={handleClick}>clickMe</button>
        </div>
    )
}
export default App;

