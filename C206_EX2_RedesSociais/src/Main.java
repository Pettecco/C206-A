import excecoes.InvalidNumberOfFriendsException;
import excecoes.UserValidationException;
import funcionalidades.RedeSocial;
import funcionalidades.Twitter;
import funcionalidades.Usuario;
import funcionalidades.Facebook;

public class Main {
    public static void main(String[] args) throws UserValidationException {

        RedeSocial[] redeSocials = new RedeSocial[3];

        try {
            Facebook facebook = new Facebook("senha123", 154);
            Twitter twitter = new Twitter("bolinha4567", 88);
            redeSocials[0] = twitter;
            redeSocials[1] = facebook;
        } catch (InvalidNumberOfFriendsException e){
            System.out.println(e.getMessage());
        }

        Usuario usuario = new Usuario("Petterson", "petterson.ikaro@gec.inatel.br", redeSocials);
        System.out.println("Informações do usuário:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail() + "\n");
        usuario.usarRedes();
    }
}