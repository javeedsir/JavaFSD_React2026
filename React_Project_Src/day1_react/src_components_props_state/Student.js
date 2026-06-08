import React, { StrictMode } from "react";

// export  function  Student(props){

//     return(

//         <div>

//                 <h1>Welcome to Student Component</h1>
//                 <h2>Name: {props.name}</h2>
//                 <h2>Course: {props.course}</h2>

//         </div>



//     );





// }





const Student=(props)=>
{
  return( 
 <>
  <h1>Hello {props.name} </h1> 
  <h2>Course: {props.course}</h2>

 </>
  );
}

export default Student;











