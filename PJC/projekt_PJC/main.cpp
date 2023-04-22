#include <iostream>
#include <fstream>
#include <string>
#include "Password.h"
#include "Node.h"
#include "Namespace.h"

int main() {

    using std::cout; using std::cin; using std::endl;
    auto *Funkcja = new abc::funkcja;
    std::fstream plik;
    Node *head = nullptr;

    string haslo_wstep;
    cout << "Witaj, podaj haslo:";
    cin >> haslo_wstep;

    if (Funkcja->pierwsze_haslo(haslo_wstep)) {
        abc::funkcja::prt_menu();
        cout<<endl;
        Funkcja->passplik(head);

        cout<<"\njestem tutaj: "<<Node::size(head)<<endl;

        int wybor;
        do {
            cout<<"Podaj numer";
            cout << endl;
            cin >> wybor;
            switch (wybor) {
                case 1: {
                    cout << "Funkcja listujaca hasla:"<<endl;
                    Node::printList(head);
                    break;
                }
                case 2: {
                    cout << "Wpisz: nazwe, haslo, kategorie, login i URL" << endl;

                    string nazwa, haslo, kategoria, login, URL;

                    plik.open(R"(C:\Users\mich_\OneDrive\Pulpit\projekt_PJC/passwords.txt)", std::ios_base::app);

                    cin >> nazwa;
                    nazwa = Funkcja->zaszyfruj(nazwa);
                    cin >> haslo;
                    haslo = Funkcja->zaszyfruj(haslo);
                    cin >> kategoria;
                    kategoria = Funkcja->zaszyfruj(kategoria);
                    cin >> login;
                    login = Funkcja->zaszyfruj(login);
                    cin >> URL;
                    URL = Funkcja->zaszyfruj(URL);

                    Password *help = new Password(nazwa, haslo, kategoria, login, URL);
                    Node::add(head, help);
                    delete help;

                    plik << nazwa << " " << haslo << " " << kategoria << " " << login << " " << URL << "\n";
                    plik.close();
                    break;
                }
                case 3:
                    cout << "usuwanie hasla";
                    Node::clear(head);

                    cout<<"\njestem tutaj: "<<Node::size(head)<<endl;
                    break;
                case 4:
                    cout << "Do widzenia";
                    break;
                case 5:
                    cout<<"Ilosc hasel: "<<Node::size(head)<<endl;
                break;
                default:
                    cout << "Nie ma takiej opcji";
                    break;
            }
        } while (wybor != 4);
    }
}
