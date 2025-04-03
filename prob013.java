import java.util.*;
import java.io.*;
import java.text.*;

public class prob013 {

    public static void main(String[] args) throws Exception {
        new prob013().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num = in.nextInt();

            if(num%2==0){
                System.out.println("even");
            }
            else System.out.println("odd");
        }
    }
}