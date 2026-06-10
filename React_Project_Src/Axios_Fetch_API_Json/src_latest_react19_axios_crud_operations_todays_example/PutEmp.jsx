



import React, { Component } from 'react'
import axios from "axios";

export default class PutEmp  extends Component {
    constructor(props)
    {
        super(props);

        this.state={
            id: 0,
            ename:"",
            salary:0
        }
    }

    changeHandler=(e)=>
    {
        this.setState({[e.target.name]:e.target.value})
    }

    submitHandler=e =>
    {
        e.preventDefault();
        console.log(this.state);
        axios.put('http://localhost:3000/employees/'+this.state.id,this.state)
        .then(response=>
            {
                console.log(response);
            })
            .catch(error=>
                {
                    console.log(error)
                })           
    }

  render() {
    const {id,ename,salary}=this.state;

    return (
      <div className='container  col-md-6'>

         <h1>Update Employee details here</h1>
          <form onSubmit={this.submitHandler}>
            <div>
            Enter Id:    <input type="text" className='form-control'  name="id"
                value={id}
                onChange={this.changeHandler}/>
            </div>
            <div>
            Enter EName:    <input type="text" name="ename"  className='form-control' 
                value={ename}
                onChange={this.changeHandler}/>
            </div>
            <div>
            Enter Salary:    <input type="text" name="salary"   className='form-control' 
                value={salary}
                onChange={this.changeHandler}/>
            </div>
            <button type="submit"  className='btn btn-success  mt-4'>Update Emp</button>.
          </form>
      </div>
    )
  }
}
