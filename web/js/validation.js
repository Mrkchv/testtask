var formLogin = document.querySelector('.formLogin');
var fieldsLogin = formLogin.querySelectorAll('.field');

//Нажатие на кнопку Log in 
formLogin.addEventListener('submit', function(event){
    event.preventDefault();
    var loginSuccess = true;
    
    removeErrors(formLogin);
    loginSuccess = checkFields(fieldsLogin);

    if(loginSuccess){
        formLogin.submit();
    }
});

var formSignin = document.querySelector('.formSignin');
var passwordEnter = formSignin.querySelector('#passwordEnter');
var confirmPasswordEnter = formSignin.querySelector('#confirmPasswordEnter');
var fieldsSignin = formSignin.querySelectorAll('.field');

//Нажатие на кнопку Sign in
formSignin.addEventListener('submit', function(event){
    event.preventDefault();
    
    removeErrors(formSignin);
    var fieldsBool = checkFields(fieldsSignin);
    var passwordBool = checkPassword();
    var patternBool = checkPattern(fieldsSignin);

    if (fieldsBool && passwordBool && patternBool){
        formSignin.submit();
    }
});

//Добавление ошибки на форму
var getError = function(text){
    var error = document.createElement('div');
    error.className = 'error';
    error.style.color = 'red';
    error.innerHTML = '<small>' + text + '</small>';
    return error;
};

//Удаление ошибок
var removeErrors = function(form){
    var errors = form.querySelectorAll('.error');
    
    for (var i = 0; i < errors.length; i++){
        errors[i].remove();
    }
};

//Проверка полей на заполнение
var checkFields = function(fields){
    var success = true;
    for (var i = 0; i < fields.length; i++){
        if (!fields[i].value){
            success = false;
            var error = getError('The field is not filled');
            fields[i].parentElement.insertBefore(error, fields[i]);
        }
    }
    return success;
};

//Сравнение паролей на форме регистрации
var checkPassword = function(){
    var success = true;
    if (passwordEnter.value !== confirmPasswordEnter.value){
        success = false;
        var error = getError('Password doesnt match');
        passwordEnter.parentElement.insertBefore(error, passwordEnter);
    }
    return success;
};

//Проверка на спец. символы
var checkPattern = function (fields){
    var success = true;
    var pattern = /^[\w\W]*\W[\w\W]*$/;
    for (var i = 0; i < fields.length; i++){
        if (pattern.test(fields[i].value)){
            var error = getError('You have special characters on this field');
            fields[i].parentElement.insertBefore(error, fields[i]);
            success = false;
        }
    }
    return success;
};


