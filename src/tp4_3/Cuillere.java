package tp4_3;

import java.time.LocalDate;

public class Cuillere extends Ustensile {
    private double longu;

    public Cuillere(int annee, double longu) {
        super(annee);
        this.longu = longu;
    }

    public double getLongu() {
        return longu;
    }

    public void setLongu(double longu) {
        this.longu = longu;
    }

    @Override
    public String toString() {
        return "Cuillere [longu=" + longu + ", annee=" + annee + "]";
    }

    @Override
    public double valeur() {
        int a=LocalDate.now().getYear() - this.annee;
        if (a > 30) {
            return a * 0.5;
        } else {
            return 0;
        }
    }
}
