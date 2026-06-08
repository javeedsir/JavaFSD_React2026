import React from "react";

import { Component } from "react";

export default class App extends Component {
        constructor(props)
        {
                super(props);
                this.state={
                      eid:0,
                      ename:"",
                      salary:0.0
                }
                //create ref
                this.textInput1=React.createRef();
                this.textInput2=React.createRef();
                this.textInput3=React.createRef();

        }
        handleSubmit=(e)=>
        {
               e.preventDefault();
               //set the data of text field to state.
               this.setState({eid:this.textInput1.current.value});
                this.setState({ename:this.textInput2.current.value});
                 this.setState({salary:this.textInput3.current.value});
        }
       
        componentDidMount=()=>
        {
           this.textInput1.current.focus();
        }
        render() {
                return (
                        <div>
                           <h1>You Enter Details : {this.state.eid} {this.state.ename} {this.state.salary}</h1>
                           <form onSubmit={this.handleSubmit}>
                              EID : <input type="text" ref={this.textInput1}/> <br></br>
                               ENAME : <input type="text" ref={this.textInput2}/> <br></br>
                                SALARY : <input type="text" ref={this.textInput3}/> <br></br>
                              <button type="submit" >Submit</button>
                           </form>
                        </div>
                )
        }
  }

    
