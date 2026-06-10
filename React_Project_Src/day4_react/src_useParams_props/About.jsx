import { useNavigate } from "react-router-dom"





export function About(props){

         const  navigate =       useNavigate();


    const  handler = () =>{

                navigate('/');  // it will redirect to home component

    }

  


    return (


            <div>
                          <h1 className="text-danger">AboutUs Component</h1> 
                          <h2> Amount: {props.amount}  and  Name : {props.name}</h2>

                          <button onClick={handler} >GoBackHome</button> <br />


                          <button  onClick={ ()=>{  navigate('/payment/'+props.amount+'/'+props.name)   }}>Pay</button>


            </div>

          

    )




}