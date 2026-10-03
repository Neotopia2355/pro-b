import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class day2_ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        str = br.readLine();
        int a = Integer.parseInt(str);

        if(a >= 5 && a < 10)
        {
            // yesと表示する問題の例がaになっている
            // System.out.println(a);
            System.out.println("Yes!");
        }
        else
        {
            System.out.println("out of range");
        }
    }
    
}
