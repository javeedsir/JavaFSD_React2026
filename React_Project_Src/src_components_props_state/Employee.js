import { Component } from "react";



export class Employee  extends Component{


            constructor(props){
                        super(props);
                    

                this.state = {

                        eid:101,
                        ename: this.props.name,
                        salary: 90000


                }



                         console.log(this.props)
            console.log(this.state)


            }


                    



    render(){

            return (    

                <>
                    <h1>Welcome to Employee : {this.props.name}</h1>
                   
                  
                   <h2>Eid:  {this.state.eid}</h2>
                    <h2>Ename: {this.state.ename}</h2>
                    <h2>Salary :{this.state.salary}</h2>
                
                
                </>




            );



    }







}