document.addEventListener('DOMContentLoaded', function() {
  const mainContent = document.getElementById('main-content');

  document.querySelectorAll('nav ul li a').forEach(link => {
    link.addEventListener('click', function(event) {
      event.preventDefault();
      const page = event.target.getAttribute('href').substring(1);
      loadContent(page);
    });
  });

  function loadContent(page) {
    fetch(`pages/${page}.html`)
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.text();
      })
      .then(html => {
        mainContent.innerHTML = html;
      })
      .catch(error => {
        console.error('Error loading page:', error);
        mainContent.innerHTML = '<p>Page not found.</p>';
      });
  }

  // Load the default page
  loadContent('dashboard');
});
