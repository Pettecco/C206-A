package org.example;

public class TerraMedia {

    Habitante[] herois = new Habitante[20];

    public void addHabitante(Habitante habitante){
        for(int i = 0; i < herois.length; i++){
            if(herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        System.out.println("Lista de habitantes da terra média:");
        for(int i = 0; i < herois.length; i++){
            if(herois[i] != null){
                System.out.println(herois[i].nome);
            }
        }
    }

}
