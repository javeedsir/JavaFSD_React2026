import { useNavigate } from "react-router-dom"





export function  Cart(){


                const navigate = useNavigate();



           const     handleClick = ()=>
                    {
                
                            navigate('/payment');  // redirecting from cart page to the payment page
                
                
                    }
                

              

    return (

            <>
            
                <h1> This is Cart Web Page</h1>

                <button onClick={handleClick}>Do Payment</button>
            
            </>



    )




}