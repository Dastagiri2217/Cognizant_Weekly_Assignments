import './App.css';
import CohortDetails from './Components/CohortDetails';

function App() {
  const cohorts = [
    {
      name: "React Bootcamp",
      status: "ongoing",
      startDate: "2025-07-01",
      endDate: "2025-08-15",
      mentor: "Nithin Kumar"
    },
    {
      name: "Java Spring Cohort",
      status: "completed",
      startDate: "2025-05-01",
      endDate: "2025-06-15",
      mentor: "Dastagiri Dudekula"
    }
  ];

  return (
    <div className="App">
      <h1>Cognizant Academy Dashboard</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
