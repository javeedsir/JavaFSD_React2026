

import React ,{useState} from "react";

//create a custom hook
function useCustomCounter()
{
    const [count,setCount]=useState(0);

    const handleIncrement= ()=>
    {
        setCount(count + 1);
    }
    return {
        count,
        handleIncrement
    }
}
export default useCustomCounter;
