document.getElementById('form-user').addEventListener('submit', function(event) {
    event.preventDefault(); 

    let user = {
        username: document.getElementsByName('username'),
        email: document.getElementsByName('email')
    };

    fetch('user/adduser', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(user)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Error al guardar usuario');
            }
            return response.json(); 
        })
        .then(data => {
            console.log('Usuario guardado exitosamente:', data);
        })
        .catch(error => {
            console.error('Error:', error);
        });
});