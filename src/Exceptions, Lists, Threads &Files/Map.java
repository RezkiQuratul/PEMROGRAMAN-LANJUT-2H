import java.util.HashMap;

class Map {
    public static void main(String[] args) {
        HashMap<String, String>m = new HashMap<String, String>();

        m.put("A", "First");
        m.put("B", "Seceond");
        m.put("C", "Trid");

        System.out.println(m.get("B"));

    }
}
