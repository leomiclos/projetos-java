typedef struct contato Contato;

typedef struct lista Lista;

Lista * criar_lista_contato();

Lista * inserir_elemento(Contato *c, Lista *l);

void imprimir(Lista * l);
