import React from 'react';
import CurrencyConverter from './CurrencyConverter';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };

    // Binding methods
    this.increment = this.increment.bind(this);
    this.sayHello = this.sayHello.bind(this);
  }

  // Method 1: Increments counter
  increment() {
    this.setState(prevState => ({
      count: prevState.count + 1
    }));
    this.sayHello();
  }

  // Method 2: Prints a hello message
  sayHello() {
    console.log('Hello! This is a static message.');
  }

  // Arrow function: Decrement
  decrement = () => {
    this.setState(prevState => ({
      count: prevState.count - 1
    }));
  };

  // Event handler with argument
  sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic event handler
  handleClick = (event) => {
    console.log('Synthetic Event Type:', event.type);
    alert('I was clicked');
  };

  render() {
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial', maxWidth: '600px', margin: 'auto' }}>
        <h1> React Event Handling Examples</h1>

        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement} style={{ marginLeft: '10px' }}>Decrement</button>

        <h3>Say Welcome Button</h3>
        <button onClick={() => this.sayWelcome("Welcome to React Event Handling!")}>
          Say Welcome
        </button>

        <h3>Synthetic Event Example</h3>
        <button onClick={this.handleClick}>OnPress</button>

        <hr />

        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
