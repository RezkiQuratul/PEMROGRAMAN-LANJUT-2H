class module5Quiz1 {
    private void print() {
        System.out.println("a");
    }
    private void print(String str) {
        System.out.println("b");
    }
    private void print(int x) {
        System.out.println("c");
    }

    public static void main(String[] args) {
       module5Quiz1 object = new module5Quiz1();
       object.print(12);
    }
}
