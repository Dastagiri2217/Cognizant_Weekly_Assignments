import './App.css';
import { CalculateScore } from './Components/calculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore Name={"Dastagiri"}
      School={"AP MODEL SCHOOL GARLADINNE"}
      total={599}
      goal={6}
      />
    </div>
  );
}

export default App;
