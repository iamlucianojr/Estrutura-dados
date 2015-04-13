package lista;

public class Lista2 {
    private NoLista2 prim;
    private NoLista2 noLista2Aux;
    private int count = 0;

    public Lista2() {}

    public void insere(int v) {
        noLista2Aux = new NoLista2();
        noLista2Aux.setProx(prim);
        noLista2Aux.setInfo(v);
        prim = noLista2Aux;
    }

    public void imprime() {
        System.out.println("Lista: ");
        imprimeNo(prim);
    }

    private void imprimeNo(NoLista2 noLista2) {
        if (noLista2 == null) return;
        System.out.println(noLista2.getInfo());
        imprimeNo(noLista2.getProx());
    }

    public boolean vazia() {
        return prim == null;
    }

    public NoLista2 buscar(int v) {
        return buscarNo(prim, v);
    }


    private NoLista2 buscarNo(NoLista2 noLista2M, int v) {
        if (noLista2M.getInfo() == v) return noLista2M;

        return buscarNo(noLista2M.getProx(), v);
    }

    public int comprimento() {
        noLista2Aux = prim;
        int count = 0;
        while (noLista2Aux != null) {
            count ++;
            noLista2Aux = noLista2Aux.getProx();
        }

        return count;
    }

    public int tamanho() {
        return comprimento();
    }

    public int tamanhoRec() {
        return tamanhoRecAux(prim);
    }

    private int tamanhoRecAux(NoLista2 noLista2) {
        count ++;
        if (noLista2.getProx() != null) return tamanhoRecAux(noLista2.getProx());
        else return count;
    }

    public NoLista2 ultimo() {
        noLista2Aux = prim;
        while (noLista2Aux.getProx() != null)
            noLista2Aux = noLista2Aux.getProx();

        return noLista2Aux;
    }

    public void retira (int v){
        noLista2Aux = null;
        NoLista2 p = prim;

        while (p != null && p.getInfo() != v) {
            noLista2Aux = p;
            p = p.getProx();
        }

        if (p == null) return;

        if (noLista2Aux == null) this.prim = p.getProx();
        else noLista2Aux.setProx(p.getProx());
    }

    public void retiraRecursivo(int v) {
        prim = retiraRecursivoAux(prim, v);
    }

    private NoLista2 retiraRecursivoAux(NoLista2 noLista2M, int v){
        if (noLista2M != null) {
            if (noLista2M.getInfo() == v) noLista2M = noLista2M.getProx();
            else noLista2M.setProx(retiraRecursivoAux(noLista2M.getProx(), v));
        }

        return noLista2M;
    }

    public void insereOrdenado(int v) {
        NoLista2 noLista2AuxAnt = null;
        NoLista2 noLista2Novo = new NoLista2();
        noLista2Novo.setInfo(v);
        noLista2Aux = prim;


        while (noLista2Aux != null && noLista2Aux.getInfo() <      v) {
            noLista2AuxAnt = noLista2Aux;
            noLista2Aux = noLista2Aux.getProx();
        }

        if (noLista2AuxAnt == null) {
            noLista2Novo.setProx(prim);
            prim = noLista2Novo;
        } else {
            noLista2Novo.setProx(noLista2AuxAnt.getProx());
            noLista2AuxAnt.setProx(noLista2Novo);
        }
    }

    public void libera(){
        prim = null;
    }

    public boolean igual(Lista2 lista2) {
        NoLista2 noLista21 = this.prim;
        NoLista2 noLista22 = lista2.prim;

        while (noLista21 != null && noLista22 != null) {
            if (noLista21.getInfo() != noLista22.getInfo()) return false;

            noLista21 = noLista21.getProx();
            noLista22 = noLista22.getProx();
        }

        return noLista21 == noLista22;
    }


    public boolean igualRecursivo(Lista2 lista2) {
        return igualRecursivoAux(this.prim, lista2.prim);
    }

    private boolean igualRecursivoAux(NoLista2 noLista21, NoLista2 noLista22) {
        return (noLista21 == null && noLista22 == null ? true : !(noLista21 == null || noLista22 == null) && noLista21.getInfo() == noLista22.getInfo() && igualRecursivoAux(noLista21.getProx(), noLista22.getProx())) ? true : false;
    }

    @Override
    public String toString() {
        noLista2Aux = prim;
        String sReturn = "Lista {";
        while (noLista2Aux != null) {
            sReturn += noLista2Aux.getInfo()+", ";
            noLista2Aux = noLista2Aux.getProx();
        }
        return sReturn+"}";
    }
}
