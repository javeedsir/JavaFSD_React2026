
import axios from "axios";


export  function  Delete({eid}){




                        

        axios.delete('http://localhost:3000/employees/'+eid)
        .then((response)=>{ console.log("Delete Status ",response.status)})
        .catch((err)=>{ console.log(err)});



}




