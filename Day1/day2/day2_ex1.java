import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day2_ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        // 数値を読み込み
        str = br.readLine();
        int num = Integer.parseInt(str);

        if(num % 3 == 0)
        {
            System.out.println("しゃん！");
        }
        else
        {
            System.out.println(num);
        }
    }
}
