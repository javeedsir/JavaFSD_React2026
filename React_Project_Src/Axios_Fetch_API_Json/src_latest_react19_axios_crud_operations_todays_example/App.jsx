import axios from "axios"
import { useState } from "react"
import { Delete } from "./Delete";

import { BrowserRouter , Routes, Route , Link } from "react-router-dom";



export function App(){


            const[empList , setEmpList] = useState([]);





        const  getAllEmployees = ()=>{




                    axios.get('http://localhost:3000/employees')
                    .then(

                            (response) =>{

                                    setEmpList(response.data)

                            }

                    )




        }


           




        return(



                <>
                

                <h1>List of Employees using Axios API</h1>

<button onClick={getAllEmployees}>Fetch Employees API </button> <br />

<div>
<table className="table table-dark">
<thead>
<tr>
 <th>ID</th>
 <th>EName</th>
 <th>Salary</th>
 <th>Delete Record</th>
</tr>
</thead>
<tbody>
{
empList.map((item)=>
<tr key={item.id}>
   <td>{item.id}</td>
   <td>{item.ename}</td>
   <td>{item.salary}</td>
   <td>
      
      <BrowserRouter>

        <button className="btn btn-danger"> <Link to='/delete'>Delete</Link></button>
      
        <Routes>

                <Route  path='/delete'   element={<Delete eid={item.id}></Delete>}></Route>

        </Routes>
      
      </BrowserRouter>
    
    </td>
 
</tr>
)
}
</tbody>

</table>
</div>
                
                
                </>




        )







}