import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {

      const[name,setName] = useState('javeed');

  
  function handleChange(e){


      console.log(e.target.value);

      setName(e.target.value)

  }


  return (
   
    

      <div>
                           <form>
                            <h2>Controlled by React</h2>
                            <input type="text"  name='name'  value={name}  onChange={handleChange}/>
                            </form>
                        </div>


  );
}




export default App;
