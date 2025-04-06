//9
/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a 
computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show 
the winning percentage between the player and the computer.
 */

import java.util.Scanner;
import java.lang.Math;

class RockPaperScissors{
    public static String ComputerChoice(){
        String[] choices = {"Rock","Paper","Scissors"} ;
        int a = (int)(Math.random()*3 );
        return choices[a];
    }
    public static String  winner(String user, String comp){
        String str = " ";
        if(user.equalsIgnoreCase(comp)) str= "Draw";
        else if((user.equalsIgnoreCase("Rock") && comp.equals("Scissors")) ||
        (user.equalsIgnoreCase("Paper") && comp.equals("Rock")) ||
        (user.equalsIgnoreCase("Scissors") && comp.equals("Paper"))  ) str = "User";
        else str = "Computer";
        return str;
    }
    public static String[][] FindPercentage(int userwins, int compwins, int n){
        String[][] stats = new String[2][2];
        stats[0][0] = "User wins";
        stats[1][0] = "Computer wins";
        
        if (n == 0) {  // Prevent division by zero
            stats[0][1] = "0";
            stats[1][1] = "0";
        } else {
            stats[0][1] = Integer.toString((userwins * 100) / n) + "%";
            stats[1][1] = Integer.toString((compwins * 100) / n) + "%";
        }
        return stats;
    }
    public static void display(int userwins, int compwins, int n){
        String[][] stats = RockPaperScissors.FindPercentage(userwins, compwins, n);
        System.out.println("Game Results");
        System.out.println("---------------------------");
        System.out.printf("%-15s %-15s ", "category","percentage\n");
        for(int i=0; i<stats.length; i++){
            System.out.printf("%-15s %-15s \n",stats[i][0],stats[i][1]);
        }
    }
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of games : ");
        n = input.nextInt();
        int userwins =0, compwins=0;
        
        for(int i=0; i<n; i++){
            System.out.print("Enter Rock, Paper or Scissors : ");
            String userChoice = input.next();
            String compChoice = RockPaperScissors.ComputerChoice();
            System.out.println("Computer choice is : " + compChoice);
            String winner = RockPaperScissors.winner(userChoice, compChoice);
            if(winner.equals("User")){
                userwins++;
                System.out.println("You won!");
            }
            else if(winner.equals("Computer")){
                compwins++;
                System.out.println("Computer won!");
            }
            else System.out.println("Its a Draw!");
        }
        display(userwins, compwins, n);
        input.close();

    }
}