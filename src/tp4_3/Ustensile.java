package tp4_3;

abstract public class Ustensile {
protected int annee ;

public Ustensile(int annee) {
	this.annee = annee;
}

@Override
public String toString() {
	return "Ustensile [annee=" + annee + "]";
} 
public abstract double valeur();
}
