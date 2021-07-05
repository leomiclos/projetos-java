#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "contatos.h"
#include <locale.h>

struct contato {
    char nome[51];
    char email[61];
    char fone[22];
    char codigo[20];
};
Lista * contatos;

//Métodos auxiliares
void cadastrar();
void listar();
char listar_especifico();
int main()
{
    setlocale(LC_ALL, "PORTUGUESE");
    contatos = criar_lista_contato();
    int opc = 0;
    do {
        printf("************ AGENDA ************\n\n\n");
        printf(">>> MENU <<<\n\n");
        printf("1 ---Cadastrar Contato---\n");
        printf("2 ---Listar Contatos---\n");
        printf("4 ---Sair do programa---\n");
        printf("Sua opção: \n");
        scanf("%d", &opc);
        switch(opc){
            case 1:
                printf("\n");
                cadastrar();
                break;
            case 2:
                listar();
            case 4:
                printf("Fim do programa \n");
                break;
            default:
                printf("Opção inválida \n");
        }
    }while(opc != 9);
    return 0;
}
void cadastrar(){
    Contato* c = (Contato*)malloc(sizeof(Contato));
    printf("Digite o código do contato: \n");
    setbuf(stdin, NULL);
    fgets(c->nome, 20, stdin);
    printf("Digite o nome do contato: \n");
    setbuf(stdin, NULL); //fflush(stdin)
    fgets(c->nome, 51, stdin); //gets(c->nome);
    printf("Digite o email do contato: \n");
    setbuf(stdin, NULL);
    fgets(c->email, 61, stdin);
    printf("Digite o telefone do contato: \n");
    setbuf(stdin, NULL);
    fgets(c->fone, 22, stdin);
    contatos = inserir_elemento(c, contatos);
    printf("Dado incluído com sucesso \n\n");
}

void listar(){
    imprimir(contatos);
}
