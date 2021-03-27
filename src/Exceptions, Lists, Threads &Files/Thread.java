class A extends Thread {
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
       Thread object = new Thread();
       object.start();
    }
}
