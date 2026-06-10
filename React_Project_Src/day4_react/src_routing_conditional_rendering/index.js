import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'

import { App } from './App';

import { ItemList } from './ItemList';


import '../node_modules/bootstrap/dist/css/bootstrap.css'
import StatusDisplay from './StatusDisplay';
import { ConditionalRouting } from './ConditionalRouting';

const root =createRoot(document.getElementById('root'));


root.render(

  
  <StrictMode>
      

    <App  isLoggedIn={false}></App> <br />


    <StatusDisplay status='error'></StatusDisplay> <br />


    <ConditionalRouting></ConditionalRouting>





      
  </StrictMode>
);




