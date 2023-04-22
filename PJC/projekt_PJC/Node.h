#pragma once
#include <iostream>
#include "Password.h"

struct Node {
    Password* pass;
    Node* next;

    static void add(Node*& head, Password*& pass);
    static size_t size(const Node* head);
    static void clear(Node*& head);
    static void printList(const Node* head);
};