
import './App.css';
import { Counter } from './Counter';
import { Employee } from './Employee';
import Student from './Student';



function App() {
  return (
   
    <div>
        <h1>Welcome to App Component</h1>
      <Student name="javeed" course="java"></Student>

    <Employee name="rahul"  ></Employee>

    <Counter></Counter>

    </div>

  );
}

export default App;
