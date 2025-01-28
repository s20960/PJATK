const form = document.getElementById('form')
const username = document.getElementById('username')
const email = document.getElementById('email')
let isValid = false;

form.addEventListener(('submit'), e=>{
    if(isValid===false) {
        e.preventDefault();
        validateInputs();
    }

})

const setError = (element, message) => {
    const inputControl = element.parentElement;
    const errorDisplay = inputControl.querySelector('.error')

    errorDisplay.innerText = message;
    inputControl.classList.add('error');
    inputControl.classList.remove('success');
};

const setSuccess = element => {
    const inputControl = element.parentElement;
    const errorDisplay = inputControl.querySelector('.error');

    errorDisplay.innerText = '';
    inputControl.classList.add('success');
    inputControl.classList.remove('error');
};

const isValidEmail = email => {
    const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}

const validateInputs = () =>{
    const usernameValue = username.value.trim()
    const emailValue = email.value.trim()

    let nickValid;
    let emailValid;

    if(usernameValue === ''){
        setError(username, 'Username is required');
    } else if(usernameValue.length < 3){
        setError(username, 'Username have to be at least 3 character long');
    }else if(usernameValue.length > 60){
        setError(username, 'Username have to be maximum 60 character long');
    } else {
        setSuccess(username);
        nickValid=true;
    }

    if(emailValue === ''){
        setError(email, 'Email is required')
    } else if(!isValidEmail(emailValue)){
        setError(email,'Privide a valid email address');
    } else{
        setSuccess(email);
        emailValid=true;
    }
    if(nickValid && emailValid){
        isValid=true;
    }

};
