#include <iostream>
#include "Node.h"
#include "Namespace.h"

void Node::add(Node*& head, Password*& pass){
    if(head==nullptr){
        head=new Node;
        head->pass=pass;
        head->next= nullptr;
        return ;
    }
    Node* temp = head;
    while(temp->next!= nullptr){
        temp=temp->next;
    }
    Node* neo = new Node;
    neo -> pass = pass;
    neo -> next = nullptr;
    temp->next=neo;
}
size_t Node::size(const Node* head){
    size_t size;
    if(head != nullptr)
        size = 1;
    else
        return 0;
    while(head->next != nullptr){
        head = head->next;
        size++;
    }
    return size;
}
void Node::printList(const Node* head){
    for( ;head;head=head->next){
        std::cout<<*head->pass<<std::endl;
    }
}

void Node::clear(Node*& head) {
    Node *temp = head;
    while (temp) {
        Node *del = temp;
        temp = temp->next;
        std::cout << "DEL: " << del->pass->getNazwa() << " ";
        delete del;
    }
    abc::funkcja::czyscplik();
}