import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: "INTADMDF10 -.NET FSD",
      startDate: "22-Feb-2022",
      status: "Scheduled",
      coach: "Aathma",
      trainer: "Jojo Jose"
    },
    {
      name: "ADM21JF014 - Java FSD",
      startDate: "10-Sep-2021",
      status: "Ongoing",
      coach: "Apoorv",
      trainer: "Elisa Smith"
    },
    {
      name: "CDBJF21025 - Java FSD",
      startDate: "24-Dec-2021",
      status: "Ongoing",
      coach: "Aathma",
      trainer: "John Doe"
    }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h2>Cohorts Details</h2>
      {cohorts.map((cohort, index) => (
        <CohortDetails
          key={index}
          name={cohort.name}
          startDate={cohort.startDate}
          status={cohort.status}
          coach={cohort.coach}
          trainer={cohort.trainer}
        />
      ))}
    </div>
  );
}

export default App;
