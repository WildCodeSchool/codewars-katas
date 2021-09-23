public class EvenOrOdd {
    public static String even_or_odd(int number) {
        //Place code here
        return ((number % 2) == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(even_or_odd(12));
        System.out.println(even_or_odd(13));
    }
}
