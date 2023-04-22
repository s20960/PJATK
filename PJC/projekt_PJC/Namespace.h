#pragma once
#include <iostream>
#include "Password.h"
#include "Node.h"

namespace abc{

    struct funkcja{
        static void prt_menu();
        bool pierwsze_haslo(std::string phaslo);
        static std::string zaszyfruj(std::string& cezar);
        static std::string odszyfruj(std::string& antycezar);
        void passplik(Node*& head);
        static void czyscplik();
    };
}
