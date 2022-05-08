package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

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

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk + ", druhyDisk=" + druhyDisk +
                '}';
    }
    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
       if(jeZapnuty == true) {
           System.err.println("Počítač je již zapnutý, nelze zapnout víckrát.");
           return;
       }
       if(cpu == null) {
           System.err.println("V počítači chybí procesor.");
           return;
       } else if(ram == null) {
           System.err.println("V počítači chybí paměť ram.");
           return;
       } else if(pevnyDisk == null) {
           System.err.println("V počítači chybí pevný disk.");
           return;
       }
       jeZapnuty = true;
       System.out.println("Počítač se zapnul.");

    }

    public void vypniSe() {
        if(jeZapnuty == false) {
            return;
        }
        jeZapnuty = false;
        System.out.println("Počítač se vypnul.");

    }
    public void vytvorSouborOVelikosti(long velikost) {
        if(jeZapnuty == false) {
            System.err.println("Počítač není zapnutý.");
            return;
        }
        long celkovaVelikostSouboru = pevnyDisk.getVyuziteMisto() + velikost;
        if(celkovaVelikostSouboru > pevnyDisk.getKapacita()) {
            long zbytek = celkovaVelikostSouboru - pevnyDisk.getKapacita();
            if(druhyDisk.getVyuziteMisto() + zbytek > druhyDisk.getKapacita()) {
                System.err.println("Soubor se nevejde na disky.");
                return;
            } else {
                pevnyDisk.setVyuziteMisto(pevnyDisk.getKapacita());
                druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() + zbytek);
                return;
            }
        }
        pevnyDisk.setVyuziteMisto(celkovaVelikostSouboru);
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if(jeZapnuty == false) {
            System.err.println("Počítač není zapnutý.");
            return;
        }
        if(velikost > druhyDisk.getVyuziteMisto()) {
            long zbytek = velikost - druhyDisk.getVyuziteMisto();
            if(zbytek > pevnyDisk.getVyuziteMisto()) {
                System.err.println("Nelze vymyzat větší soubor než je využité místo na obou discích dohromady.");
                return;
            }
            druhyDisk.setVyuziteMisto(0);
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - zbytek);
            return;
        }
        druhyDisk.setVyuziteMisto(druhyDisk.getVyuziteMisto() - velikost);
    }
}
