import java.util.ArrayList;
import java.util.Scanner;

public class Level3 {

    //same as the file level 1
    Scanner scan = new Scanner(System.in);
    int scores, level1score, level2score, level3score;
    String[] randomizer = {"q1", "q2", "q3", "q4", "q5"};
    ArrayList<String> list= new ArrayList<>();

    //shows your previous score the level 1, level 2, and total score
    public void Level3(int level1, int level2) {
        level1score = level1;
        level2score = level2 * 10;
        System.out.println("╔══════════════════ ∘◦ ☆ ◦∘ ═══════════════════╗");
        System.out.println("\t\t Your score in level 1 is " + level1score + "/50");
        System.out.println("\t\t Your score in level 2 is " + level2score + "/50");
        System.out.println("\t   Your score in Total Score is " + (level1score + level2score) + "/100");
        System.out.println("╚══════════════════ ∘◦ ❉ ◦∘ ═══════════════════╝");
        System.out.println("Press Enter Key to Continue");
        String blank1 = scan.nextLine();
        System.out.println("༻✦༺   ༻✧༺   ༻✦༺   ༻❉༺   ༻✦༺   ༻✧༺   ༻✦༺");
        System.out.println("\t\t\t\tLevel 3 Begins");
        System.out.println(". ⋅ ˚̣- :- : ✧ : – : – ⭒ ⊹ ⭒ – : – : ✧ : -: -˚̣⋅ .");
        decider();
    }

    /*
    * more likely the same as the level 1 file. Shows you the score level 1, level 2, level 3, and the total score.
    * It will run Main.java and run the class called "asked_retry()".
    */
    public void decider() {
        if(list.size() == 5){
            level3score = scores * 15;
            System.out.println("╔══════════════════ ∘◦ ☆ ◦∘ ═══════════════════╗");
            System.out.println("\t\t Your score in level 1 is " + level1score + "/50");
            System.out.println("\t\t Your score in level 2 is " + level2score + "/50");
            System.out.println("\t\t Your score in level 3 is " + level3score + "/75");
            System.out.println("\t   Your score in Total Score is " + (level1score + level2score + level3score) + "/175");
            System.out.println("╚══════════════════ ∘◦ ❉ ◦∘ ═══════════════════╝");
            Main main = new Main();
            main.ask_retry();
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
        System.out.println("⊱ ────────────────────── {.⋅ ✯ ⋅.} ────────────────────── ⊰");
        System.out.println("\t\t  What kind of Language is Javascript?");
        System.out.println("⊱ ────────────────────── {⋅. ✯ .⋅} ────────────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("script")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("JavaScript is a lightweight, interpreted, object-oriented language with first-class functions, and is best known as the scripting language for Web pages.");
            wrong_answer();
        }
    }

    public void q2() {
        System.out.println("⊱ ────────────────────── {.⋅ ✯ ⋅.} ────────────────────── ⊰");
        System.out.println("What is the full name of the package manager of JavaScript?");
        System.out.println("⊱ ────────────────────── {⋅. ✯ .⋅} ────────────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("node") & answer.contains("package") & answer.contains("manager")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The full name of the package manager is Node Package Manager (npm).");
            wrong_answer();
        }
    }

    public void q3() {
        System.out.println("⊱ ────────────────────── {.⋅ ✯ ⋅.} ────────────────────── ⊰");
        System.out.println("\t\t What Language was Javascript based of?");
        System.out.println("⊱ ────────────────────── {⋅. ✯ .⋅} ────────────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("ecmascript")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("Javascript was based on ECMAScript a scripting language developer by Sun Microsystems.");
            wrong_answer();
        }
    }

    public void q4() {
        System.out.println("⊱ ────────────────────── {.⋅ ✯ ⋅.} ────────────────────── ⊰");
        System.out.println("\t   Where is the trademark of Javascript in US?");
        System.out.println("⊱ ────────────────────── {⋅. ✯ .⋅} ────────────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("oracle") & answer.contains("corporation")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("\"JavaScript\" is a trademark of Oracle Corporation in the United States. It is used under license for technology invented and implemented by Netscape Communications and other parties. ");
            wrong_answer();
        }
    }
    public void q5() {
        System.out.println("⊱ ────────────────────── {.⋅ ✯ ⋅.} ────────────────────── ⊰");
        System.out.println("\t What is the other well known name of JavaScript?");
        System.out.println("⊱ ────────────────────── {⋅. ✯ .⋅} ────────────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("livescript")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("""
                    When JavaScript was created, it initially had another name: “LiveScript”. But Java was very popular at that time, so it was decided that positioning a new language as a “younger brother” of Java would help.

                    But as it evolved, JavaScript became a fully independent language with its own specification called ECMAScript, and now it has no relation to Java at all.

                    """);
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
