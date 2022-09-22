package Edu.Dani.Fabrica.Equipamentos.Impressora;

import Edu.Dani.Fabrica.Equipamentos.Impressora.Impressora;

public class Deskjet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo Deskjet");
    }
}
