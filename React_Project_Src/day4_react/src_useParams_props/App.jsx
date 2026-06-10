import { BrowserRouter  , Routes, Route, HashRouter, MemoryRouter , Link } from "react-router-dom";


import { Home } from "./Home";
import { About } from "./About";

import { Payment } from "./Payment";

export function App(){



    return (


            <>

                 


                    <h1 >App Component</h1>
            
                {/* <BrowserRouter> */}

                {/* <HashRouter> */}

                <MemoryRouter>

                    <Link to="/"> Home</Link> <br />

                    <Link to="/about">AboutUs</Link>  <br />

                    <Link to="/payment/5000/javeed">Payment</Link>
                
                        <Routes>

                            <Route  path="/"  element={<Home />} ></Route>
                            <Route  path="/about"  element={<About  amount={9000}  name="king" />} ></Route>
                            <Route  path="/payment/:amount/:name"  element={<Payment />} ></Route>


                        </Routes>

                </MemoryRouter>
                
                {/* </HashRouter> */}
                
                {/* </BrowserRouter> */}
            
            
            </>

    )




}