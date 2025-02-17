public class NullPointerExceptionDemo {

    public static void generateNullPointerException() {
        String text = null;
        // This will throw a NullPointerException
        System.out.println(text.charAt(0)); // Trying to access charAt() on null
    }

    public static void main(String[] args) {
        // Demonstrate NullPointerException
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e);
        }
    }
}
