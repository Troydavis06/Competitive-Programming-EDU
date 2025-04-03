import java.util.*;
import java.io.*;
import java.text.*;

public class prob012 {

    public static void main(String[] args) throws Exception {
        new prob012().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
        String ret = "";

        while(in.hasNextLine()){
            String line = in.nextLine();
            ret+=line + " ";
        }

        System.out.println(ret.trim());

    }
}