package Edu.Dani.Fabrica.Equipamentos.Copiadora;

import Edu.Dani.Fabrica.Equipamentos.Copiadora.Copiadora;

public class Xerox implements Copiadora {
    @Override
    public void copiar() {
        System.out.println("Copiando");
    }
}
