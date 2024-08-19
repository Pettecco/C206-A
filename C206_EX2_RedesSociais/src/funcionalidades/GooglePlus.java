package funcionalidades;


public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Fez um comentário no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Iniciou uma videoconferencia no GooglePlus");
    }
}
