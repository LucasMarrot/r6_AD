public class Driver {
    private String nom;
    private int age;

    public Driver(String name, int years) {
        this.nom = name;
        this.age = years;
    }

    public boolean estAdulte() {
        return age >= 10;
    }

    public void demarrerVoiture(Car car) {
        if (estAdulte()) {
            System.out.println(nom + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture(Car car) {
        System.out.println(nom + " arrête la voiture.");
    }

    public void changerVitesse(Car car, int nouvelleVitesse) {
        System.out.println(nom + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle;
        if (car.getSpeed() >= nouvelleVitesse) {
            while (car.getSpeed() > nouvelleVitesse) {
                car.slowDown();
            }
        } else  {
            while (car.getSpeed() < nouvelleVitesse) {
                car.speedUp();
            }
        }
    }
}
