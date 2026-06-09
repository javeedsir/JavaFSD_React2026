
import {useState , useCallback} from 'react';

import Title from './Title';
import Student from './Student';
import Button from './Button';
function App()
{
  const [age,setAge]=useState(18);
   const [sal,setSal]=useState(1000);


  const incrementAge= useCallback(()=>
  {
      setAge(age+1);
  },[age]);
  
  const incrementSalary= useCallback(()=>
  {
      setSal(sal + 1000);
  },[sal])




  return (
    <div>
      <Title/>
     <Student text="age" count={age} />
     <Button handleClick={incrementAge}>Increment age</Button>
     <Student text="salary" count={sal} />
     <Button handleClick={incrementSalary}>Increment sal</Button>
    </div>
  )

}
export default App;