package baseball;

import java.util.Scanner;
import utils.Utils;
import utils.RandomUtils;

public class Application 
{
    final static RandomUtils randomUtils = new RandomUtils();
    static boolean isStart = true;
    public static void main(String[] args) 
    {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        
        Utils utils = new Utils();
        String strNumber = "";

        randomUtils.setRandomNum();
        while(isStart)
        {
            System.out.println(randomUtils.getRandom());
            utils.showInputMessage();
            strNumber = scanner.nextLine();
            
            System.out.print(comNumber(strNumber));
            
            
        }
    }

    private static String comNumber(String strInput)
    {
        int s = 0;
        int b = 0;

        for(int index = 0; index < randomUtils.getRandom().length(); index++)
        {
            for(int index2 = 0; index2 < randomUtils.getRandom().length(); index2++)
            {
                if( index == index2 )
                    if( strInput.charAt(index2) == randomUtils.getRandom().charAt(index) )
                        s++;
                if( strInput.charAt(index2) == randomUtils.getRandom().charAt(index) )
                    b++;
            }
            
        }

        if( s != 0 && b != 0 ) 
        {
            isStart = false;
            return s + "스트라이크" + " " + b + "볼";
        }
        if( s != 0 ) return s + "스트라이크";
        if( b != 0 ) return b + "볼";
        if( s == 0 && b == 0 )  return "낫싱";

        return "";
    }
}
