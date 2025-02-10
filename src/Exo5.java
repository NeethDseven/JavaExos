import java.util.Optional;

public class Exo5 {
    public static void main(String[] args) {
        Integer nombreExistant = null;  
        int resultat = Optional.ofNullable(nombreExistant).orElse(42);  
        System.out.println("Résultat : " + resultat); 
    }
}
