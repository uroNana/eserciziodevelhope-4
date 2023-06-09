public class test {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        ++ b ;

        if ((b % 2) != 0 && (b * ++ b) % 3 == 0) {
            System.out.println("b is odd and b multiplied by itself plus one is divisible by 3");
        } else {
            System.out.println("b is not odd and b multiplied by itself plus one is not divisible by 3");
        }
    }
}
