import logo from './logo.svg';
import './App.css';
import { Hello } from './Hello';
import { Button } from './Button';

function App() {
  return (
   
    <div>

      

      <h1>HELLO FRIENDS</h1>
      <h2>WELCOME TO REACT</h2>

      <Hello></Hello> <br></br>

      <Button name="login" />
       <Button name="logout" />
        <Button name="order" />

    </div>

  );
}

export default App;
