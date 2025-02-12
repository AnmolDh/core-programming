import java.util.Scanner;

class DivideChocolates {

    public static int[] findChocolatesPerChild(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChocolates = scanner.nextInt();
        int numberOfChildren = scanner.nextInt();

        int[] result = findChocolatesPerChild(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
