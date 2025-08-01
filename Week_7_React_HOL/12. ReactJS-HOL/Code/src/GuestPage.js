import React from 'react';

const GuestPage = () => {
  return (
    <div>
      <h2>Welcome Guest </h2>
      <p>Here are the available flights you can browse:</p>
      <ul>
        <li>Flight A - Delhi to Mumbai - 6:00 AM</li>
        <li>Flight B - Chennai to Bangalore - 9:00 AM</li>
        <li>Flight C - Hyderabad to Kolkata - 2:30 PM</li>
      </ul>
      <p><strong>Login to book tickets.</strong></p>
    </div>
  );
};

export default GuestPage;
