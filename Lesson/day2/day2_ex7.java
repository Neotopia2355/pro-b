public class day2_ex7 {
    public static void main(String[] args){
        for(int i = 0; i < 9; i++)
        {
            System.out.print(i + ":");

            // 以下解答
            switch(i % 3)
            {
                case 0:
                    System.out.print("*****");
                    break;
                
                case 1:
                    System.out.print("***");
                    break;
                
                case 2:
                    System.out.print("*");
                    break;
            }
            // 以上解答
            
            System.out.println();
        }
    }
    
}
