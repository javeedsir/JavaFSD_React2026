import { BrowserRouter , Routes , Route , NavLink } from "react-router-dom";
import { Signup } from "./Signup";
import { Cart } from "./Cart";
import { Payment } from "./Payment";
import { Login } from "./Login";



export function  App(){





    return(


                <>

<BrowserRouter>




<nav className="navbar navbar-expand-lg navbar-dark bg-dark">
      
      <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span className="navbar-toggler-icon"></span>
      </button>
      <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div className="navbar-nav">
        <NavLink style={{margin:"0px 50px"}}   to="/" >Login</NavLink>
        <NavLink  style={{margin:"0px 50px"}}  to="/signup" >SignUp</NavLink>
        <NavLink style={{margin:"0px 50px"}}  to="/cart" >Cart</NavLink>
        <NavLink  style={{margin:"0px 50px"}} to="/payment" >Pay</NavLink>

        </div>
      </div>
    </nav>
  
                
                    <Routes>


                            <Route  path="/"  element={<Login />}></Route>
                            <Route  path="/signup"  element={<Signup />}></Route>
                            <Route  path="/cart"  element={<Cart />}></Route>
                            <Route  path="/payment"  element={<Payment />}></Route>



                    </Routes>
                
                
                
                </BrowserRouter>








                
                </>








    )








}