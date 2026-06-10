import { Guest } from "./Guest";
import { User } from "./User";

import { ItemList } from "./ItemList";



export function App(props){


      const     isLoggedIn =         props.isLoggedIn;



            // if(isLoggedIn){


            //         return <User name='king'></User>

            // }

            // else{

            //         return <Guest></Guest>

            // }


    return(        <div>
            {isLoggedIn ? <h1>Welcome, user! </h1> : <h1>Please log in to continue.</h1>}  <br />


            <ItemList items={['apple','banana','orange','mango']}></ItemList>




          </div>




    )


}