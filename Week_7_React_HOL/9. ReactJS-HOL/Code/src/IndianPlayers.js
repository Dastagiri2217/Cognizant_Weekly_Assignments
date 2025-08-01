import React from 'react';

const IndianPlayers = () => {
  const players = ['Virat', 'Rohit', 'Dhoni', 'KL Rahul', 'Hardik', 'Jadeja'];

  // Destructuring
  const [p1, p2, p3, p4, ...rest] = players;

  const oddTeam = [p1, p3, ...rest.filter((_, idx) => idx % 2 === 0)];
  const evenTeam = [p2, p4, ...rest.filter((_, idx) => idx % 2 !== 0)];

  // Merging arrays using spread
  const T20players = ['Surya', 'Gill', 'Pant'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane'];

  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>

      <h2>Merged Team: T20 + Ranji Trophy Players</h2>
      <ul>
        {allPlayers.map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
