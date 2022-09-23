import java.util.Scanner;

import javafx.scene.transform.Scale;

public class dowhile {
    public static void main(String[] args)
    {
        int mark;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the mark");
        mark = scanner.nextInt();
        if(mark >=90 && mark >100)
        System.out.println("grade a");
        else if(mark >=80)
        System.out.println("grade b");
        else if(mark >=70)
        System.out.println("grade c");
        else if(mark >=60)
        System.out.println("grade d");
        else{
            System.out.println("grade e");
        }




        
}
}


