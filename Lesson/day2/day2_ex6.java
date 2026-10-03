import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class day2_ex6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;

        while(true){
            System.out.println("Type any number");

            String str = br.readLine();
            a = Integer.parseInt(str);

            if(a % 3 != 0)
            {
                System.out.println("Not a multiple of 3");
                continue;
            }

            System.out.println("Your input: " + a);
            break;
        }
    }
}
