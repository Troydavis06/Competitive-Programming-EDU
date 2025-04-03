import java.util.*;
import java.io.*;
import java.text.*;

public class prob009 {

    public static void main(String[] args) throws Exception {
        new prob009().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        in.nextLine();

        int sum = 0;

        for(int i = 0; i < cases; i ++){
            sum+=in.nextInt();
        }

        System.out.println(sum);

    }
}