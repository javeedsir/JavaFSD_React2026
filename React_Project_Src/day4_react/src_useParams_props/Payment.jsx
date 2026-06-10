import { useParams } from "react-router-dom"



export function Payment(){

            const { amount , name} =    useParams();


    return (

                <>
                
                    <h1>Payment Component</h1>
                    <h2>Name: {name }</h2>
                    <h2>Amount from App : {amount}</h2>
                
                </>





    )




}