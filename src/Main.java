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

        //prints a double line break
        System.out.println("\n");

        // kata two - monkeyTrouble called and printed
        System.out.println("*** Exercise 2 - Monkey Trouble Method ***\n");
        System.out.println("monkeyTrouble(true, true) ==> true ; My result --> " + kata.monkeyTrouble(true, true));
        System.out.println("monkeyTrouble(false, false) ==> true ; My result --> " + kata.monkeyTrouble(false, false));
        System.out.println("monkeyTrouble(true, false) ==> false ; My result --> " + kata.monkeyTrouble(true, false));
        System.out.println("monkeyTrouble(false, true) ==> false ; My result --> " + kata.monkeyTrouble(false, true));

        System.out.println("\n");

        // kata three - sumDouble called and printed
        System.out.println("*** Exercise 3 - Sum Double Method ***\n");
        System.out.println("sumDouble(1, 2) ==> 3 ; My result --> " + kata.sumDouble(1, 2));
        System.out.println("sumDouble(3, 2) ==> 5 ; My result --> " + kata.sumDouble(3, 2));
        System.out.println("sumDouble(2, 2) ==> 8 ; My result --> " + kata.sumDouble(2, 2));
        System.out.println("sumDouble(-1, 0) ==> -1 ; My result --> " + kata.sumDouble(-1, 0) + "\n");

        System.out.println("sumDouble(3, 3) ==> 12 ; My result --> " + kata.sumDouble(3, 3));
        System.out.println("sumDouble(0, 0) ==> 0 ; My result --> " + kata.sumDouble(0, 0));
        System.out.println("sumDouble(0, 1) ==> 1 ; My result --> " + kata.sumDouble(0, 1));
        System.out.println("sumDouble(3, 4) ==> 7 ; My result --> " + kata.sumDouble(3, 4));

        System.out.println("\n");

        // kata four -  diff21 called and printed
        System.out.println("*** Exercise 4 - Difference 21 Method ***\n");
        System.out.println("diff21(19) ==> 2 ; My result --> " + kata.diff21(19));
        System.out.println("diff21(10) ==> 11 ; My result --> " + kata.diff21(10));
        System.out.println("diff21(21) ==> 0 ; My result --> " + kata.diff21(21));
        System.out.println("diff21(22) ==> 2 ; My result --> " + kata.diff21(22));
        System.out.println("diff21(25) ==> 8 ; My result --> " + kata.diff21(25) + "\n");

        System.out.println("diff21(30) ==> 18 ; My result --> " + kata.diff21(30));
        System.out.println("diff21(0) ==> 21 ; My result --> " + kata.diff21(0));
        System.out.println("diff21(1) ==> 20 ; My result --> " + kata.diff21(1));
        System.out.println("diff21(2) ==> 19 ; My result --> " + kata.diff21(2));
        System.out.println("diff21(-1) ==> 22 ; My result --> " + kata.diff21(-1) + "\n");

        System.out.println("diff21(-2) ==> 23 ; My result --> " + kata.diff21(-2));
        System.out.println("diff21(50) ==> 58 ; My result --> " + kata.diff21(50));

        System.out.println("\n");

        // kata five - parrotTrouble called and printed
        System.out.println("*** Exercise 5 - Parrot Trouble Method ***\n");
        System.out.println("parrotTrouble(true, 6) ==> true ; My result --> " + kata.parrotTrouble(true, 6));
        System.out.println("parrotTrouble(true, 7) ==> false ; My result --> " + kata.parrotTrouble(true, 7));
        System.out.println("parrotTrouble(false, 6) ==> false ; My result --> " + kata.parrotTrouble(false, 6));
        System.out.println("parrotTrouble(true, 21) ==> true ; My result --> " + kata.parrotTrouble(true, 21));
        System.out.println("parrotTrouble(false, 21) ==> false ; My result --> " + kata.parrotTrouble(false, 21) + "\n");

        System.out.println("parrotTrouble(false, 20) ==> false ; My result --> " + kata.parrotTrouble(false, 20));
        System.out.println("parrotTrouble(true, 23) ==> true ; My result --> " + kata.parrotTrouble(true, 23));
        System.out.println("parrotTrouble(false, 23) ==> false ; My result --> " + kata.parrotTrouble(false, 23));
        System.out.println("parrotTrouble(true, 20) ==> false ; My result --> " + kata.parrotTrouble(true, 20));
        System.out.println("parrotTrouble(false, 12) ==> false ; My result --> " + kata.parrotTrouble(false, 12));

        System.out.println("\n");

        // kata six - makes10 called and printed
        System.out.println("*** Exercise 6 - Makes 10 Method ***\n");
        System.out.println("makes10(9, 10) ==> true ; My result --> " + kata.makes10(9, 10));
        System.out.println("makes10(9, 9) ==> false ; My result --> " + kata.makes10(9, 9));
        System.out.println("makes10(1, 9) ==> true ; My result --> " + kata.makes10(1, 9));
        System.out.println("makes10(10, 1) ==> true ; My result --> " + kata.makes10(10, 1));
        System.out.println("makes10(10, 10) ==> true ; My result --> " + kata.makes10(10, 10) + "\n");

        System.out.println("makes10(8, 2) ==> true ; My result --> " + kata.makes10(8, 2));
        System.out.println("makes10(8, 3) ==> false ; My result --> " + kata.makes10(8, 3));
        System.out.println("makes10(10, 42) ==> true ; My result --> " + kata.makes10(10, 42));
        System.out.println("makes10(12, -2) ==> true ; My result --> " + kata.makes10(12, -2));

        System.out.println("\n");

        // kata seven - nearHundred called and printed
        System.out.println("*** Exercise 7 - Near Hundred Method ***\n");
        System.out.println("nearHundred(93) ==> true ; My result --> " + kata.nearHundred(93));
        System.out.println("nearHundred(90) ==> true ; My result --> " + kata.nearHundred(90));
        System.out.println("nearHundred(89) ==> false ; My result --> " + kata.nearHundred(89));
        System.out.println("nearHundred(110) ==> true ; My result --> " + kata.nearHundred(110));
        System.out.println("nearHundred(111) ==> false ; My result --> " + kata.nearHundred(111) + "\n");

        System.out.println("nearHundred(121) ==> false ; My result --> " + kata.nearHundred(121));
        System.out.println("nearHundred(0) ==> false ; My result --> " + kata.nearHundred(0));
        System.out.println("nearHundred(5) ==> false ; My result --> " + kata.nearHundred(5));
        System.out.println("nearHundred(191) ==> true ; My result --> " + kata.nearHundred(191));
        System.out.println("nearHundred(189) ==> false ; My result --> " + kata.nearHundred(189) + "\n");

        System.out.println("nearHundred(190) ==> true ; My result --> " + kata.nearHundred(190));
        System.out.println("nearHundred(200) ==> true ; My result --> " + kata.nearHundred(200));
        System.out.println("nearHundred(210) ==> true ; My result --> " + kata.nearHundred(210));
        System.out.println("nearHundred(211) ==> false ; My result --> " + kata.nearHundred(211));
        System.out.println("nearHundred(290) ==> false ; My result --> " + kata.nearHundred(290));

        System.out.println("\n");

        // kata eight - posNeg called and printed
        System.out.println("*** Exercise 8 - Pos Neg Method ***\n");
        System.out.println("posNeg(1, -1, false) ==> true ; My result --> " + kata.posNeg(1, -1, false));
        System.out.println("posNeg(-1, 1, false) ==> true ; My result --> " + kata.posNeg(-1, 1, false));
        System.out.println("posNeg(-4, -5, true) ==> true ; My result --> " + kata.posNeg(-4, -5, true));
        System.out.println("posNeg(-4, -5, false) ==> false ; My result --> " + kata.posNeg(-4, -5, false));
        System.out.println("posNeg(-4, 5, false) ==> true ; My result --> " + kata.posNeg(-4, 5, false) + "\n");

        System.out.println("posNeg(-4, 5, true) ==> false ; My result --> " + kata.posNeg(-4, 5, true));
        System.out.println("posNeg(1, 1, false) ==> false ; My result --> " + kata.posNeg(1, 1, false));
        System.out.println("posNeg(-1, -1, false) ==> false ; My result --> " + kata.posNeg(-1, -1, false));
        System.out.println("posNeg(1, -1, true) ==> false ; My result --> " + kata.posNeg(1, -1, true));
        System.out.println("posNeg(-1, 1, true) ==> false ; My result --> " + kata.posNeg(-1, 1, true) + "\n");

        System.out.println("posNeg(1, 1, true) ==> false ; My result --> " + kata.posNeg(1, 1, true));
        System.out.println("posNeg(-1, -1, true) ==> true ; My result --> " + kata.posNeg(-1, -1, true));
        System.out.println("posNeg(5, -5, false) ==> true ; My result --> " + kata.posNeg(5, -5, false));
        System.out.println("posNeg(-6, 6, false) ==> true ; My result --> " + kata.posNeg(-6, 6, false));
        System.out.println("posNeg(-5, -6, false) ==> false ; My result --> " + kata.posNeg(-5, -6, false) + "\n");

        System.out.println("posNeg(-2, -1, false) ==> false ; My result --> " + kata.posNeg(-2, -1, false));
        System.out.println("posNeg(1, 2, false) ==> false ; My result --> " + kata.posNeg(1, 2, false));
        System.out.println("posNeg(-5, 6, true) ==> false ; My result --> " + kata.posNeg(-5, 6, true));
        System.out.println("posNeg(-5, -5, true) ==> true ; My result --> " + kata.posNeg(-5, -5, true));

        System.out.println("\n");

        // kata nine - notString called and printed
        System.out.println("*** Exercise 9 - Not String Method ***\n");
        System.out.println("notString(\"candy\") ==> \"not candy\" ; My result --> \"" + kata.notString("candy") + "\"");
        System.out.println("notString(\"x\") ==> \"not x\" ; My result --> \"" + kata.notString("x") + "\"");
        System.out.println("notString(\"not bad\") ==> \"not bad\" ; My result --> \"" + kata.notString("not bad") + "\"");
        System.out.println("notString(\"bad\") ==> \"not bad\" ; My result --> \"" + kata.notString("bad") + "\"\n");
        System.out.println("notString(\"not\") ==> \"not\" ; My result --> \"" + kata.notString("not") + "\"");
        System.out.println("notString(\"is not\") ==> \"not is not\" ; My result --> \"" + kata.notString("is not") + "\"");
        System.out.println("notString(\"no\") ==> \"not no\" ; My result --> \"" + kata.notString("no") + "\"");

        System.out.println("\n");

        // kata ten - missingChar called and printed
        System.out.println("*** Exercise 10 - Missing Char Method ***\n");
        System.out.println("missingChar(\"kitten\", 1) ==> \"ktten\" ; My result --> \"" + kata.missingChar("kitten", 1) + "\"");






    }
}
