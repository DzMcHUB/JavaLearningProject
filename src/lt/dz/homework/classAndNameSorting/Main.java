package lt.dz.homework.classAndNameSorting;

public class Main {
    public static void main(String[] args) {

        Mokinys[] masyvas = {
                new Mokinys(3, "Saulius", "Bernatonis"),
                new Mokinys(1, "Darius", "Sileka"),
                new Mokinys(2, "Valdas", "Adamkus"),
                new Mokinys(1, "Petras", "Didziulis"),
                new Mokinys(3, "Ignacijus", "Petrauskas"),
                new Mokinys(1, "Kostas", "Kausinis"),
                new Mokinys(1, "Edvinas", "Kausinis"),
                new Mokinys(1, "Kostas", "Aravicius"),
                new Mokinys(2, "Algirdas", "Kavaliauskas"),
                new Mokinys(3, "Bobis", "Petrauskas"),
                new Mokinys(2, "Faustas", "Kopis"),
                new Mokinys(2, "Jurgis", "Duodis"),
                new Mokinys(2, "Saugis", "Baugis"),
                new Mokinys(2, "Augis", "Baugis"),
                new Mokinys(3, "Augis", "Baurgis"),
                new Mokinys(3, "Tautvydas", "Bosas"),
                new Mokinys(3, "Ignas", "Gaule"),
                new Mokinys(3, "Ignas", "Petrauskas"),
        };

        for (int i = 0; i < masyvas.length - 1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                //geriau butu sukurti funkcija lyginancia skirtingas reiksmes siame if'e,
                //nereiktu kitu if statement'u
                if (masyvas[i].klase > masyvas[j].klase) {
                    Mokinys temp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = temp;
                }
                if (masyvas[i].klase == masyvas[j].klase) {
                    if (masyvas[i].pavarde.compareToIgnoreCase(masyvas[j].pavarde) > 0) {
                        Mokinys temp = masyvas[i];
                        masyvas[i] = masyvas[j];
                        masyvas[j] = temp;
                    }
                    if (masyvas[i].pavarde.compareToIgnoreCase(masyvas[j].pavarde) == 0) {
                        if (masyvas[i].vardas.compareToIgnoreCase(masyvas[j].vardas) > 0) {
                            Mokinys temp = masyvas[i];
                            masyvas[i] = masyvas[j];
                            masyvas[j] = temp;
                        }
                    }
                }
            }
        }

        for (Mokinys index : masyvas) {
            System.out.println(index.klase + " klase " + index.pavarde + " " + index.vardas);
        }
    }
}
