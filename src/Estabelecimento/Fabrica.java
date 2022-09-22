package Estabelecimento;

import Edu.Dani.Fabrica.Equipamentos.Copiadora.Copiadora;
import Edu.Dani.Fabrica.Equipamentos.Digitalizador.Digitalizadora;
import Edu.Dani.Fabrica.Equipamentos.Impressora.Deskjet;
import Edu.Dani.Fabrica.Equipamentos.Impressora.Impressora;
import Edu.Dani.Fabrica.Equipamentos.Impressora.Laserjet;
import Edu.Dani.Fabrica.Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        em.imprimir();
        em.digitalizar();
        em.copiar();




    }
}
