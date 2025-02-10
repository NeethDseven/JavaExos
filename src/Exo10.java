public class Exo10 {
    public static void main(String[] args) {
        // Types primitifs
        byte my42TypeByte = 42;
        short my42TypeShort = 42;
        int my42TypeInt = 42;
        long my42TypeLong = 42L;
        float my42TypeFloat = 42.0f;
        double my42TypeDouble = 42.0d;
        char my42TypeChar = '*';
        boolean my42TypeBoolean = true;

        // Type objet String
        String my42TypeString = "42";

        // Affichage des types
        System.out.println("Type de my42TypeByte: " + ((Object)my42TypeByte).getClass().getSimpleName());
        System.out.println("Type de my42TypeShort: " + ((Object)my42TypeShort).getClass().getSimpleName());
        System.out.println("Type de my42TypeInt: " + ((Object)my42TypeInt).getClass().getSimpleName());
        System.out.println("Type de my42TypeLong: " + ((Object)my42TypeLong).getClass().getSimpleName());
        System.out.println("Type de my42TypeFloat: " + ((Object)my42TypeFloat).getClass().getSimpleName());
        System.out.println("Type de my42TypeDouble: " + ((Object)my42TypeDouble).getClass().getSimpleName());
        System.out.println("Type de my42TypeChar: " + ((Object)my42TypeChar).getClass().getSimpleName());
        System.out.println("Type de my42TypeBoolean: " + ((Object)my42TypeBoolean).getClass().getSimpleName());
        System.out.println("Type de my42TypeString: " + my42TypeString.getClass().getSimpleName());
    }
}
