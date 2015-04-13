import lista.Lista2;

public class RunTestLista {
    public static void main(String[] args) {
        int i = 0;
        while(i++ < 3){
            switch(i){
                case 4:
                    System.out.print("quatro,");
                    break;
                case 1:
                    System.out.print("um,");
                default:
                    System.out.print("> cinco,");
                case 5:
                    System.out.print("cinco,");
                    break;
                case 2:
                    System.out.print("dois,");
                case 3:
                    System.out.print("tres,");
                    break;
            }
            System.out.println();
        }
//        Lista2 lista = new Lista2();
//        lista.insere(10);
//        lista.insere(15);
//        lista.insere(20);
//        System.out.println(lista.vazia());
//        lista.imprime();
//        lista.insere(25);
//        lista.imprime();
//        System.out.println("Comprimento: "+lista.comprimento());
//        System.out.println("Último: "+lista.ultimo().getInfo());
//        System.out.println(lista.vazia());
//        System.out.println("Busca por 10: " + lista.buscar(10).getInfo());
//        System.out.println("Busca por 20: "+lista.buscar(20).getInfo());
//        System.out.println("Busca por 15: "+lista.buscar(15).getInfo());
////        System.out.println("Busca por 16: "+lista.buscar(16).getInfo()); // NULL
//        System.out.println(lista.toString());
//        System.out.println(lista.tamanhoRec());
//        lista.retira(20);
//        lista.imprime();
//        System.out.println(lista.toString());
//        lista.libera();
//        lista.insereOrdenado(12);
//        lista.insereOrdenado(15);
//        lista.insereOrdenado(11);
//        lista.insereOrdenado(13);
//        System.out.println(lista.toString());
//        Lista2 lista22 = new Lista2();
//        lista22.insereOrdenado(13);
//        lista22.insereOrdenado(15);
//        lista22.insereOrdenado(11);
//        lista22.insereOrdenado(12);
//        lista22.insereOrdenado(10);
//        System.out.println(lista22.toString());
//        System.out.println(lista.igualRecursivo(lista22));
//        lista22.retira(10);
//        System.out.println(lista.igualRecursivo(lista22));
//        System.out.println(lista22.igualRecursivo(lista));
//        lista22.retiraRecursivo(12);
//        System.out.println(lista22.toString());

    }
    public static String foo(int numero) {
        String retorno = "";
        if (numero != 0) {
            if (numero % 2 == 0) {
                retorno += numero + foo(numero - 1);
            } else {
                retorno = foo(numero - 1);
            }
        }
        return retorno;
    }
}
