public class Application {
    public static void main(final String[] args) {
        final int myAge = 20;
        final int speedMax = 80;
        final int speedMin = 30;
        final String endMsg = "End";
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", myAge);

        moi.demarrerVoiture(maVoiture);
        maVoiture.accelerer();
        moi.changerVitesse(maVoiture, speedMax);
        maVoiture.ralentir();
        moi.changerVitesse(maVoiture, speedMin);
        moi.arreterVoiture(maVoiture);
        System.out.println(endMsg);
    }
}
