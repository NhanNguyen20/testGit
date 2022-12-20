import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class testPush {
    public static void main(String[] args) throws IOException {
        System.out.println("Testing the git push");
        PrintWriter pw = new PrintWriter(new FileWriter("src/test.txt", false));
        pw.println("This is the text file");
        pw.close();

        System.out.println("Hi world");
    }
}
