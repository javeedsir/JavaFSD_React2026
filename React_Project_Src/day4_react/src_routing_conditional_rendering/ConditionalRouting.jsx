



import React from 'react';
import { BrowserRouter as Router, Routes, Route, Navigate , Link ,NavLink } from 'react-router-dom';

export function ConditionalRouting() {
  const isAuthenticated = true; // Replace with actual authentication logic





  return (
    <Router>

                
<center>

<Link  style={{margin:"0px 50px"}}  to="/">Home Page</Link>
<Link   style={{margin:"0px 50px"}}  to="/public">Public Page</Link>
<NavLink  style={{margin:"0px 50px"}}  to="/login" >Login Page</NavLink>

<Link   style={{margin:"0px 50px"}}  to="/protected">Protected/Authenticated Page</Link>

</center>


      <Routes>
        <Route path="/public" element={<h1>Public Page</h1>} />
        <Route
          path="/protected"
          element={isAuthenticated ? <h1>Protected Page</h1> : <Navigate to="/login" replace />}
        />
        <Route path="/login" element={<h1>Login Page</h1>} />
        <Route path="/" element={<h1>Home Page</h1>} />
      </Routes>
    </Router>
  );
}
