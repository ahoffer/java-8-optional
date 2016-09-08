import java.util.Optional;

public class Main  {

    public static void main(String[] args) {
        testReturnOptional(Optional.of("ALAKAZAM"), "an optional with a value");
        println("(Flat map has extra smarts not to wrap any optional)");

        testReturnOptional(Optional.empty(), "an empty optional");
        println("(Map has enough smarts not to wrap an EMPTY optional)");

        testReturnValue(Optional.ofNullable("BOJANGLES"), "an optional with a value");
    }

    private static void testReturnOptional(Optional<String> optional,
            String descriptionOfOptional) {
        String descriptionOfFunction = "a function that returns an OPTIONAL";
        println("\nGIVEN " + descriptionOfOptional + " AND " + descriptionOfFunction + ", THEN");
        Optional<?> outcomeOne = optional.flatMap(Main::myFunctionReturnsOptional);
        Optional<?> outcomeTwo = optional.map(Main::myFunctionReturnsOptional);
        println("\tMAP returns " + outcomeTwo);
        println("\tFLAT MAP returns " + outcomeOne);
    }

    private static void testReturnValue(Optional<String> optional, String descriptionOfOptional) {
        String descriptionOfFunction = "a function that returns an STRING";
        println("\nGIVEN " + descriptionOfOptional + " AND " + descriptionOfFunction + ", THEN");
        Optional<?> outcomeTwo = optional.map(Main::myFunctionReturnsString);
        println("\tMAP returns " + outcomeTwo);
        println("\tFLAT MAP does not accept functions that do not return an Optional.");
    }

    private static String myFunctionReturnsString(String value) {
        return value;
    }

    private static Optional<String> myFunctionReturnsOptional(String s) {
        return Optional.ofNullable(s);
    }

    static void println(Object o) {
        System.out.println(o);
    }
}
