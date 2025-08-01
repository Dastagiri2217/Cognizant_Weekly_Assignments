import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat', score: 99 },
    { name: 'Rohit', score: 45 },
    { name: 'Dhoni', score: 77 },
    { name: 'KL Rahul', score: 60 },
    { name: 'Hardik', score: 80 },
    { name: 'Jadeja', score: 55 },
    { name: 'Shami', score: 65 },
    { name: 'Bumrah', score: 88 },
    { name: 'Gill', score: 40 },
    { name: 'Surya', score: 70 },
    { name: 'Pant', score: 72 }
  ];

  // Function to sort the low Score Players
  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - Score: {player.score}</li>
        ))}
      </ul>

      <h2>Players with Score Below 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - Score: {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
