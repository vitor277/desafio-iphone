package aparelhos;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

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
    
}
