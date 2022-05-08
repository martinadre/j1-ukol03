package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

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
                ", pevnyDisk=" + pevnyDisk +
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
}
