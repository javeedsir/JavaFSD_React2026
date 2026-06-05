import { Component } from "react";
import { Greeting } from "./Greeting";

import { LoginButton } from "./LoginButton";
import { LogoutButton } from "./LogoutButton";

export class GreetingComponent extends Component{


        constructor(){

                super();

                this.state = {

                        isLoggedIn : false

                }


        }



       handleLoginClick = ()=>{

                alert("login Success ")

       } 

       


     render(){

        const  isLoggedIn = this.state.isLoggedIn;
        let button = null;

        if(isLoggedIn){

            button = <LogoutButton  />


        }

        else {

             button = <LoginButton  />
        }

        return (

                <div>

                    <Greeting  isLoggedIn = {isLoggedIn}></Greeting>

                    {button}


                </div>



        );




     }






}