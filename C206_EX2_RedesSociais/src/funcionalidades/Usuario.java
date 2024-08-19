package funcionalidades;

import excecoes.UserValidationException;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nome;
    private String email;
    Set<RedeSocial> redeSocials = new HashSet<>();

    public Usuario(String nome, String email, RedeSocial[] redesSociais) throws UserValidationException{

        if(nome == null || email == null){
            throw new UserValidationException("Os campos de cadastro não podem ser nulos");
        } else{
            this.nome = nome;
            this.email = email;

            for(int i = 0; i < redesSociais.length; i++){
                if(redesSociais[i] != null){
                    redeSocials.add(redesSociais[i]); // add a rede social passada por parametro pro construtor para o hashSet
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void usarRedes(){
        boolean isFirstRede = true;

        for(RedeSocial redeSocial : redeSocials){
            if(isFirstRede) {
                redeSocial.postarFoto();
                redeSocial.postarComentario();
                redeSocial.postarVideo();
                isFirstRede = false;
            } else {
                redeSocial.curtirPublicacao();
                if (redeSocial instanceof Facebook) {
                    Facebook r;
                    r = (Facebook) redeSocial;
                    r.compartilhar();
                    r.fazStreaming();
                }
            }
        }
    }
}

