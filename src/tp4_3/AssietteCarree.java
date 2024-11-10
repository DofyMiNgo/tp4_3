package tp4_3;

import java.time.LocalDate;

public class AssietteCarree extends Assiette {
    private double cote;
    
    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "AssietteCarree [cote=" + cote + ", annee=" + annee + "]";
    }

    @Override
    public double calculesurface() {
        return cote * cote;
    }

    @Override
    public double valeur() {
        int a= LocalDate.now().getYear() - this.annee;
        if (a> 50) {
            return (a- 50) * 2;
        } else {
            return 0;
        }
    }
}
