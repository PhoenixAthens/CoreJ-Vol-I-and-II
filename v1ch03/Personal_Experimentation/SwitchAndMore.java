public class SwitchAndMore {

    public static void main(String... args) {
        //Every expression has a return value in Java

        //For example
        int i = 10;
        System.out.println(i = 20); //20

        int seasonCode = 3;
        String seasonName =
            switch (seasonCode) {
                case 0 -> "Spring";
                case 1 -> "Summer";
                case 2 -> "Fall";
                case 3 -> "Winter";
                default -> "???";
            };
        System.out.println(seasonName); //Winter

        //Switch with multiple case labels for each case
        String season = null;
        int seasonHash =
            switch (season) {
                case "Summer" -> "Summer".hashCode();
                case "Winter", "Autumn" -> "Winter".hashCode() +
                "Autumn".hashCode();
                case "Spring" -> "Spring".hashCode();
                default -> -1;
            };
        System.out.println(seasonHash); //268648731

        //switch with enums
        enum Size {
            SMALL,
            MEDIUM,
            LARGE,
            EXTRA_LARGE,
        }
        //In the example below, it is legal to omit 'default' since there is a case for each possible value in 'enum' Size.
        Size ItemSize = Size.EXTRA_LARGE;
        String identifier =
            switch (ItemSize) {
                case EXTRA_LARGE -> "XL";
                case LARGE -> "L";
                case MEDIUM -> "M";
                case SMALL -> "S";
            };
        System.out.println(identifier);
    }
}
