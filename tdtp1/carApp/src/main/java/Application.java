public class Application {
    public static void main(final String[] args) {
        final int myAge = 20;
        final int speedMax = 80;
        final int speedMin = 30;
        final String endMsg = "End";
        Car myCar = new Car("Sedan", "Bleu");
        Driver me = new Driver("John", myAge);

        me.demarrerVoiture(myCar);
        myCar.speedUp();
        me.changerVitesse(myCar, speedMax);
        myCar.slowDown();
        me.changerVitesse(myCar, speedMin);
        me.arreterVoiture(myCar);
        System.out.println(endMsg);
    }
}
