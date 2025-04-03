import java.util.*;
import java.io.*;
import java.text.*;

public class prob010 {

    public static void main(String[] args) throws Exception {
        new prob010().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        in.nextLine();

        for (int i = 0; i < cases; i++) {
            String line = in.nextLine();
            String[] data = line.split(" ");

            int sum = 0;

            for (int j = 0; j < data.length; j++) {
                sum += Integer.parseInt(data[j]);
            }

            System.out.println(sum);

        }
    }
}