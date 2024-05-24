import java.util.Scanner;

public final class Test {
    
    private static final int INT_MAX = 1000000;

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     sc.nextLine();
     while(t-->0)
     {
        String val = sc.nextLine();
        int ans =INT_MAX;
        for(char ch='a';ch<='z';ch++)
        {
            int curAns =0;
            int i =0;
            while(i<val.length())
            {
                int curCount=0;
                while(i<val.length() && val.charAt(i)!=ch)
                {
                    System.out.println(val.charAt(i));
                    curCount++;
                    i++;
                }
                while(curCount>=0)
                {
                    curAns++;
                    curCount/=2;
                }
                i++;

            }
            ans = Math.min(ans,curAns);

        }
        System.out.println(ans);
         
         
     }
        
        
    }
}