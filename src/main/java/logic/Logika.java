package logic;

public class Logika {
    int epicfaillmao = 0;

    public double scitani(double cislojedna, double cislodva){
        return cislojedna + cislodva;
    }
    public double odecitani(double cislojedna, double cislodva){
        return cislojedna - cislodva;
    }

    public double nasobeni(double cislojedna, double cislodva){
        return cislojedna * cislodva;
    }

    public double deleni(double cislojedna, double cislodva) {
        if (cislodva != 0) {
            return cislojedna/cislodva;
        }else {
            return epicfaillmao;
        }
    }

    public double mocnina(double cislojedna, double cislodva){
        return Math.pow(cislojedna, cislodva);
    }

    public double faktorial(double cislojedna){
        if (cislojedna >= 0) {
            if (cislojedna == 0) return 0;
            if (cislojedna == 1) return 1;
            return cislojedna * faktorial(cislojedna - 1);
        } else {
            return epicfaillmao;
        }
    }
    }

