import React from 'react';

function App() {
  // JSX heading
  const heading = <h1 style={{ textAlign: 'center' }}> Office Space Rental App</h1>;

  // JSX image with attribute
const imageUrl = 'https://images.unsplash.com/photo-1596495577886-d920f1fb7238?auto=format&fit=crop&w=800&q=60';

  // Office object
  const office = {
    name: 'WorkNest',
    rent: 75000,
    address: 'MG Road, Bengaluru'
  };

  // List of office spaces
  const offices = [
    { name: 'CodeHub', rent: 45000, address: 'Koramangala, Bengaluru' },
    { name: 'TechNestle', rent: 62000, address: 'Hitech City, Hyderabad' },
    { name: 'InnoPace', rent: 58000, address: 'Cyber City, Pune' },
    { name: 'BizWorks', rent: 80000, address: 'Central Mumbai, Mumbai' }
  ];

  return (
    <div style={{ fontFamily: 'Arial', padding: '20px' }}>
      {heading}

      <img src={imageUrl} alt="Office" style={{ width: '50%', height: 'auto', marginBottom: '20px',marginLeft:'300px'}} />

      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p><strong>Rent:</strong> ₹<span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>{office.rent}</span></p>
      <p><strong>Address:</strong> {office.address}</p>

      <h2>Available Office Spaces</h2>
      <ul style={{ listStyle: 'none', padding: 0 }}>
        {offices.map((item, index) => (
          <li key={index} style={{ marginBottom: '15px', border: '1px solid #ccc', borderRadius: '6px', padding: '10px' }}>
            <p><strong>Name:</strong> {item.name}</p>
            <p>
              <strong>Rent:</strong> ₹
              <span style={{ color: item.rent < 60000 ? 'red' : 'green' }}>{item.rent}</span>
            </p>
            <p><strong>Address:</strong> {item.address}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
