import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import App from './Mounting'
import Mounting from './Mounting'
import { Updating } from './Updating'
import { UnMounting } from './UnMounting'

const root =createRoot(document.getElementById('root')).render(

  
  <StrictMode>
      
{/* 
  <Mounting pname='javeed' ></Mounting> */}
    
  {/* <Updating  favcolor='red'></Updating> */}


  <UnMounting></UnMounting>


      
  </StrictMode>
);

// setTimeout(() => {
//      root.unmount(UnMounting);
//     console.log('React root unmounted.');
//   }, 2000); 



