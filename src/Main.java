public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double polegadas, metros;
        int counter; counter = 0;
        for (polegadas = 1; polegadas <= 144; polegadas++){
            metros = polegadas * 0.0254; // converter para polegadas
            System.out.println(polegadas + " polegadas são " + metros + " metros."); counter++;
            if (counter == 12){
                System.out.println(); counter = 0;
            }
        }
    }
}