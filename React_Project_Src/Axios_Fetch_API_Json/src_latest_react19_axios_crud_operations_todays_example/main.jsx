import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App'

import '../node_modules/bootstrap/dist/css/bootstrap.css'
import PostEmp from './PostEmp'
import PutEmp from './PutEmp'

const root =createRoot(document.getElementById('root'));


root.render(

  
  <StrictMode>
      


  <App></App>


  <PostEmp></PostEmp> <br />


  <PutEmp></PutEmp>
      
  </StrictMode>
);




