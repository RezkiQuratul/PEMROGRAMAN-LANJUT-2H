class object {
    private int x;

    public static void main(String[] args) {
        object a = new object();
        a.x = 5;
        object b = new object();
        b.x = 5;

        System.out.println(a==b);
    }
}
