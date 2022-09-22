package Edu.Dani.Fabrica.Equipamentos.Multifuncional;

import Edu.Dani.Fabrica.Equipamentos.Copiadora.Copiadora;
import Edu.Dani.Fabrica.Equipamentos.Digitalizador.Digitalizadora;
import Edu.Dani.Fabrica.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via Equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Equipamento Multifuncional");
    }
}
