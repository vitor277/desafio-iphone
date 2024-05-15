package aparelhos;

import interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

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
