package tp4_3;

import java.time.LocalDate;

public class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon=rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon=rayon;
    }

    @Override
    public String toString() {
        return "AssietteRonde [rayon=" + rayon + ", annee=" + annee + "]";
    }

    @Override
    public double calculesurface() {
        return 3.14*rayon*rayon;
    }

    @Override
    public double valeur() {
        int date= LocalDate.now().getYear() - this.annee;
        if (date> 50) {
            return (date- 50) * 1;
        } else {
            return 0;
        }
    }

}
