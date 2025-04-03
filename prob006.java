import java.util.*;
import java.io.*;
import java.text.*;

public class prob006 {

    public static void main(String[] args) throws Exception {
        new prob006().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("prob006.dat"));
        int cases = in.nextInt();
        in.nextLine();

        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            a.add(in.nextLine().trim());
        }

        Collections.sort(a);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }
}