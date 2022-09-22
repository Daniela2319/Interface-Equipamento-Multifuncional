package Edu.Dani.Fabrica.Equipamentos.Digitalizador;

import Edu.Dani.Fabrica.Equipamentos.Digitalizador.Digitalizadora;

public class Scanner implements Digitalizadora {
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando");
    }
}
