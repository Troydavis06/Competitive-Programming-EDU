import java.util.*;
import java.io.*;
import java.text.*;

public class prob011 {

    public static void main(String[] args) throws Exception {
        new prob011().run();
    }

    public void run() throws Exception {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String line = in.nextLine();
            String[] data = line.split(" ");

            if(data.length%2==0){
                int product = 1;
                for (int i = 0; i < data.length; i++) {
                    product*=Integer.parseInt(data[i]);
                }
                System.out.println(product);
            }
            else{
                int sum = 0;
                for (int i = 0; i < data.length; i++) {
                    sum+=Integer.parseInt(data[i]);
                }
                System.out.println(sum);
            }
        }

    }
}