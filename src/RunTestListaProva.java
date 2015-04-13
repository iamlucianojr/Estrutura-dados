import prova.Lista;

public class RunTestListaProva {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insere(10);
        lista.insere(15);
        lista.insere(14);
        lista.insere(15);
        lista.insere(16);
        System.out.println(lista.soma());

        System.out.println(lista.ultimoNoV(15).getProx().getInfo());

        System.out.println(lista.somaRecursivo());

        lista.insere(2);
        lista.insere(4);

        System.out.println(lista.somaRecursivo());

    }
}
