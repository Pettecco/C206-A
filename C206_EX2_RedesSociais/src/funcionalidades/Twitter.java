package funcionalidades;

public class Twitter extends RedeSocial implements Compartilhamento {

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Fez um comentário no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Fez um retweet no Twitter (compartilhamento)");
    }
}
