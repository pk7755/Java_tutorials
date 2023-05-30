public class RelationalOperators {
    public static void main(String[] args) {
        int p = 10, q = 15, r = 5;

        // && operators
        System.out.println((p < q) && (p > r)); //true
        System.out.println((p < q) && (p < r)); //false

        // || Operators
        System.out.println((p < q) || (p > r)); //true
        System.out.println((p < q) || (p < r)); //true
        System.out.println((p > q) || (p < r)); //false

        // ! Operators
        System.out.println(!(p > q));   // true
        System.out.println(!(p < q));   // false
    }
}
