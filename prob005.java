import java.util.*;
import java.io.*;
import java.text.*;

public class prob005 {

    public static void main(String[] args) throws Exception {
        new prob005().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("prob005.dat"));
        int cases = in.nextInt();
        in.nextLine();

        for (int i = 0; i < cases; i++) {
            String[] line = in.nextLine().split(" ");
            int a = Integer.parseInt(line[0]);
            a+=5;
            String b = line[1];

            System.out.println(a + " " + b);
        }
    }
}