import logo from './logo.svg';
import './App.css';
import {BrowserRouter , Routes , Route , Link}  from 'react-router-dom'

import { Home } from './Home';
import { About } from './About';
import { Service } from './Service';
import { Error } from './Error';

function App() {
  return (
   
    <div>

      

  <BrowserRouter>

            <center>
            <Link style={{margin:"0px 50px"}} to="/"> Home </Link>    
            <Link style={{margin:"0px 50px"}} to="/about"> About </Link>    
            <Link style={{margin:"0px 50px"}} to="/service"> Service </Link> 
             <Link style={{margin:"0px 50px"}} to="/error"> Not Found </Link> 

            <Link style={{margin:"0px 50px"}} to="/error"><button>Error</button></Link> 
            </center>
            <hr/>     



            <Routes>
                <Route exact path='/' element={<Home/>}></Route>
                <Route path='/about' element={<About/>}></Route>
                <Route path='/service' element={<Service/>}></Route>
                <Route path='*' element={<Error/>}></Route>
            </Routes>
        </BrowserRouter>



      

   </div>

  );
}

export default App;
