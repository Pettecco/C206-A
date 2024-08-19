package funcionalidades;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação pelo Facebook");
    }

    public void postarComentario() {
        System.out.println("Comentou em uma publicação pelo Facebook");
    }

    public void postarFoto() {
        System.out.println("Postou uma foto pelo Facebook");
    }

    public void postarVideo() {
        System.out.println("Postou um video pelo Facebook");
    }

    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Facebook");
    }

    public void fazStreaming() {
        System.out.println("Realizou uma videoconferencia no Facebook");
    }
}
