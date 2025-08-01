import React, { Component } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    let pageContent;

    // Element variable based on condition
    if (this.state.isLoggedIn) {
      pageContent = <UserPage />;
    } else {
      pageContent = <GuestPage />;
    }

    return (
      <div style={{ fontFamily: 'Arial', padding: '20px', maxWidth: '700px', margin: 'auto' }}>
        <h1> Ticket Booking App</h1>

        
        {this.state.isLoggedIn ? (
           <button onClick={this.handleLogout} className="button-danger">Logout</button>
            ) : (
               <button onClick={this.handleLogin} className="button-primary">Login</button>
                )}
        <hr />

        
        {pageContent}
      </div>
    );
  }
}

export default App;
