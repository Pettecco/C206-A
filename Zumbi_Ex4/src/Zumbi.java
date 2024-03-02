public class Zumbi {

    double vida;
    String nome;


    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(vida > quantia) {
            zumbiAlvo.vida += quantia;
            vida -= quantia;
            return true;
        }
        else {
            return false;
        }
    }

}