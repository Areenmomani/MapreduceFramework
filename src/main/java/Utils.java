public class Utils {
    public static void printBeautiful(String toPrint) {
        String line = "---------------------------------";
        System.out.println(line);
        System.out.println(toPrint.toUpperCase());
        System.out.println(line);

    }
    public static void printDiffTime(long stepTime) {
        System.out.println("---Time: "+(System.currentTimeMillis() - stepTime)+" ---");

    }
}
