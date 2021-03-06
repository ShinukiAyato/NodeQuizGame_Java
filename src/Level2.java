import java.util.ArrayList;
import java.util.Scanner;

public class Level2 {

    //same as the file level 1.
    Scanner scan = new Scanner(System.in);
    int scores, level1score;
    String[] randomizer = {"q1", "q2", "q3", "q4", "q5"};
    ArrayList<String> list= new ArrayList<>();

    //this will show you the previous score/level 1 score
    public void Level2(int level1) {
        level1score = level1 * 5;
        System.out.println("╔══════════════════ ∘◦ ☆ ◦∘ ═══════════════════╗");
        System.out.println("\t\tYour score in level 1 is " + level1score + "/50");
        System.out.println("╚══════════════════ ∘◦ ❉ ◦∘ ═══════════════════╝");
        System.out.println("Press Enter Key to Continue");
        String blank1 = scan.nextLine();
        System.out.println("༻✦༺   ༻✧༺   ༻✦༺   ༻❉༺   ༻✦༺   ༻✧༺   ༻✦༺");
        System.out.println("\t\t\t\tLevel 2 Begins");
        System.out.println(". ⋅ ˚̣- :- : ✧ : – : – ⭒ ⊹ ⭒ – : – : ✧ : -: -˚̣⋅ .");
        decider();
    }

    //same as usual and will run the file level3.
    public void decider() {
        if(list.size() == 5){
            Level3 lvl3 = new Level3();
            lvl3.Level3(level1score, scores);
        } else {
            for(int i = 0; i <= 5; i = i + 1) {
                String randomize= randomizer[(int) Math.floor(Math.random() * randomizer.length)];
                if(!list.contains(randomize)) {
                    list.add(randomize);
                    switch (randomize) {
                        case "q1" -> q1();
                        case "q2" -> q2();
                        case "q3" -> q3();
                        case "q4" -> q4();
                        case "q5" -> q5();
                    }
                }
            }
        }
    }

    public void q1() {
        System.out.println("Javascript is best known as a programming language\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『True』");
        System.out.println("  『False』");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.equals("false")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The answer is false. JavaScript is a lightweight, interpreted, object-oriented language with first-class functions, and is best known as the scripting language for Web pages.");
            wrong_answer();
        }
    }

    public void q2() {
        System.out.println("Javascript is one of the 3 main things on WWW(World Wide Web)\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『True』");
        System.out.println("  『False』");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.equals("true")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The answer is true.");
            wrong_answer();
        }
    }

    public void q3() {
        System.out.println("Javascript is the same as the Java\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『True』");
        System.out.println("  『False』");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.equals("false")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The answer is false. Java is an OOP programming language while Java Script is an OOP scripting language.");
            wrong_answer();
        }
    }

    public void q4() {
        System.out.println("Javascript is case sensitive\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『True』");
        System.out.println("  『False』");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.equals("true")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The answer is true. ");
            wrong_answer();
        }
    }
    public void q5() {
        System.out.println("The external JavaScript file must contain the <script> tag.\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『True』");
        System.out.println("  『False』");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.equals("false")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The answer is false. It is not necessary for any external javascript file to have <script> tag.");
            wrong_answer();
        }
    }

    public void wrong_answer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have answered it incorrectly");
        System.out.println("Press Enter Key to Continue");
        String blank = scan.nextLine();
        decider();
    }

    public void correct_answer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have answered it correctly");
        System.out.println("Press Enter Key to Continue");
        String blank = scan.nextLine();
        decider();
    }
}
