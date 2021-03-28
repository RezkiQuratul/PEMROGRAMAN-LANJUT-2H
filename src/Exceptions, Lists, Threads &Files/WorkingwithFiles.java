import java.io.File;

class WorkingwithFiles {
    public static void main(String[] args) {
        File file = new File("a.txt");
        if(file.exists()) {
            System.out.println("Yes");
        }
    }
}
