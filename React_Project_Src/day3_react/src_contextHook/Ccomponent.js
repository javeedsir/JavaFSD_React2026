import { UserContext } from "./App";




export function  Ccomponent(){


        return(


                <div>
                    <h1>Ccomponent</h1>

                    <UserContext.Consumer>
                            {

                                    (user)=>{

                                        return <div>The value is : {user}</div>
                                    }

                            }


                    </UserContext.Consumer>
                   

                </div>


        );


}