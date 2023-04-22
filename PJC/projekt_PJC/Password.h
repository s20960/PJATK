#pragma once
#include <iostream>

using std::string;

class Password{
    string nazwa;
    string haslo;
    string kategoria;
    string login;
    string URL;

public:
    friend std::ostream& operator<<(std::ostream& str, const Password& password);
    Password(string nazwa, string haslo, string kategoria, string login, string URL);

    const string &getNazwa() const;
    const string &getHaslo() const;
    const string &getKategoria() const;
    const string &getLogin() const;
    const string &getUrl() const;


};
