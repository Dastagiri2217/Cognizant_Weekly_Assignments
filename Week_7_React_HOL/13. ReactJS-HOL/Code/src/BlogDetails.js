import React from 'react';

const blogs = [
  { id: 1, title: 'Why React is Awesome', date: '2025-07-15' },
  { id: 2, title: 'Hooks vs Classes', date: '2024-08-20' },
  {id: 3,title:'React is an Library of React', date: '2025-08-01'}
];

const BlogDetails = () => {
  return (
    <div>
      <h2>📝 Blog Details</h2>
      {blogs.length > 0 ? (
        <ul>
          {blogs.map(blog => (
            <li key={blog.id}>
              <strong>{blog.title}</strong> - {blog.date}
            </li>
          ))}
        </ul>
      ) : (
        <p>No blogs available</p>
      )}
    </div>
  );
};

export default BlogDetails;
