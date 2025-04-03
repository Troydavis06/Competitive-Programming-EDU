import java.util.*;
import java.io.*;
import java.text.*;

public class prob007 {

    public static void main(String[] args) throws Exception {
        new prob007().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("prob007.dat"));
        int cases = in.nextInt();
        in.nextLine();

        for (int i = 0; i < cases; i++) {
            String[] line = in.nextLine().trim().split(" ");

            int sum = 0;

            for (int j = 0; j < line.length; j++) {
                sum += Integer.parseInt(line[j]);
            }

            System.out.println(sum);
        }
    }
}