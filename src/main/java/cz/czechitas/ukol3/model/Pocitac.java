package cz.czechitas.ukol3.model;

public class Pocitac {

    //vlastnosti
    private boolean jeZapnuty;// (toto bude pouze field, bez getteru a setteru)
    private Procesor cpu;// (budeme se tvářit, že počítač má jen jeden procesor s jendím jádrem)
    private Pamet ram;
    private Disk pevnyDisk;


    //metoda toString

    @Override
    public String toString() {
        return "Pocitac" + " " + "je Zapnuty=" + jeZapnuty + " (" + "cpu=" + cpu + ", ram=" + ram + ", pevnyDisk=" + pevnyDisk + ")";
    }


    //gettery a settery
    public Procesor getCpu() {
        return cpu;
    }
    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }
    public Pamet getRam() {
        return ram;
    }
    public void setRam(Pamet ram) {
        this.ram = ram;
    }
    public Disk getPevnyDisk() {
        return pevnyDisk;
    }
    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    //metody public boolean jeZapnuty(), public void zapniSe(), public void vypniSe()

    public boolean jeZapnuty() {
        if (jeZapnuty){
            System.out.println("Počítač je zapnutý.");
            return this.jeZapnuty = true;
        }
        else{
            System.out.println("Počítač je vypnutý.");
            return this.jeZapnuty = false;
    }
    }
    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Počítač je již zapnutý.");

        } else {
            System.out.println("Počítač není ještě zapnutý, vyzkouším to.");

            if (cpu == null||ram==null||pevnyDisk==null) {
                System.out.println("Počítač nemůžu zapnout, chybí mu  CPU, RAM nebo Pevný disk.");
            } else {
                jeZapnuty= true;
                System.out.println("Počítač se zapnul.");
            }
        }
    }
    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač se vypnul.");
            this.jeZapnuty = false;
    }

}

    // metody:  vytvorSouborOVelikosti(long velikost),  vymazSouboryOVelikosti(long velikost)


    public void vytvorSouborOVelikosti(long velikost) {

        if (jeZapnuty) {
            long vyuziteMisto = pevnyDisk.getVyuziteMisto();//aktuální hodnota mista na disku
            long meneMista = vyuziteMisto + velikost; //proměnná vyuziteMisto zvýšené o zadanou velikost

            if (meneMista > pevnyDisk.getKapacita()) {
                System.err.println("Soubor už se na disk už nevejde.");
            } else {
                pevnyDisk.setVyuziteMisto(meneMista);
            }
        } else {
            System.err.println("Počítač je vypnutý, nemůžeš nic přidat.");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {

        if (jeZapnuty) {
            long vyuziteMisto = pevnyDisk.getVyuziteMisto();//aktuální hodnota mista na disku
            long viceMista = vyuziteMisto - velikost; //proměnná vyuziteMisto snížené o zadanou velikost

            if (viceMista < 0) {
                System.err.println("Mažeš víc než máš.");
            } else {
                pevnyDisk.setVyuziteMisto(viceMista);
            }
        } else {
            System.err.println("Počítač je vypnutý, nemůžeš nic mazat.");
                }
            }

}