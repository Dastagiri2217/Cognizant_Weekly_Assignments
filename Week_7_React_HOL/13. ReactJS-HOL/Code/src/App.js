import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [activeComponent, setActiveComponent] = useState('book');
  const [showCourse, setShowCourse] = useState(true);

  const renderComponent = () => {
    //if else
    if (activeComponent === 'book') return <BookDetails />;
    if (activeComponent === 'blog') return <BlogDetails />;
    if (activeComponent === 'course') return <CourseDetails />;
    return <p>Please select an option</p>;
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1> Blogger App</h1>

      {/* Buttons to switch views */}
      <button onClick={() => setActiveComponent('book')}>Book Details</button>
      <button onClick={() => setActiveComponent('blog')}>Blog Details</button>
      <button onClick={() => setActiveComponent('course')}>Course Details</button>
      <button onClick={() => setShowCourse(!showCourse)} style={{ marginLeft: '10px' }}>
        Toggle Course Component (ternary)
      </button>

      <hr />

      {/* Method 2: Variable-based conditional rendering */}
      {renderComponent()}

      {/* Method 3: Ternary operator */}
      <div style={{ marginTop: '20px' }}>
        {showCourse ? <CourseDetails /> : <p>Course Component Hidden</p>}
      </div>
    </div>
  );
}

export default App;
