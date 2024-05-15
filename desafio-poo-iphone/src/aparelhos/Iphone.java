package aparelhos;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String nome) {
        // TODO Auto-generated method stub
        System.out.println("Musica selecionada: " + nome);
        
    }

    @Override
    public void exibirPagina(String nomePagina) {
        // TODO Auto-generated method stub
        System.out.println("Exibindo pagina: " + nomePagina);
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

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Ligação atendida");
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando Correio de Voz");
    }
    
}
