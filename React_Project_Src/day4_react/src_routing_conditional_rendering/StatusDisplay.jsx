


import React from 'react';

const StatusDisplay = ({status}) => {
  let contentToRender;

  switch (status) {
    case 'loading':
      contentToRender = <h1 style = {{ color:'yellow'}}>Loading data...</h1>;
      break;
    case 'success':
      contentToRender = <h1 style={{color: 'green'}}>Data loaded successfully!</h1>;
      break;
    case 'error':
      contentToRender = <h1 style={{ color: 'red' }}>Error: Could not load data.</h1>;
      break;
    default:
      contentToRender = <p  style={{ color: 'red' }}>Unknown status.</p>;
  }

  return (
    <div>
      <h2>Application Status:</h2>
      {contentToRender}
    </div>
  );
};

export default StatusDisplay;