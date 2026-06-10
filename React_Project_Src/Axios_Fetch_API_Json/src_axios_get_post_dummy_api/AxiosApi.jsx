import axios from "axios";

import { useState } from "react";

export function AxiosApi()
{

    const [data,setData]= useState([]);
    const apiGet=()=>
    {

            axios.get('https://jsonplaceholder.typicode.com/users')
            .then( (response)=>{

                 console.log(response.data)

                 setData(response.data)

                   

            })
            .catch((error)=>{ 

                    setData(error)

            });


    }


    return(



                <>

                

                    <h1>List of User using Axios API</h1>

                    <button onClick={apiGet}>Fetch Countries API </button> <br />

                    <div>
            <table className="table table-dark">
             <thead>
                 <tr>
                     <th>ID</th>
                     <th>Name</th>
                     <th>UserName</th>
                     <th>Email</th>
                 </tr>
             </thead>
             <tbody>
                {
                    data.map((item)=>
                   <tr key={item.id}>
                       <td>{item.id}</td>
                       <td>{item.name}</td>
                       <td>{item.username}</td>
                       <td>{item.email}</td>
                    </tr>
                    )
                }
            </tbody>
 
            </table>
            </div>
                
                
                </>


    )


}