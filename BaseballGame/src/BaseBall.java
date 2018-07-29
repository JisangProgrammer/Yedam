//**************************************************************
//   Lecture: JAVA-Programming
//   Program Title: Num_Baseball Program 
//   File Name: BaseBall.java 
//   Author: J. K. Park 
//   Short Description: 조건문 이해
//   Created: 2013/02/21 
//   Edited:
//**************************************************************

 
import java.util.Scanner;
 
public class BaseBall {
    int[] num = new int[3];
    int[] ans = new int[3];
    int strike = 0;
    int ball = 0;
    int i, j;
    int count = 0;
    public void input()
    {
        strike = 0; ball = 0;
        Scanner scan = new Scanner(System.in);
        for(i=0; i<3; i++)
        {
            try 
            {
                System.out.println(i+1+"번째 숫자를 입력하세요(1~9)");
                ans[i] = Integer.parseInt(scan.next());
                if(ans[i]>9)
                {
                    System.err.println("1~9사이의 수를 입력하세요");
                    i-=1;
                }
            } catch (NumberFormatException e) {
                System.err.println("숫자만 입력하세요");
                i-=1;
            }
        }
    }
 
    public void makeNum()
    {        
        num[0] = 1 + (int)(Math.random() * 9);
 
        num[1] = 1 + (int)(Math.random() * 9);
        while(num[0] == num[1])
        {
            num[1] = 1 + (int)(Math.random() * 9);
        }
        num[2] = 1 + (int)(Math.random() * 9);
        while(num[0]==num[2] || num[1]==num[2])
        {
            num[2] = 1 + (int)(Math.random() * 9);
        }            
        System.out.println(num[0] + "," + num[1] + "," + num[2]);
    }
 
    public void answer()
    {
        System.out.println("정답은 "+"("+num[0] + "," + num[1] + "," + num[2]+")");
        System.out.println(count+"회 만에 맞추셨습니다!");
    }
 
    public void checkStrike()
    {    
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                if((num[i] == ans[j]) && (i==j))
                {
                    strike += 1;
                }
                else if((num[i] == ans[j]) && (i!=j))
                {
                    ball += 1;
                }
            }        
        }
        count +=1;
        System.out.println("Strike = "+strike+"//"+"Ball = "+ball);
    }
 
    public static void main(String[] args) {
        BaseBall bb = new BaseBall();
 
        bb.makeNum();
        while(true)
        {
            bb.input();
            bb.checkStrike();
            if(bb.strike == 3)
            {
                break;
            }
        }
        bb.answer();
    }
}