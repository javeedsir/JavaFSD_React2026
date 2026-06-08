
import bigpic  from './assets/big.png'

  function App(){




    return (

        <div>App Component

           <h1  className='alert alert-primary'>Welcome to Boostrap in Reactjs</h1> 

          <img src={process.env.PUBLIC_URL +"/logo.png" } /> <br></br>


          <img src={bigpic}  alt="big logo" />



        </div>


    );



}

export default App;