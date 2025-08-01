import React from 'react';
import ListOfPlayers from './ListOfPlayers';
import IndianPlayers from './IndianPlayers';

const App = () => {
  const flag = false;

  return (
    <div style={{ padding: '25px', fontFamily: 'Times New Roman' }}>
      <h1> Cricket App - 2025</h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
};

export default App;
