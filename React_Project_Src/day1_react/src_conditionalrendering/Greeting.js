import { GuestGreeting } from "./GuestGreeting";
import { UserGreeting } from "./UserGreeting";



export function Greeting(props){


    const  isLoggedIn = props.isLoggedIn;

    if(isLoggedIn){

            return <UserGreeting uname="javeed"></UserGreeting>

    }

    return <GuestGreeting  gname="tom"/>




}