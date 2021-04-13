import java.util.Scanner;

public class Main  {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Level1 Level1 = new Level1();
    }

    public void decision(){
        System.out.print("\f");
        System.out.println("╔═════════════ ∘◦ ☆ ◦∘ ══════════════╗");
        System.out.println("Do You want to Restart or Quit the game? ");
        System.out.println("╚═════════════ ∘◦ ❉ ◦∘ ══════════════╝");
        System.out.println("Type R to Restart the Game and any key to leave");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.equals("r")){
            Level1 Level1 = new Level1();
        } else {
            System.out.println("Have a nice day! Thanks for playing the NodeQuiz");
        }
    }
}