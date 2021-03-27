enum Color {
    RED, BLUE, GREEAN;
}
class PrintColor {
    public static void main(String[] args) {
        Color color = Color.RED;
        switch (color) {
            case BLUE:
                System.out.println("1");
                break;
            case GREEAN:
                System.out.println("2");
                break;
            default:
                System.out.println("0");
                break;
        }
    }
}
