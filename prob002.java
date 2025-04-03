import java.util.*;
import java.io.*;
import java.text.*;

public class prob002 {

    public static void main(String[] args) throws Exception {
        new prob002().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        in.nextLine();

        for (int i = 0; i < cases; i++) {
            System.out.println(in.nextInt());
        }

    }
}