import java.util.Scanner;

public class Main  {

    Scanner scan = new Scanner(System.in);

    //this is the start and will run the file name called level1.
    public static void main(String[] args) {
        Level1 Level1 = new Level1();
    }

    //this is where the decision making starts. It will ask if you want to restart the game or not. If you do you it will run the level1 file again.
    public void ask_retry(){
        System.out.println("╔══════════════════ ∘◦ ☆ ◦∘ ═══════════════════╗");
        System.out.println("\tDo You want to Restart or Quit the game? ");
        System.out.println("╚══════════════════ ∘◦ ❉ ◦∘ ═══════════════════╝");
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