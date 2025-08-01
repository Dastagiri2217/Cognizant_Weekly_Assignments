import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euro: null
    };
  }

  handleChange = (event) => {
    this.setState({ rupees: event.target.value });
  };

  handleSubmit = () => {
    const rate = 0.011; // Example conversion rate: 1 INR = 0.011 EUR
    const converted = (this.state.rupees * rate).toFixed(2);
    this.setState({ euro: converted });
  };

  render() {
    return (
      <div>
        <h2>💱 Currency Converter</h2>
        <label>Enter ₹ Rupees: </label>
        <input
          type="number"
          value={this.state.rupees}
          onChange={this.handleChange}
          style={{ marginRight: '10px' }}
        />
        <button onClick={this.handleSubmit}>Convert</button>

        {this.state.euro !== null && (
          <p>Converted: € {this.state.euro}</p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
