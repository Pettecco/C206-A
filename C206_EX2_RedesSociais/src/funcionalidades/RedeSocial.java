package funcionalidades;

import excecoes.InvalidNumberOfFriendsException;

public abstract class RedeSocial{

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {

        if(numAmigos < 0){
            throw new InvalidNumberOfFriendsException("Número de amigos não pode ser negativo!");
        } else {
            this.senha = senha;
            this.numAmigos = numAmigos;
        }
    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){}
}

