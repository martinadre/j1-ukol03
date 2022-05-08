package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        Pocitac pocitac1 = new Pocitac();
//        System.out.println(pocitac1);
//        pocitac1.zapniSe();

        Procesor procesor1 = new Procesor();
        procesor1.setVyrobce("Intel");
        procesor1.setRychlost(2_900_000_000L);
//        System.out.println(procesor1);

        Pamet pamet1 = new Pamet();
        pamet1.setKapacita(17_179_869_184L);
//        System.out.println(pamet1);

        Disk disk1 = new Disk();
        disk1.setKapacita(253_403_070_464L);
        disk1.setVyuziteMisto(192_199_786_496L);
//        System.out.println(disk1);

        pocitac1.setPevnyDisk(disk1);
        pocitac1.setRam(pamet1);
        pocitac1.setCpu(procesor1);

        System.out.println(pocitac1);
        pocitac1.vytvorSouborOVelikosti(1);
        System.out.println(pocitac1);

        pocitac1.zapniSe();
        pocitac1.vytvorSouborOVelikosti(1_000_000_000_000L);
        System.out.println(pocitac1);

        pocitac1.vytvorSouborOVelikosti(1);
        System.out.println(pocitac1);

        pocitac1.vypniSe();
        pocitac1.vymazSouboryOVelikosti(1);
        System.out.println(pocitac1);

        pocitac1.zapniSe();
        pocitac1.vymazSouboryOVelikosti(1_000_000_000_000L);
        System.out.println(pocitac1);

        pocitac1.vymazSouboryOVelikosti(2);
        System.out.println(pocitac1);
        
//        System.out.println(pocitac1.jeZapnuty());
//        pocitac1.zapniSe();
//        pocitac1.zapniSe();
//        System.out.println(pocitac1);
//        pocitac1.vypniSe();
//        pocitac1.vypniSe();
    }
}
