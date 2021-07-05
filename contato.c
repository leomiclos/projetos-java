#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "contatos.h"

struct contato{
    char nome[51];
    char email[61];
    char fone[22];
    char codigo[20];
};

struct lista{
    Contato * pessoa;
    Lista * prox;
};

Lista * criar_lista_contato(){
    return NULL; //criando uma lista vazia
}

Lista * inserir_elemento(Contato *c, Lista *l){
    Lista * no = (Lista *) malloc(sizeof(Lista));
    no->pessoa = (Contato *)malloc(sizeof(Contato));
    strcpy(no->pessoa->nome, c->nome);
    strcpy(no->pessoa->fone, c->fone);
    strcpy(no->pessoa->email, c->email);
    strcpy(no->pessoa->codigo, c->codigo);
    no->prox = l;
    return no;
}

void imprimir(Lista * l){
    Lista * p = l;
    while(p!=NULL){
        printf("Dado do contato na lista\n");
        printf("------------------------\n");
        printf("Nome: %s", p->pessoa->nome);
        printf("Fone: %s", p->pessoa->fone);
        printf("Email: %s \n", p->pessoa->email);
        printf("Codigo: %s \n", p->pessoa->codigo);
        p = p->prox;
    }
}
