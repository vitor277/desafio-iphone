import aparelhos.Iphone;


public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Gosta De Rua - Felipe e Rodrigo");
        iphone.tocar();
        iphone.pausar();

        iphone.exibirPagina("www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizaPagina();

        iphone.ligar("17990231-4687");
        iphone.atender();
        iphone.iniciarCorreioVoz();

    }
}
