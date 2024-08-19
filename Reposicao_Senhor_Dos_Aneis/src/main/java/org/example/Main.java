package org.example;

public class Main {
    public static void main(String[] args) {

        TerraMedia terraMedia = new TerraMedia();
        Elfo legolas = new Elfo("Legolas", 30, 20, "Elfos da Floresta");
        Anao gimli = new Anao("Gimli", 70, 30, 30.5F,"Moria");
        Mago gandalf = new Mago("Gandalf", 300, 80, "Cinza (depois ele vira o Branco)");
        gimli.arma = new Arma("Machado", false);
        
        terraMedia.addHabitante(legolas);
        terraMedia.addHabitante(gimli);
        terraMedia.addHabitante(gandalf);

        legolas.mostrarInfo();
        legolas.viajar();
        legolas.curar();

        gimli.mostrarInfo();
        gimli.atacar();
        gandalf.mostrarInfo();
        gimli.minerar();

        gandalf.mostrarInfo();
        gandalf.lancaFeitico();

        terraMedia.listarHabitantes();
    }
}