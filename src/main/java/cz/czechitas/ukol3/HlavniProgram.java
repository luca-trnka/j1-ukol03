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
        System.out.println("Program spuštěn.");
        System.out.println();

        //vytvořim počítač
        Pocitac lucinyPocitac;
        lucinyPocitac = new Pocitac();

        //zjistim stav počítače a zkoušim zapnout
        System.out.println(lucinyPocitac);
        lucinyPocitac.zapniSe();
        System.out.println();

        //vytvořím procesor, paměť, disk a zadam jejich parametry
        Procesor lucinyProcesor = new Procesor();
        lucinyProcesor.setRychlost(3_800_000_000_000L);
        lucinyProcesor.setVyrobce("Intel");

        Pamet lucinyPamet = new Pamet();
        lucinyPamet.setKapacita(16_000_000_000L);

        Disk lucinyDisk = new Disk();
        lucinyDisk.setKapacita(307_263_172_608L);
        lucinyDisk.setVyuziteMisto(0);

        //připojim procesor, pamět a disk k počítači
        lucinyPocitac.setCpu(lucinyProcesor);
        lucinyPocitac.setRam(lucinyPamet);
        lucinyPocitac.setPevnyDisk(lucinyDisk);

        //znovu zjistim stav počítače a zkusim zapnout
        System.out.println(lucinyPocitac);
        lucinyPocitac.zapniSe();
        System.out.println();


        //pokud ho zkusím znovu zapnout, vypíše chybu, protože počítač už je zapnutý.
        //System.out.println(lucinyPocitac);
        //lucinyPocitac.zapniSe();  //
        //System.out.println();

        //přidám soubory a kouknu kolik mám místa
        lucinyPocitac.vytvorSouborOVelikosti(100_000_000_000L);
        System.out.println("Využité místo na disku po přidání souboru je: " + lucinyDisk.getVyuziteMisto());

        //zkusím přidat další soubory, které se už nevejdou a počítač mi je nenechá uložit.
        lucinyPocitac.vytvorSouborOVelikosti(200_000_000_000L);
        System.out.println("Využité místo na disku po přidání souboru je: " + lucinyDisk.getVyuziteMisto());
        System.out.println();

        lucinyPocitac.vymazSouboryOVelikosti(50_000_000_000L);
        System.out.println("Využité místo na disku po smazání souboru je: " + lucinyDisk.getVyuziteMisto());

        //jdu ho vypnout
        lucinyPocitac.vypniSe();

        //vypnu ho klidně několikrát znova a nic se nestane
        lucinyPocitac.vypniSe();
        lucinyPocitac.vypniSe();
    }
}

