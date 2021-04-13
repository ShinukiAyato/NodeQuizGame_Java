import java.util.ArrayList;
import java.util.Scanner;

public class Level3 {

    Scanner scan = new Scanner(System.in);
    int scores, level1score, level2score;
    String[] randomizer = {"q1", "q2", "q3", "q4", "q5"};
    ArrayList<String> list= new ArrayList<>();

    public void Level3(int level1, int level2) {
        level1score = level1;
        level2score = level2 * 10;
        System.out.println("╔═════════════ ∘◦ ☆ ◦∘ ══════════════╗");
        System.out.println("Your score in level 1 is " + level1score + "/50");
        System.out.println("Your score in level 2 is " + level2score + "/50");
        System.out.println("Your score in Total Score is " + (level1score + level2score) + "/100");
        System.out.println("╚═════════════ ∘◦ ❉ ◦∘ ══════════════╝");
        System.out.println("Press Enter Key to Continue");
        String blank1 = scan.nextLine();
        System.out.print("\f");
        System.out.println("༻✦༺ ༻✧༺  ༻✦༺  ༻❉༺  ༻✦༺  ༻✧༺༻✦༺");
        System.out.println("            Level 3 Begins");
        System.out.println(". ⋅ ˚̣- :- : ✧ : – ⭒ ⊹ ⭒ – : ✧ : -: -˚̣⋅ .");
        System.out.println("Press Enter Key to Begin Level 3");
        String blank = scan.nextLine();
        decider();
    }

    public void decider() {
        if(list.size() == 5){
            System.out.println("Your current score now is " + ((scores * 10) + level1score));
        } else {
            for(int i = 0; i <= 5; i = i + 1) {
                String randomize= randomizer[(int) Math.floor(Math.random() * randomizer.length)];
                if(!list.contains(randomize)) {
                    list.add(randomize);
                    switch (randomize) {
                        case "q1" -> {
                            System.out.print("\f");
                            q1();
                        }
                        case "q2" -> {
                            System.out.print("\f");
                            q2();
                        }
                        case "q3" -> {
                            System.out.print("\f");
                            q3();
                        }
                        case "q4" -> {
                            System.out.print("\f");
                            q4();
                        }
                        case "q5" -> {
                            System.out.print("\f");
                            q5();
                        }
                    }
                }
            }
        }
    }

    public void q1() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("『True』");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("false")){
            scores++;
            pass();
        }
        else {
            System.out.println("The answer is false. JavaScript is a lightweight, interpreted, object-oriented language with first-class functions, and is best known as the scripting language for Web pages.");
            fail();
        }
    }

    public void q2() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("『False』");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("true")){
            scores++;
            pass();
        }
        else {
            System.out.println("The answer is true.");
            fail();
        }
    }

    public void q3() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("『False』");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("false")){
            scores++;
            pass();
        }
        else {
            System.out.println("The answer is false. Java is an OOP programming language while Java Script is an OOP scripting language.");
            fail();
        }
    }

    public void q4() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("『False』");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("true")){
            scores++;
            pass();
        }
        else {
            System.out.println("The answer is true. ");
            fail();
        }
    }
    public void q5() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("『True』");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("false")){
            scores++;
            pass();
        }
        else {
            System.out.println("The answer is false. It is not necessary for any external javascript file to have <script> tag.");
            fail();
        }
    }

    public void fail() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have answered it incorrectly");
        System.out.println("Press Enter Key to Continue");
        String blank = scan.nextLine();
        decider();
    }

    public void pass() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have answered it correctly");
        System.out.println("Press Enter Key to Continue");
        String blank = scan.nextLine();
        decider();
    }
}
