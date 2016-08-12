/**
 * Created by jeffreydorney on 8/8/16.
 */
public class Main {
    public static void main(String[] args) {

        // created a point in memory for kata the new Kata class
        Kata kata = new Kata();

        // println describing output format
        System.out.println("\n(Method[Arguments] ==> Expected Result ; --> My output.)\n");

        // kata one - sleepIn called and printed
        System.out.println("*** Exercise 1 - Sleep In Method ***\n");
        System.out.println("sleepIn(false, false) ==> true ; My result --> " + kata.sleepIn(false, false));
        System.out.println("sleepIn(true, false) ==> false ; My result --> " + kata.sleepIn(true, false));
        System.out.println("sleepIn(false, true) ==> true ; My result --> " + kata.sleepIn(false, true));
        System.out.println("sleepIn(true, true) ==> true ; My result --> " + kata.sleepIn(true, true));

        //prints a break line
        System.out.println("\n");

        // kata two - monkeyTrouble called and printed
        System.out.println("*** Exercise 2 - Monkey Trouble Method ***\n");
        System.out.println("monkeyTrouble(true, true) ==> true ; My result --> " + kata.monkeyTrouble(true, true));
        System.out.println("monkeyTrouble(false, false) ==> true ; My result --> " + kata.monkeyTrouble(false, false));
        System.out.println("monkeyTrouble(true, false) ==> false ; My result --> " + kata.monkeyTrouble(true, false));
        System.out.println("monkeyTrouble(false, true) ==> false ; My result --> " + kata.monkeyTrouble(false, true));

        System.out.println("\n");

        // kata three - sumDouble called and printed
        System.out.println("*** Exercise 3 - Sum's Double Method ***\n");
        System.out.println("sumDouble(1, 2) ==> 3 ; My result --> " + kata.sumDouble(1, 2));
        System.out.println("sumDouble(3, 2) ==> 5 ; My result --> " + kata.sumDouble(3, 2));
        System.out.println("sumDouble(2, 2) ==> 8 ; My result --> " + kata.sumDouble(2, 2));
        System.out.println("sumDouble(-1, 0) ==> -1 ; My result --> " + kata.sumDouble(-1, 0));
        System.out.println("sumDouble(3, 3) ==> 12 ; My result --> " + kata.sumDouble(3, 3));
        System.out.println("sumDouble(0, 0) ==> 0 ; My result --> " + kata.sumDouble(0, 0));
        System.out.println("sumDouble(0, 1) ==> 1 ; My result --> " + kata.sumDouble(0, 1));
        System.out.println("sumDouble(3, 4) ==> 7 ; My result --> " + kata.sumDouble(3, 4));

        System.out.println("\n");

        // kata four -  diff21 called and printed
        System.out.println("diff21(19) ==> 2 ; My result --> " + kata.diff21(19));
        System.out.println("diff21(10) ==> 11 ; My result --> " + kata.diff21(10));
        System.out.println("diff21(21) ==> 0 ; My result --> " + kata.diff21(21));
        System.out.println("diff21(22) ==> 2 ; My result --> " + kata.diff21(22));
        System.out.println("diff21(25) ==> 8 ; My result --> " + kata.diff21(25));
        System.out.println("diff21(30) ==> 18 ; My result --> " + kata.diff21(30));
        System.out.println("diff21(0) ==> 21 ; My result --> " + kata.diff21(0));
        System.out.println("diff21(1) ==> 20 ; My result --> " + kata.diff21(1));
        System.out.println("diff21(2) ==> 19 ; My result --> " + kata.diff21(2));
        System.out.println("diff21(-1) ==> 22 ; My result --> " + kata.diff21(-1));
        System.out.println("diff21(-2) ==> 23 ; My result --> " + kata.diff21(-2));
        System.out.println("diff21(50) ==> 58 ; My result --> " + kata.diff21(50));


    }
}
