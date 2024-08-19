package org.example;

public class Main {
    public static void main(String[] args) {

        Sargento sargento1 = new Sargento("Jorge", 111233344, "Infantaria", 400);
        Sargento sargento2 = new Sargento("Cleitinho", 12345678, "Cavalaria", 100);
        Oficial oficial1 = new Oficial("Zeca", 222333445, "recruta");
        MedicoMilitar medicoMilitar1 = new MedicoMilitar("Fabricinho", 1233211232, 8, 1000);
        MedicoMilitar medicoMilitar2 = new MedicoMilitar("Hugo", 999287342, 2, 300);

        ItemEspecial itemEspecialMedicinal = new ItemEspecial("medicinal");
        ItemEspecial itemEspecialCavalaria = new ItemEspecial("cavalaria");

        sargento2.itemEspecial = itemEspecialMedicinal;
        medicoMilitar1.itemEspecial = itemEspecialCavalaria;

        Exercito exercito = new Exercito("Quartel do Inatel", sargento1);

        exercito.addSoldados(sargento2);
        exercito.addSoldados(oficial1);
        exercito.addSoldados(medicoMilitar1);
        exercito.addSoldados(medicoMilitar2);

        exercito.mostrarInfo();
    }
}