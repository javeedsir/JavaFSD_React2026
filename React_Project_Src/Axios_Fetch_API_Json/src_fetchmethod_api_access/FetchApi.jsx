
import { useState } from "react";


export function FetchApi(){


                const[userData , setUserData] =    useState([]);


        const getApi = ()=>{



                fetch("https://jsonplaceholder.typicode.com/users")
                .then((response)=>{ return response.json()})
                .then( (data)=>{

                        console.log(data); // data variable is holding json user array

                        setUserData(data);


                })


        }




    return(

            <>
            
                <h1>Fetch Users Data from API</h1>

                <button onClick={getApi}>Show Users</button> <br />

                {/* {JSON.stringify(userData)} */}

                {

                        userData.map(

                                (user)=>{

                                        return  <li>{user.id} : {user.name}  : {user.email}</li>

                                }

                        )


                }
                

                <br></br> 
            
            <div className="col-md-5">
            <table  className="table table-dark">
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
                    userData.map(
                        (item)=>
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