public class Car {
    private String model;
    private String color;
    private int speed;
    private final int maxSpeed = 120;
    private final int minSpeed = 0;
    private final int changeSpeed = 10;


    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void speedUp() {
        if (speed + changeSpeed <= maxSpeed) {
            speed += changeSpeed;
            printDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    private void printDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }

    public void slowDown() {
        if (speed - changeSpeed >= minSpeed) {
            speed -= changeSpeed;
            printDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

