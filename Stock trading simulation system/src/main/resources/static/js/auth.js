// Function to handle user login
function login(username, password) {
    const loginData = {
        username: username,
        password: password
    };

    fetch('/api/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(loginData)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Login failed');
        }
        return response.json();
    })
    .then(data => {
        // Handle successful login, e.g., store authentication token
        localStorage.setItem('token', data.token);
        console.log('Login successful');
        // Optionally redirect or update UI after successful login
    })
    .catch(error => {
        console.error('Login error:', error);
        // Handle login error, e.g., display error message to user
    });
}

// Function to handle user logout
function logout() {
    // Clear authentication token from localStorage or cookies
    localStorage.removeItem('token');
    console.log('Logged out');
    // Optionally redirect or update UI after logout
}

// Example usage:
// Assuming you have login/logout buttons in your UI with appropriate event listeners
// Example:
// document.getElementById('login-form').addEventListener('submit', function(event) {
//     event.preventDefault();
//     const username = document.getElementById('username').value;
//     const password = document.getElementById('password').value;
//     login(username, password);
// });

// document.getElementById('logout-button').addEventListener('click', function() {
//     logout();
// });
