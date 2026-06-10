


import React, { Component } from 'react'
import axios from "axios";

export default class PostForm  extends Component {
    constructor(props)
    {
        super(props);

        this.state={
            id:"",
            title:"",
            author:""
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
        axios.post('https://jsonplaceholder.typicode.com/posts',this.state)
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
    const {id,title,author}=this.state;

    return (
      <div className='container  col-md-6'>
          <form onSubmit={this.submitHandler}>
            <div>
            Enter Id:    <input type="text" className='form-control'  name="id"
                value={id}
                onChange={this.changeHandler}/>
            </div>
            <div>
            Enter Title:    <input type="text" name="title"  className='form-control' 
                value={title}
                onChange={this.changeHandler}/>
            </div>
            <div>
            Enter Author:    <input type="text" name="author"   className='form-control' 
                value={author}
                onChange={this.changeHandler}/>
            </div>
            <button type="submit"  className='btn btn-primary  mt-4'>submit</button>.
          </form>
      </div>
    )
  }
}
