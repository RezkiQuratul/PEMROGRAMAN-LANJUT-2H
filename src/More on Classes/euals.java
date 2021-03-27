class euals {
    private int x;
    public boolean equls(Object o) {
        return ((euals)o).x == this.x;
    }

    public static void main(String[] args) {
        euals a = new euals();
        a.x = 9;
        euals b = new euals();
        b.x = 5;

        System.out.println(a.equls(b));
    }
}
