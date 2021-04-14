import java.util.ArrayList;
import java.util.Scanner;

public class Level3 {

    Scanner scan = new Scanner(System.in);
    int scores, level1score, level2score, level3score;
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
            System.out.print("\f");
            level3score = scores * 15;
            System.out.println("╔═════════════ ∘◦ ☆ ◦∘ ══════════════╗");
            System.out.println("Your score in level 1 is " + level1score + "/50");
            System.out.println("Your score in level 2 is " + level2score + "/50");
            System.out.println("Your score in level 3 is " + level3score + "/75");
            System.out.println("Your score in Total Score is " + (level1score + level2score + level3score) + "/175");
            System.out.println("╚═════════════ ∘◦ ❉ ◦∘ ══════════════╝");
            System.out.println("Press Enter Key to Continue");
            String blank = scan.nextLine();
            Main main = new Main();
            main.decision();

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
        System.out.println("『What kind of Language is Javascript?』");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("script")){
            scores++;
            pass();
        }
        else {
            System.out.println("JavaScript is a lightweight, interpreted, object-oriented language with first-class functions, and is best known as the scripting language for Web pages.");
            fail();
        }
    }

    public void q2() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("What is the full name of the package manager of JavaScript?");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("node") & answer.contains("package") & answer.contains("manager")){
            scores++;
            pass();
        }
        else {
            System.out.println("The full name of the package manager is Node Package Manager (npm).");
            fail();
        }
    }

    public void q3() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("What Language was Javascript based of?");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("ecmascript")){
            scores++;
            pass();
        }
        else {
            System.out.println("Javascript was based on ECMAScript a scripting language developer by Sun Microsystems.");
            fail();
        }
    }

    public void q4() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("Where is the trademark of Javascript in US?");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("oracle") & answer.contains("corporation")){
            scores++;
            pass();
        }
        else {
            System.out.println("\"JavaScript\" is a trademark of Oracle Corporation in the United States. It is used under license for technology invented and implemented by Netscape Communications and other parties. ");
            fail();
        }
    }
    public void q5() {
        System.out.println("⊱ ──────────── {.⋅ ✯ ⋅.} ──────────── ⊰");
        System.out.println("What is the other well known name of JavaScript?");
        System.out.println("⊱ ──────────── {⋅. ✯ .⋅} ──────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();
        if(answer.contains("livescript")){
            scores++;
            pass();
        }
        else {
            System.out.println("""
                    When JavaScript was created, it initially had another name: “LiveScript”. But Java was very popular at that time, so it was decided that positioning a new language as a “younger brother” of Java would help.

                    But as it evolved, JavaScript became a fully independent language with its own specification called ECMAScript, and now it has no relation to Java at all.

                    """);
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
