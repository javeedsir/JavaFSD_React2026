import React,{useState} from 'react';
import './App.css'


function  App() {


    const [userRegistration,setUserRegistration]= useState({
            username:"",
            password:"",
            date:"",
            category:"",

    })

   const [records,setRecords]= useState([]);

    const handleChange =(e)=>
    {
        const name= e.target.name;
        const value= e.target.value;
         setUserRegistration({... userRegistration,[name]:value});   //this.setState({username:"javeed"}); 
    }
   const handleSubmit = (e) => {
      e.preventDefault();
      console.log(JSON.stringify(userRegistration));
      const newRecord={... userRegistration, id:new Date().getTime().toString()}; 
      setRecords([... records,newRecord]);

      //making data empty after submition
      setUserRegistration({username:"",password:"",date:"",category:""});
   }

   
   return (
               
     <>
        <div className="container mt-5">
           <form onSubmit={handleSubmit}>
            <label htmlFor="username">UserName:</label>
            <input type="text" className="form-control" name="username" placeholder="Enter the name " 
               value={userRegistration.username}
               onChange={handleChange} />

            <label htmlFor="password" className="mt-3">Password</label>
            <input type="password" className="form-control" name="password" placeholder="Enter the password"
               value={userRegistration.password}
               onChange={handleChange} />

            <label htmlFor="date" className="mt-3">Date</label>
            <input type="date" className="form-control" name="date" placeholder="Enter the date" 
               value={userRegistration.date}
               onChange={handleChange} />

            <label htmlFor="category" className="mt-3">Category</label>
            <select className="form-control" name="category"
               value={userRegistration.category}
               onChange={handleChange} >
              <option value="">Select</option>
              <option value="Food">Food</option>
              <option value="Entertainment">Entertainment</option>
              <option value="Academic">Academic</option>
            </select>
           
            <input type="submit" className="btn btn-primary w-100 mt-4" value="Submit" />
           </form>
          
           <div>
              {
                 records.map(currElement=>
                  {
                     return (
                        <div>
                           {currElement.username}
                           {currElement.password}
                           {currElement.date}
                           {currElement.category}
                        </div>
                     )
                  })
              }
           </div> 
         
         </div>

         </>

       
      )
   }
export default App;
