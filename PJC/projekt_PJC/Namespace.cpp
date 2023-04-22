#include <iostream>
#include <fstream>
#include "Namespace.h"

void abc::funkcja::prt_menu() {
    std::cout << "\n\n     MENU  \n" <<
              "Wybierz naciskajac przycisk:\n" <<
              "1. Wylistuj hasla\n" <<
              "2. Dodaj haslo\n" <<
              "3. Usun haslo\n" <<
              "4. Wyjdz";
}

bool abc::funkcja::pierwsze_haslo(std::string hpodane){
    std::fstream plik(R"(C:\Users\mich_\OneDrive\Pulpit\projekt_PJC/pierwsze_haslo.txt)");
    std::string haslo;
    plik>>haslo;
    if(haslo==hpodane){
        std::cout<<"Witamy";
        return true;
    }else{
        std::cout<<"wrong password"<<std::endl;
        return false;
    }
}
std::string abc::funkcja::zaszyfruj(std::string& cezar){
    std::string wynikowy;
    for(char litera:cezar){
        char tmp=char((int)(litera+3));
        wynikowy=wynikowy+tmp;
    }
    return wynikowy;

};
std::string abc::funkcja::odszyfruj(std::string& antycezar){
    std::string wynikowy;
    for(char litera:antycezar){
        char tmp=char((int)(litera-3));
        wynikowy=wynikowy+tmp;
    }
    return wynikowy;
}

void abc::funkcja::passplik(Node*& head) {
    using std::cout; using std::endl;
    //std::fstream plik;
    //plik.open(R"(C:\Users\mich_\OneDrive\Pulpit\projekt_PJC/passwords.txt)", std::ios_base::app);
    std::fstream odczyt(R"(C:\Users\mich_\OneDrive\Pulpit\projekt_PJC/passwords.txt)");
    if (odczyt.is_open()) {
        string wyraz;
        int i = 0;
        string nzw, hsl, ktg, lgn, url;
        while (odczyt >> wyraz) {
            ++i;
            switch (i){
                case 1:
                    nzw=odszyfruj(reinterpret_cast<string &>(wyraz));
                    break;
                case 2:
                    hsl=odszyfruj(reinterpret_cast<string &>(wyraz));
                    break;
                case 3:
                    ktg=odszyfruj(reinterpret_cast<string &>(wyraz));
                    break;
                case 4:
                    lgn=odszyfruj(reinterpret_cast<string &>(wyraz));
                    break;
                case 5:{
                    url=odszyfruj(reinterpret_cast<string &>(wyraz));
                    auto* p=new Password(nzw, hsl, ktg, lgn, url);
                    Node::add(head, p);
                    i=0;
                    nzw="";
                    hsl="";
                    ktg="";
                    lgn="";
                    url="";
                    break;
                }
            }
        }
    }
}

void abc::funkcja::czyscplik() {
    std::ofstream plik(R"(C:\Users\mich_\OneDrive\Pulpit\projekt_PJC/passwords.txt)");
    plik.close();
}
