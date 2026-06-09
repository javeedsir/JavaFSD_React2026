import { createContext } from 'react';
import './App.css';

import { AComponent } from './AComponent';

export  const  UserContext = createContext();

function App() {
  return (
    <div className="cls1">

      <h1 >WELCOME FRIENDS</h1>
      
        <UserContext.Provider value={ 'javeed' }>

        <AComponent></AComponent>

        </UserContext.Provider>

    </div>
  );
}

export default App;
