import java.util.*;
import java.io.*;
import java.text.*;

public class prob004 {

    public static void main(String[] args) throws Exception {
        new prob004().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("prob004.dat"));
        int cases = in.nextInt();
        in.nextLine();

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            a.add(in.nextInt());
        }

        for (int i = a.size()-1; i >= 0; i--) {
            System.out.println(a.get(i));
        }
    }
}