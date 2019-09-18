/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prayas;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class SnakesAndLadders {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the names of the two players:");
        String A=sc.next();      
        String B=sc.next();
        int playerAposition=0;
        int playerBposition=0;
        int count=0;
        int x;
        
       
        
        while(playerAposition!=30&&playerBposition!=30)
        {   System.out.println();
             
            x=1+(int)(Math.random()*(6-1+1));
            if((playerAposition+x)<=30)
             
                 
                 playerAposition=x+playerAposition; //position update for player A
                 System.out.println(A+" throws "+x);
                      
             System.out.println(A+" reaches to cell "+playerAposition);
             
            
            
            
         switch(playerAposition)
            {   //for ladders
                case 3:System.out.println(A+" reaches to base of a ladder ");   playerAposition=22;
                       System.out.println(A+" climbs upto postion 22");
                       break;
                case 5:System.out.println(A+" reaches to base of a ladder ");   playerAposition=8;
                       System.out.println(A+" climbs upto postion 8");
                       break;
                case 11:System.out.println(A+" reaches to base of a ladder ");  playerAposition=26;
                        System.out.println(A+" climbs upto postion 26");
                        break;
                case 20:System.out.println(A+" reaches to base of a ladder ");  playerAposition=29;               
                        System.out.println(A+" climbs upto postion 29");
                        break;
                //for snakes
                case 17:System.out.println(A+" reaches to mouth of a snake ");  playerAposition=4;
                        System.out.println(A+" goes down to 4");
                        break;
                case 19:System.out.println(A+" reaches to mouth of a snake ");  playerAposition=7;
                        System.out.println(A+" climbs upto postion 7");
                        break;
                case 21:System.out.println(A+" reaches to mouth of a snake ");  playerAposition=9;
                        System.out.println(A+" climbs upto postion 9");
                        break;
                case 27:System.out.println(A+" reaches to mouth of a snake ");  playerAposition=1;
                        System.out.println(A+" climbs upto postion 1");
                        break;
                default:break;
            }
             
             
                 System.out.println();
                 
                 x=1+(int)(Math.random()*(6-1+1));
                 if((playerBposition+x)<=30)
                  
                     playerBposition=x+playerBposition;       //position update of playerB
                     System.out.println(B+" throws "+x);
                     
                     System.out.println(B+" reaches to cell "+playerBposition);
                 
                 
                 
                 switch(playerBposition)
                 {   //for ladders
                     case 3:System.out.println(B+" reaches to base of a ladder "); playerBposition=22;
                     System.out.println(B+" climbs upto postion 22");
                     break;
                     case 5:System.out.println(B+" reaches to base of a ladder ");  playerBposition=8;
                     System.out.println(B+" climbs upto postion 8");
                     break;
                     case 11:System.out.println(B+" reaches to base of a ladder "); playerBposition=26;
                     System.out.println(B+" climbs upto postion 26");
                     break;
                     case 20:System.out.println(B+" reaches to base of a ladder "); playerBposition=29;
                     System.out.println(B+" climbs upto postion 29");
                     break;
                     //for snakes
                     case 17:System.out.println(B+" reaches to mouth of a snake "); playerBposition=4;
                     System.out.println(B+" goes down to 4");
                     break;
                     case 19:System.out.println(B+" reaches to mouth of a snake "); playerBposition=7;
                     System.out.println(B+" goes down to 7");
                     break;
                     case 21:System.out.println(B+" reaches to mouth of a snake "); playerBposition=9;
                     System.out.println(B+" goes down to 9");
                     break;
                     case 27:System.out.println(B+" reaches to mouth of a snake "); playerBposition=1;
                     System.out.println(B+" goes down to 1");
                     break;
                     default:break;
                 }
                 count++;
             } 
        
              System.out.println();

               System.out.println("Total number of dice throws made by each player is: "+count);
        
          if(playerAposition>=30&&playerBposition>=30) 
        {
            System.out.println("It's a tie....");
        }
          
          else if(playerAposition>=30)
            {
                System.out.println(A+" is the winner...");
            }

        else
            {
                System.out.println(B+" is the winner...");
            }
          
        }
}
        
        
        
        
    
    

