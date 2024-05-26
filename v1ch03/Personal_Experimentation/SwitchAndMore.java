import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchAndMore {

    public static void main(String... args) {
        // Every expression has a return value in Java

        // For example
        int i = 10;
        System.out.println(i = 20); // 20

        int seasonCode = 3;
        String seasonName = switch (seasonCode) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            case 3 -> "Winter";
            default -> "???";
        };
        System.out.println(seasonName); // Winter

        // Switch with multiple case labels for each case
        String season = "Autumn";
        int seasonHash = switch (season) {
            case "Summer" -> "Summer".hashCode();
            case "Winter", "Autumn" -> "Winter".hashCode() +
                    "Autumn".hashCode();
            case "Spring" -> "Spring".hashCode();
            default -> -1;
        };
        System.out.println(seasonHash); // 268648731
        // If we set variable season (ln 22) to `null`, we get:
        /*
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
         * "String.hashCode()" because "<local6>" is null
         * at SwitchAndMore.main(SwitchAndMore.java:24)
         */

        // switch with enums
        enum Size {
            SMALL,
            MEDIUM,
            LARGE,
            EXTRA_LARGE,
        }
        // In the example below, it is legal to omit 'default' since there is a case for
        // each possible value in 'enum' Size.
        Size ItemSize = Size.EXTRA_LARGE;
        String identifier = switch (ItemSize) {
            case EXTRA_LARGE -> "XL";
            case LARGE -> "L";
            case MEDIUM -> "M";
            case SMALL -> "S";
        };
        System.out.println(identifier);

        // obtaining the value of fourth-bit from the right
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int fourthBit = (n & 0b1000) / 0b1000;
            System.out.printf("The fourth bit from right is %d\n", fourthBit);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input for sc.nextInt()");
            ex.printStackTrace();
        }
        // a better way to check if foruth-bit from right is 1 or 0
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int frthBit = (n >>> 4) & 1;
            System.out.printf("The foruth bit of %d is %d\n", n, frthBit);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input for sc.nextInt()");
            ex.printStackTrace();
        }

        // another way to check if fourth-bit is 1 or 0
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int frthBit = (n & (1 << 3)) >> 3; // >> fills tops bits with with sign-bit, >>> fills top bits with 0!
            System.out.printf("The foruth bit of %d is %d\n", n, frthBit);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input for sc.nextInt()");
            ex.printStackTrace();
        }

        String joined = String.join(" + ", "A", "B", "C", "D", "E", "F");
        System.out.printf("Joined String: %s\n", joined);
        // Joined String: A + B + C + D + E + F

        // finding the true length of a string
        String greeting = "Hello";
        System.out.println(greeting.codePointCount(0, greeting.length())); // 5
        greeting = "𐀀Hello";
        System.out.println(greeting.length()); // 7
        System.out.println(greeting.codePointCount(0, greeting.length()));// 6

    }
}
