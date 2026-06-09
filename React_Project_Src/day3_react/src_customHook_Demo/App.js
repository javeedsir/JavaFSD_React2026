import logo from './logo.svg';
import './App.css';
import useCustomCounter from './Custom';

function App() {

  //storing custom hook 
    const data=useCustomCounter();

     const data2=useCustomCounter();

    return (
            <>
                <h1>Count up : {data.count}</h1>
                <button onClick={data.handleIncrement}>Click</button>
                <br></br>

                <h1>Count up : {data2.count}</h1>
                <button onClick={data2.handleIncrement}>Click</button>
      </>

  );
}

export default App;
