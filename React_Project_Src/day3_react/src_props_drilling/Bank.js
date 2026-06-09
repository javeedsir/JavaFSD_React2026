
import { Customer } from "./Customer";

export function  Bank(props){


    return(

            <div>
                    <h1>Bank Component</h1>
                    <h2>Data : {props.data} </h2>

                    <Customer  data = {props.data} />

            </div>


    );


}