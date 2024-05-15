package aparelhos;

import interfaces.NavegadorInternet;

public class Macintosh implements NavegadorInternet {

    @Override
    public void exibirPagina(String nomePagina) {
        // TODO Auto-generated method stub
        System.out.println("Exibindo pagina" + nomePagina);
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizaPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando página");
    }

    
}