package tp4_3;

public class Collection {
    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteRonde(1926, 8.4);
        us[1] = new Cuillere(1881, 7.3);
        us[2] = new AssietteCarree(1935, 5.6);
        us[3] = new Cuillere(1917, 8.8);
        us[4] = new AssietteRonde(1837, 5.4);

        afficheCollection(us);
        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
    }

    public static void afficheCollection(Ustensile[] us) {
        for (int i = 0; i < us.length; i++) {
            System.out.println(us[i].toString());
        }
    }

    public static void afficherCuilleres(Ustensile[] us) {
        int n = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Cuillere) {
                n++;
            }
        }
        System.out.println("Nombre de cuillères : " + n);
    }

    public static void afficherSurfaceAssiettes(Ustensile[] us) {
        int s = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Assiette) {
                s += ((Assiette) us[i]).calculesurface();
            }
        }
        System.out.println("Surface totale des assiettes : " + s);
    }

    public static void afficherValeurTotale(Ustensile[] us) {
        double s = 0;
        for (int i = 0; i < us.length; i++) {
            s += us[i].valeur();
        }
        System.out.println("Valeur totale : " + s + " dinars");
    }
}
