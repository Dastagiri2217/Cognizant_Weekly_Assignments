import React from 'react';
import Post from './Post';  

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) {
          throw new Error("Failed to fetch posts");
        }
        return response.json();
      })
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        console.error("Error fetching posts:", error);
        this.setState({ hasError: true });
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("Something went wrong: " + error.message);
    this.setState({ hasError: true });
  }

  render() {
    const { posts, hasError } = this.state;

    if (hasError) {
      return <h3>Error loading posts.</h3>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
