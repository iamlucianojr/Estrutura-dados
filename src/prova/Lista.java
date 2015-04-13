package prova;

public class Lista {
    private NoLista prim;

    public Lista() {
        this.prim = null;
    }

    public void insere(int v) {
        NoLista noListaAux = new NoLista();
        noListaAux.setProx(this.prim);
        noListaAux.setInfo(v);
        this.prim = noListaAux;
    }

    public int soma() {
        NoLista noListaAux = this.prim;
        int count = 0;
        while (noListaAux != null) {
            count += noListaAux.getInfo();
            noListaAux = noListaAux.getProx();
        }

        return count;
    }

    public int somaRecursivo() {
        NoLista noListaAux = this.prim;
        Lista listaAux = new Lista();
        while (noListaAux != null) {
            listaAux.insere(noListaAux.getInfo());
            noListaAux = noListaAux.getProx();
        }

        return somaRecursivoAux(listaAux.prim);
    }

    private int somaRecursivoAux(NoLista no) {

        if (no.getProx() != null) {
            no.getProx().setInfo(no.getInfo()+no.getProx().getInfo());
            return somaRecursivoAux(no.getProx());
        } else {
            return no.getInfo();
        }
    }

    public NoLista ultimoNoV(int v) {
        NoLista noListaAux = this.prim;
        NoLista noListaRetorno = null;

        while (noListaAux.getProx() != null) {
            if (noListaAux.getInfo() == v) {
                noListaRetorno = noListaAux;
            }
            noListaAux = noListaAux.getProx();
        }

        return noListaRetorno;
    }

    @Override
    public String toString() {
        NoLista noListaAux = this.prim;
        String sReturn = "Lista {";
        while (noListaAux != null) {
            sReturn += noListaAux.getInfo()+", ";
            noListaAux = noListaAux.getProx();
        }
        return sReturn+"}";
    }

}
