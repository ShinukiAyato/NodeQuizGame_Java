import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;

public class Level1 {

    Scanner scan = new Scanner(System.in);
    int scores;

    //randomizer is very needed for the randomizing method of the question.
    String[] randomizer = {"q1", "q2", "q3", "q4", "q5", "q6", "q7", "q8", "q9", "q10"};

    //Create a Array List. The Array List will still be. The Array List will be called "list"
    ArrayList<String> list= new ArrayList<>();

    //level1() will ask your name and show your name too. After that it level 1 quiz will begin and run decider()
    public Level1() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("╔══════════════════ ∘◦ ☆ ◦∘ ═══════════════════╗");
        System.out.println("\t\t\t\tWhat is your Name?");
        System.out.println("╚══════════════════ ∘◦ ❉ ◦∘ ═══════════════════╝");
        System.out.print("╰┈➤");
        String name = scan.nextLine();
        System.out.println("╔══════════════════ ∘◦ ☆ ◦∘ ═══════════════════╗");
        System.out.println("\t\tName of the participant " + name);
        System.out.println("╚══════════════════ ∘◦ ❉ ◦∘ ═══════════════════╝");
        System.out.println("╔══════════════════ ∘◦ ☆ ◦∘ ═══════════════════╗");
        System.out.println("The time that the command have been run is " + dtf.format(now));
        System.out.println("╚══════════════════ ∘◦ ❉ ◦∘ ═══════════════════╝");
        System.out.println("Press Enter Key to Continue");
        String blank = scan.nextLine();
        System.out.println("༻✦༺   ༻✧༺   ༻✦༺   ༻❉༺   ༻✦༺   ༻✧༺   ༻✦༺");
        System.out.println("\t\t\t\tLevel 1 Begins");
        System.out.println(". ⋅ ˚̣- :- : ✧ : – : – ⭒ ⊹ ⭒ – : – : ✧ : -: -˚̣⋅ .");
        System.out.println("Question:");
        decider();
    }

    /*
    * This is where the code becomes tricky because this class is the one who randomize the question,
    * check the question if its already been asked, check if all the question has been ask.
    * if the question has been ask it will go to the level2 file and run the Level2()
    * */
    public void decider() {
        //this is where it will check if how many strings are in the Array List called "list". If list has 10 level 2 begins.
        if(list.size() == 10){
            Level2 lvl2 = new Level2();
            lvl2.Level2(scores);
        } else {
            //This is the randomizer of the question where it will loop 11 times the randomizing method
            for(int i = 0; i <= 10; i = i + 1) {
                /*
                * This is where the string in the randomizer will be pick randomly.
                * math.random() = gives your a random number between 0-1
                * randomizer.length = gives you the number of how many strings are in that array.
                * math.floor = round off the decimal just in case.
                 */
                String randomize= randomizer[(int) Math.floor(Math.random() * randomizer.length)];

                //it will check in the "list" if the string question is in. If not it will ask it to the participant.
                if(!list.contains(randomize)) {
                    //the string question will be added to the "list" so that it will not be asked again.
                    list.add(randomize);
                    switch (randomize) {
                        case "q1" -> q1();
                        case "q2" -> q2();
                        case "q3" -> q3();
                        case "q4" -> q4();
                        case "q5" -> q5();
                        case "q6" -> q6();
                        case "q7" -> q7();
                        case "q8" -> q8();
                        case "q9" -> q9();
                        case "q10" -> q10();
                    }
                }
            }
        }
    }

    //q1()-q10() is basically the questions and answer. If the answer is correct it will go to the correct_answer() and if its wrong it will go to the wrong_answer()
    public void q1() {
        System.out.println("What is javascript mostly used for?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 make web pages interactive");
        System.out.println("  『B』 make software's interesting");
        System.out.println("  『C』 make functions for hardware");
        System.out.println("  『D』 make the particles in the games move");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("a")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("JavaScript is a text-based programming language used both on the client-side and server-side that allows you to make web pages interactive.");
            wrong_answer();
        }
    }

    public void q2() {
        System.out.println("What is the name of the package manager of Javascript?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 maven");
        System.out.println("  『B』 npm");
        System.out.println("  『C』 pip");
        System.out.println("  『D』 vcpkg");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("b")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("npm is the name of the package manager for javascript");
            wrong_answer();
        }
    }

    public void q3() {
        System.out.println("What type of developer is specialize on using javascript?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 Backend Developer");
        System.out.println("  『B』 Mobile Developer");
        System.out.println("  『C』 Game Developer");
        System.out.println("  『D』 Web Developers");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("d")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("Web Developers use JavaScript every day to create interactive websites.");
            wrong_answer();
        }
    }

    public void q4() {
        System.out.println("What is javascript originally named of?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 TimeSpt");
        System.out.println("  『B』 Mocha");
        System.out.println("  『C』 JavaSpt");
        System.out.println("  『D』 LiveScript");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("b")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("It was originally named Mocha, but quickly became known as LiveScript and, later, JavaScript.");
            wrong_answer();
        }
    }
    public void q5() {
        System.out.println("Who made javascript?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 Brendan Eich");
        System.out.println("  『B』 James Gosling");
        System.out.println("  『C』 Tim Berners-Lee");
        System.out.println("  『D』 Guido van Rossum");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("a")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The first ever JavaScript was created by Brendan Eich at Netscape, and has since been updated to conform to ECMA-262 Edition 5 and later versions.");
            wrong_answer();
        }
    }

    public void q6() {
        System.out.println("When was javascript created?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 September 1995");
        System.out.println("  『B』 April 1995");
        System.out.println("  『C』 December 1965");
        System.out.println("  『D』 January 1995");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("a")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("In September 1995, a Netscape programmer named Brandan Eich developed a new scripting language in just 10 days.");
            wrong_answer();
        }
    }
    public void q7() {
        System.out.println("What is JSON used for?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 used for the development of dynamic websites and dynamic web applications.");
        System.out.println("  『B』 build a small application module or applet");
        System.out.println("  『C』 representing structured data based on JavaScript object syntax");
        System.out.println("  『D』 give structure and style to web pages");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("c")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("JavaScript Object Notation (JSON) is a standard text-based format for representing structured data based on JavaScript object syntax.");
            wrong_answer();
        }
    }

    public void q8() {
        System.out.println("Inside which HTML element do we put the JavaScript?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 <javascript>");
        System.out.println("  『B』 <script>");
        System.out.println("  『C』 <scripting>");
        System.out.println("  『D』 <js>");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("b")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The <script> tag is used to contain javascript code.");
            wrong_answer();
        }
    }
    public void q9() {
        System.out.println("Where is the correct place to insert a JavaScript in HTML?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 The <body> section");
        System.out.println("  『B』 The <head> section");
        System.out.println("  『C』 both the <head> section and the <body> section are correct");
        System.out.println("  『D』 None of the above");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("c")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The <script> tag is used to contain javascript code.");
            wrong_answer();
        }
    }

    public void q10() {
        System.out.println("How to write an IF statement in JavaScript?\n");
        System.out.println("⊱ ───────────────── {.⋅ ✯ ⋅.} ───────────────── ⊰");
        System.out.println("  『A』 if i == 0 then");
        System.out.println("  『B』 if i = 0 then");
        System.out.println("  『C』 if i = 0");
        System.out.println("  『D』 if (i == 0)");
        System.out.println("⊱ ───────────────── {⋅. ✯ .⋅} ───────────────── ⊰");
        System.out.print("╰┈➤");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if(answer.equals("d")){
            scores++;
            correct_answer();
        }
        else {
            System.out.println("The correct answer of writing an if statement is 'if (i == 0)'");
            wrong_answer();
        }
    }

    //this is the path where wrong answer goes through. After saying that your answer is incorrect it will go to decide() again.
    public void wrong_answer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have answered it incorrectly");
        System.out.println("Press Enter Key to Continue");
        String blank = scan.nextLine();
        decider();
    }

    //this is the path where correct answer goes through. After saying that your answer is correct it will go to decide() again.
    public void correct_answer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have answered it correctly");
        System.out.println("Press Enter Key to Continue");
        String blank = scan.nextLine();
        decider();
    }
}