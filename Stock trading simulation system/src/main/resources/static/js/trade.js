// Example functions for trading activities

// Function to fetch and display available stocks for trading
function loadAvailableStocks() {
    fetch('/api/stocks')
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to fetch available stocks');
        }
        return response.json();
    })
    .then(data => {
        // Display available stocks in UI (example)
        console.log('Available stocks:', data);
        // Update UI to show list of available stocks for trading
    })
    .catch(error => {
        console.error('Error fetching stocks:', error);
        // Display error message to user or handle error appropriately
    });
}

// Example function to sell stock
function sellStock(symbol, quantity) {
    const sellData = {
        symbol: symbol,
        quantity: quantity
    };

    const token = localStorage.getItem('token');

    fetch('/api/sell', {
        method: 'POST',
        headers: {
            'Authorization': `Bearer ${token}`,
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(sellData)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to sell stock');
        }
        return response.json();
    })
    .then(data => {
        console.log('Stock sold successfully:', data);
        // Update UI to reflect updated portfolio after selling stock
        loadPortfolio(); // Reload portfolio after selling stock
    })
    .catch(error => {
        console.error('Error selling stock:', error);
        // Display error message to user or handle error appropriately
    });
}

// Example usage:
// Call loadAvailableStocks() to fetch and display available stocks initially
// Optionally, add event listeners or UI interactions to trigger sellStock() function

// loadAvailableStocks(); // Example call to load available stocks initially
