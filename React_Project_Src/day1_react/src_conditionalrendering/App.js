
import './App.css';
import { Greeting } from './Greeting';
import { GreetingComponent } from './GreetingComponent';

function App() {
  return (
    <div className="cls1">

      <h1 >WELCOME to App Component</h1>
      
      {/* <Greeting  isLoggedIn={true}/> */}

      <GreetingComponent></GreetingComponent>

    </div>
  );
}

export default App;
