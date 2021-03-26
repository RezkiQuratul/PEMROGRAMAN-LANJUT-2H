public class ReturnType2 {
    public static void main(String[] args) {
        int x = 10;
        int y = myFuc(x);
        System.out.println(y);
    }
    public static int myFuc(int x) {
        return x*3;
    }
}
