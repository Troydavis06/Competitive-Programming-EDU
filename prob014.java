import java.util.*;
import java.io.*;
import java.text.*;

public class prob014 {

    public static void main(String[] args) throws Exception {
        new prob014().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        in.nextLine();

        for (int i = 0; i < cases; i++) {
            String line = in.next();

            String rev = new StringBuilder(line).reverse().toString();

//            for (int j = line.length()-1; j >= 0; j--) {
//                rev+=line.substring(j,j+1);
//            }

            System.out.println(rev);
        }

    }
}