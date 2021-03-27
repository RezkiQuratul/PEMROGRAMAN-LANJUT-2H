class a {
    public void print() {
        System.out.println("A");
    }

}
class b {
    public static void main(String[] args) {
        a object = new a() {
         @Override public void print() {
             System.out.println("Hello");
         }
        };
    }
}