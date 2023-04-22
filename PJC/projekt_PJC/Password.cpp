#include <iostream>
#include "Password.h"

Password::Password(string nazwa, string haslo, string kategoria, string login, string URL) {
    this->nazwa=nazwa;
    this->haslo=haslo;
    this->kategoria=kategoria;
    this->login=login;
    this->URL=URL;
}

std::ostream &operator<<(std::ostream &str, const Password &password) {
    return str<<password.nazwa<<" "<< password.haslo<<" "<<password.kategoria<<" "<<password.login<<" "<<password.URL;
}

const string &Password::getNazwa() const {
    return nazwa;
}
const string &Password::getHaslo() const {
    return haslo;
}
const string &Password::getKategoria() const {
    return kategoria;
}
const string &Password::getLogin() const {
    return login;
}
const string &Password::getUrl() const {
    return URL;
}
