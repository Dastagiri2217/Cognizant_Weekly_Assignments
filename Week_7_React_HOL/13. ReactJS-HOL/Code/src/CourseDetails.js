import React from 'react';

const courses = [
  { id: 'r1', name: 'React Basics', duration: '4 weeks' },
  { id: 'r2', name: 'Advanced React', duration: '6 weeks' }
];

const CourseDetails = () => {
  return (
    <div>
      <h2>🎓 Course Details</h2>
      {courses.map(course => (
        <CourseItem key={course.id} course={course} />
      ))}
    </div>
  );
};

// Extracted component using keys
const CourseItem = ({ course }) => {
  return (
    <div style={{ marginBottom: '10px' }}>
      <strong>{course.name}</strong> - {course.duration}
    </div>
  );
};

export default CourseDetails;
