public class Exo12 {
    public static void main(String[] args) {
        String myString = "42424242";
        String result = myString.replace("42", "quarante-deux ");
        
        System.out.println("Chaîne originale : " + myString);
        System.out.println("Chaîne modifiée : " + result);
    }
}
