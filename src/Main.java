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
        System.out.println("*** Exercise 1 - Sleep In Method ***");
        System.out.println("sleepIn(false, false) ==> true ; My result --> " + kata.sleepIn(false, false));
        System.out.println("sleepIn(true, false) ==> false ; My result --> " + kata.sleepIn(true, false));
        System.out.println("sleepIn(false, true) ==> true ; My result --> " + kata.sleepIn(false, true));
        System.out.println("sleepIn(true, true) ==> true ; My result --> " + kata.sleepIn(true, true));

        //prints a double line break
        System.out.println("\n");

        // kata two - monkeyTrouble called and printed
        System.out.println("*** Exercise 2 - Monkey Trouble Method ***");
        System.out.println("monkeyTrouble(true, true) ==> true ; My result --> " + kata.monkeyTrouble(true, true));
        System.out.println("monkeyTrouble(false, false) ==> true ; My result --> " + kata.monkeyTrouble(false, false));
        System.out.println("monkeyTrouble(true, false) ==> false ; My result --> " + kata.monkeyTrouble(true, false));
        System.out.println("monkeyTrouble(false, true) ==> false ; My result --> " + kata.monkeyTrouble(false, true));

        System.out.println("\n");

        // kata three - sumDouble called and printed
        System.out.println("*** Exercise 3 - Sum Double Method ***");
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
        System.out.println("*** Exercise 4 - Difference 21 Method ***");
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
        System.out.println("*** Exercise 5 - Parrot Trouble Method ***");
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
        System.out.println("*** Exercise 6 - Makes 10 Method ***");
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
        System.out.println("*** Exercise 7 - Near Hundred Method ***");
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
        System.out.println("*** Exercise 8 - Pos Neg Method ***");
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
        System.out.println("*** Exercise 9 - Not String Method ***");
        System.out.println("notString(\"candy\") ==> \"not candy\" ; My result --> \"" + kata.notString("candy") + "\"");
        System.out.println("notString(\"x\") ==> \"not x\" ; My result --> \"" + kata.notString("x") + "\"");
        System.out.println("notString(\"not bad\") ==> \"not bad\" ; My result --> \"" + kata.notString("not bad") + "\"");
        System.out.println("notString(\"bad\") ==> \"not bad\" ; My result --> \"" + kata.notString("bad") + "\"\n");
        System.out.println("notString(\"not\") ==> \"not\" ; My result --> \"" + kata.notString("not") + "\"");
        System.out.println("notString(\"is not\") ==> \"not is not\" ; My result --> \"" + kata.notString("is not") + "\"");
        System.out.println("notString(\"no\") ==> \"not no\" ; My result --> \"" + kata.notString("no") + "\"");

        System.out.println("\n");

        // kata ten - missingChar called and printed
        System.out.println("*** Exercise 10 - Missing Char Method ***");
        System.out.println("missingChar(\"kitten\", 1) ==> \"ktten\" ; My result --> \"" + kata.missingChar("kitten", 1) + "\"");
        System.out.println("missingChar(\"kitten\", 0) ==> \"itten\" ; My result --> \"" + kata.missingChar("kitten", 0) + "\"");
        System.out.println("missingChar(\"kitten\", 4) ==> \"kittn\" ; My result --> \"" + kata.missingChar("kitten", 4) + "\"");
        System.out.println("missingChar(\"Hi\", 0) ==> \"i\" ; My result --> \"" + kata.missingChar("Hi", 0) + "\"");
        System.out.println("missingChar(\"Hi\", 1) ==> \"H\" ; My result --> \"" + kata.missingChar("Hi", 1) + "\"\n");

        System.out.println("missingChar(\"code\", 0) ==> \"ode\" ; My result --> \"" + kata.missingChar("code", 0) + "\"");
        System.out.println("missingChar(\"code\", 1) ==> \"cde\" ; My result --> \"" + kata.missingChar("code", 1) + "\"");
        System.out.println("missingChar(\"code\", 2) ==> \"coe\" ; My result --> \"" + kata.missingChar("code", 2) + "\"");
        System.out.println("missingChar(\"code\", 3) ==> \"cod\" ; My result --> \"" + kata.missingChar("code", 3) + "\"");
        System.out.println("missingChar(\"chocolate\", 8) ==> \"chocolat\" ; My result --> \"" + kata.missingChar("chocolate", 8) + "\"");

        System.out.println("\n");

        // kata eleven - frontBack called and printed
        System.out.println("*** Exercise 11 - Front Back Method ***");
        System.out.println("frontBack(\"code\") ==> \"eodc\" ; My result --> \"" + kata.frontBack("code") + "\"");
        System.out.println("frontBack(\"a\") ==> \"a\" ; My result --> \"" + kata.frontBack("a") + "\"");
        System.out.println("frontBack(\"ab\") ==> \"ba\" ; My result --> \"" + kata.frontBack("ab") + "\"");
        System.out.println("frontBack(\"abc\") ==> \"cba\" ; My result --> \"" + kata.frontBack("abc") + "\"\n");

        System.out.println("frontBack(\"\") ==> \"\" ; My result --> \"" + kata.frontBack("") + "\"");
        System.out.println("frontBack(\"Chocolate\") ==> \"ehocolatC\" ; My result --> \"" + kata.frontBack("Chocolate") + "\"");
        System.out.println("frontBack(\"aavJ\") ==> \"Java\" ; My result --> \"" + kata.frontBack("aavJ") + "\"");
        System.out.println("frontBack(\"hello\") ==> \"oellh\" ; My result --> \"" + kata.frontBack("hello") + "\"");

        System.out.println("\n");

        // kata twelve - frontBack called and printed
        System.out.println("*** Exercise 12 - Front 3 Method ***");
        System.out.println("front3(\"Java\") ==> \"JavJavJav\" ; My result --> \"" + kata.front3("Java") + "\"");
        System.out.println("front3(\"Chocolate\") ==> \"ChoChoCho\" ; My result --> \"" + kata.front3("Chocolate") + "\"");
        System.out.println("front3(\"abc\") ==> \"abcabcabc\" ; My result --> \"" + kata.front3("abc") + "\"");
        System.out.println("front3(\"abcXYZ\") ==> \"abcabcabc\" ; My result --> \"" + kata.front3("abcXYZ") + "\"\n");

        System.out.println("front3(\"ab\") ==> \"ababab\" ; My result --> \"" + kata.front3("ab") + "\"");
        System.out.println("front3(\"a\") ==> \"aaa\" ; My result --> \"" + kata.front3("a") + "\"");
        System.out.println("front3(\"\") ==> \"\" ; My result --> \"" + kata.front3("") + "\"");

        System.out.println("\n");

        // kata thirteen - backAround called and printed
        System.out.println("*** Exercise 13 - Back Around Method ***");
        System.out.println("backAround(\"cat\") ==> \"tcatt\" ; My result --> \"" + kata.backAround("cat") + "\"");
        System.out.println("backAround(\"Hello\") ==> \"oHelloo\" ; My result --> \"" + kata.backAround("Hello") + "\"");
        System.out.println("backAround(\"a\") ==> \"aaa\" ; My result --> \"" + kata.backAround("a") + "\"");
        System.out.println("backAround(\"abc\") ==> \"cabcc\" ; My result --> \"" + kata.backAround("abc") + "\"");
        System.out.println("backAround(\"read\") ==> \"dreadd\" ; My result --> \"" + kata.backAround("read") + "\"");
        System.out.println("backAround(\"boo\") ==> \"obooo\" ; My result --> \"" + kata.backAround("boo") + "\"");

        System.out.println("\n");

        // kata fourteen - or35 called and printed
        System.out.println("*** Exercise 14 - Or 35 Method ***");
        System.out.println("or35(3) ==> true ; My result --> " + kata.or35(3));
        System.out.println("or35(10) ==> true ; My result --> " + kata.or35(10));
        System.out.println("or35(8) ==> false ; My result --> " + kata.or35(8));
        System.out.println("or35(15) ==> true ; My result --> " + kata.or35(15));
        System.out.println("or35(5) ==> true ; My result --> " + kata.or35(5) + "\n");

        System.out.println("or35(9) ==> true ; My result --> " + kata.or35(9));
        System.out.println("or35(4) ==> false ; My result --> " + kata.or35(4));
        System.out.println("or35(7) ==> false ; My result --> " + kata.or35(7));
        System.out.println("or35(6) ==> true ; My result --> " + kata.or35(6));
        System.out.println("or35(17) ==> false ; My result --> " + kata.or35(17) + "\n");

        System.out.println("or35(18) ==> true ; My result --> " + kata.or35(18));
        System.out.println("or35(29) ==> false ; My result --> " + kata.or35(29));
        System.out.println("or35(20) ==> true ; My result --> " + kata.or35(20));
        System.out.println("or35(21) ==> true ; My result --> " + kata.or35(21));
        System.out.println("or35(22) ==> false ; My result --> " + kata.or35(22) + "\n");

        System.out.println("or35(45) ==> true ; My result --> " + kata.or35(45));
        System.out.println("or35(99) ==> true ; My result --> " + kata.or35(99));
        System.out.println("or35(100) ==> true ; My result --> " + kata.or35(100));
        System.out.println("or35(101) ==> false ; My result --> " + kata.or35(101));
        System.out.println("or35(121) ==> false ; My result --> " + kata.or35(121) + "\n");

        System.out.println("or35(122) ==> false ; My result --> " + kata.or35(122));
        System.out.println("or35(123) ==> true ; My result --> " + kata.or35(123));

        System.out.println("\n");

        // kata fifteen - front22 called and printed
        System.out.println("*** Exercise 15 - Front 22 Method ***");
        System.out.println("front22(\"kitten\") ==> \"kikittenki\" ; My result --> \"" + kata.front22("kitten") + "\"");
        System.out.println("front22(\"Ha\") ==> \"HaHaHa\" ; My result --> \"" + kata.front22("Ha") + "\"");
        System.out.println("front22(\"abc\") ==> \"ababcab\" ; My result --> \"" + kata.front22("abc") + "\"");
        System.out.println("front22(\"ab\") ==> \"ababab\" ; My result --> \"" + kata.front22("ab") + "\"\n");

        System.out.println("front22(\"a\") ==> \"aaa\" ; My result --> \"" + kata.front22("a") + "\"");
        System.out.println("front22(\"\") ==> \"\" ; My result --> \"" + kata.front22("") + "\"");
        System.out.println("front22(\"Logic\") ==> \"LoLogicLo\" ; My result --> \"" + kata.front22("Logic") + "\"");

        System.out.println("\n");

        // kata sixteen - startHi called and printed
        System.out.println("*** Exercise 16 - Start Hi Method ***");
        System.out.println("startHi(\"hi there\") ==> true ; My result --> " + kata.startHi("hi there"));
        System.out.println("startHi(\"hi\") ==> true ; My result --> " + kata.startHi("hi"));
        System.out.println("startHi(\"hello hi\") ==> false ; My result --> " + kata.startHi("hello hi"));
        System.out.println("startHi(\"he\") ==> false ; My result --> " + kata.startHi("he") + "\n");

        System.out.println("startHi(\"h\") ==> false ; My result --> " + kata.startHi("h"));
        System.out.println("startHi(\"\") ==> false ; My result --> " + kata.startHi(""));
        System.out.println("startHi(\"ho hi\") ==> false ; My result --> " + kata.startHi("ho hi"));
        System.out.println("startHi(\"hi ho\") ==> true ; My result --> " + kata.startHi("hi ho"));

        System.out.println("\n");

        // kata seventeen - icyHot called and printed
        System.out.println("*** Exercise 17 - Icy Hot Method ***");
        System.out.println("icyHot(120, -1) ==> true ; My result --> " + kata.icyHot(120, -1));
        System.out.println("icyHot(-1, 120) ==> true ; My result --> " + kata.icyHot(-1, 120));
        System.out.println("icyHot(2, 120) ==> false ; My result --> " + kata.icyHot(2, 120));
        System.out.println("icyHot(-1, 100) ==> false ; My result --> " + kata.icyHot(-1, 100));
        System.out.println("icyHot(-2, -2) ==> false ; My result --> " + kata.icyHot(-2, -2));
        System.out.println("icyHot(120, 120) ==> false ; My result --> " + kata.icyHot(120, 120));

        System.out.println("\n");

        // kata eighteen - in1020 called and printed
        System.out.println("*** Exercise 18 - In 1020 Method ***");
        System.out.println("in1020(12, 99) ==> true ; My result --> " + kata.in1020(12, 99));
        System.out.println("in1020(21, 12) ==> true ; My result --> " + kata.in1020(21, 12));
        System.out.println("in1020(8, 99) ==> false ; My result --> " + kata.in1020(8, 99));
        System.out.println("in1020(99, 10) ==> true ; My result --> " + kata.in1020(99, 10) + "\n");

        System.out.println("in1020(20, 20) ==> true ; My result --> " + kata.in1020(20, 20));
        System.out.println("in1020(21, 21) ==> false ; My result --> " + kata.in1020(21, 21));
        System.out.println("in1020(9, 9) ==> false ; My result --> " + kata.in1020(9, 9));

        System.out.println("\n");

        // kata nineteen - hasTeen called and printed
        System.out.println("*** Exercise 19 - Has Teen Method ***");
        System.out.println("hasTeen(13, 20, 10) ==> true ; My result --> " + kata.hasTeen(13, 20, 21));
        System.out.println("hasTeen(20, 19, 10) ==> true ; My result --> " + kata.hasTeen(20, 19, 10));
        System.out.println("hasTeen(20, 10, 13) ==> true ; My result --> " + kata.hasTeen(20, 10, 13));
        System.out.println("hasTeen(1, 20, 12) ==> false ; My result --> " + kata.hasTeen(1, 20, 12) + "\n");

        System.out.println("hasTeen(19, 20, 12) ==> true ; My result --> " + kata.hasTeen(19, 20, 12));
        System.out.println("hasTeen(12, 20, 19) ==> true ; My result --> " + kata.hasTeen(12, 20, 19));
        System.out.println("hasTeen(12, 9, 20) ==> false ; My result --> " + kata.hasTeen(12, 9, 20));
        System.out.println("hasTeen(12, 18, 20) ==> true ; My result --> " + kata.hasTeen(12, 18, 20) + "\n");

        System.out.println("hasTeen(14, 2, 20) ==> true ; My result --> " + kata.hasTeen(14, 2, 20));
        System.out.println("hasTeen(4, 2, 20) ==> false ; My result --> " + kata.hasTeen(4, 2, 20));
        System.out.println("hasTeen(11, 22, 22) ==> false ; My result --> " + kata.hasTeen(11, 22, 22));

        System.out.println("\n");

        // kata twenty - loneTeen called and printed
        System.out.println("*** Exercise 20 - Lone Teen Method ***");
        System.out.println("loneTeen(13, 99) ==> true ; My result --> " + kata.loneTeen(13, 99));
        System.out.println("loneTeen(21, 19) ==> true ; My result --> " + kata.loneTeen(21, 19));
        System.out.println("loneTeen(13, 13) ==> false ; My result --> " + kata.loneTeen(13, 13));
        System.out.println("loneTeen(14, 20) ==> true ; My result --> " + kata.loneTeen(14, 20));
        System.out.println("loneTeen(20, 15) ==> true ; My result --> " + kata.loneTeen(20, 15) + "\n");

        System.out.println("loneTeen(16, 17) ==> false ; My result --> " + kata.loneTeen(16, 17));
        System.out.println("loneTeen(16, 9) ==> true ; My result --> " + kata.loneTeen(16, 9));
        System.out.println("loneTeen(16, 18) ==> false ; My result --> " + kata.loneTeen(16, 18));
        System.out.println("loneTeen(13, 19) ==> false ; My result --> " + kata.loneTeen(13, 19));
        System.out.println("loneTeen(13, 20) ==> true ; My result --> " + kata.loneTeen(13, 20) + "\n");

        System.out.println("loneTeen(6, 18) ==> true ; My result --> " + kata.loneTeen(6, 18));
        System.out.println("loneTeen(99, 13) ==> true ; My result --> " + kata.loneTeen(99, 13));
        System.out.println("loneTeen(99, 99) ==> false ; My result --> " + kata.loneTeen(99, 99));

        System.out.println("\n");

        // kata twenty-one - delDel called and printed
        System.out.println("*** Exercise 21 - Del Del Method ***");
        System.out.println("delDel(\"abelbc\") ==> \"abc\" ; My result --> \"" + kata.delDel("abelbc") + "\"");
        System.out.println("delDel(\"adelHello\") ==> \"aHello\" ; My result --> \"" + kata.delDel("adelHello") + "\"");
        System.out.println("delDel(\"adedbc\") ==> \"adedbc\" ; My result --> \"" + kata.delDel("adedbc") + "\"");
        System.out.println("delDel(\"abcdel\") ==> \"abcdel\" ; My result --> \"" + kata.delDel("abcdel") + "\"\n");

        System.out.println("delDel(\"add\") ==> \"add\" ; My result --> \"" + kata.delDel("add") + "\"");
        System.out.println("delDel(\"ad\") ==> \"ad\" ; My result --> \"" + kata.delDel("ad") + "\"");
        System.out.println("delDel(\"a\") ==> \"a\" ; My result --> \"" + kata.delDel("a") + "\"");
        System.out.println("delDel(\"\") ==> \"\" ; My result --> \"" + kata.delDel("") + "\"\n");

        System.out.println("delDel(\"del\") ==> \"del\" ; My result --> \"" + kata.delDel("del") + "\"");
        System.out.println("delDel(\"adel\") ==> \"a\" ; My result --> \"" + kata.delDel("adel") + "\"");
        System.out.println("delDel(\"aadelbb\") ==> \"aadelbb\" ; My result --> \"" + kata.delDel("aadelbb") + "\"");

        System.out.println("\n");

        // kata twenty-two - mixStart called and printed
        System.out.println("*** Exercise 22 - Mix Start Method ***");
        System.out.println("mixStart(\"mix snacks\") ==> true ; My result --> " + kata.mixStart("mix snacks"));
        System.out.println("mixStart(\"pix snacks\") ==> true ; My result --> " + kata.mixStart("pix snacks"));
        System.out.println("mixStart(\"piz snacks\") ==> false ; My result --> " + kata.mixStart("piz snacks"));
        System.out.println("mixStart(\"nix\") ==> true ; My result --> " + kata.mixStart("nix") + "\n");

        System.out.println("mixStart(\"ni\") ==> false ; My result --> " + kata.mixStart("ni"));
        System.out.println("mixStart(\"n\") ==> false ; My result --> " + kata.mixStart("n"));
        System.out.println("mixStart(\"\") ==> false ; My result --> " + kata.mixStart(""));

        System.out.println("\n");

        // kata twenty-three - startOz called and printed
        System.out.println("*** Exercise 23 - Start Oz Method ***");
        System.out.println("startOz(\"ozymandias\") ==> \"oz\" ; My result --> \"" + kata.startOz("ozymandias") + "\"");
        System.out.println("startOz(\"bzoo\") ==> \"z\" ; My result --> \"" + kata.startOz("bzoo") + "\"");
        System.out.println("startOz(\"oxx\") ==> \"o\" ; My result --> \"" + kata.startOz("oxx") + "\"");
        System.out.println("startOz(\"oz\") ==> \"oz\" ; My result --> \"" + kata.startOz("oz") + "\"\n");

        System.out.println("startOz(\"ounce\") ==> \"o\" ; My result --> \"" + kata.startOz("ounce") + "\"");
        System.out.println("startOz(\"abc\") ==> \"\" ; My result --> \"" + kata.startOz("abc") + "\"");
        System.out.println("startOz(\"\") ==> \"\" ; My result --> \"" + kata.startOz("") + "\"");
        System.out.println("startOz(\"zoo\") ==> \"\" ; My result --> \"" + kata.startOz("zoo") + "\"\n");

        System.out.println("startOz(\"aztec\") ==> \"z\" ; My result --> \"" + kata.startOz("aztec") + "\"");
        System.out.println("startOz(\"zzzz\") ==> \"z\" ; My result --> \"" + kata.startOz("zzzz") + "\"");
        System.out.println("startOz(\"oznic\") ==> \"oz\" ; My result --> \"" + kata.startOz("oznic") + "\"");

        System.out.println("\n");

        // kata twenty-four - intMax called and printed
        System.out.println("*** Exercise 24 - Int Max Method ***");
        System.out.println("intMax(1, 2, 3) ==> 3 ; My result --> " + kata.intMax(1, 2, 3));
        System.out.println("intMax(1, 3, 2) ==> 3 ; My result --> " + kata.intMax(1, 3, 2));
        System.out.println("intMax(3, 2, 1) ==> 3 ; My result --> " + kata.intMax(3, 2, 1));
        System.out.println("intMax(9, 3, 3) ==> 9 ; My result --> " + kata.intMax(9, 3, 3) + "\n");

        System.out.println("intMax(3, 9, 3) ==> 9 ; My result --> " + kata.intMax(3, 9, 3));
        System.out.println("intMax(3, 3, 9) ==> 9 ; My result --> " + kata.intMax(3, 3, 9));
        System.out.println("intMax(8, 2, 3) ==> 8 ; My result --> " + kata.intMax(8, 2, 3));
        System.out.println("intMax(-3, -1, -2) ==> -1 ; My result --> " + kata.intMax(-3, -1, -2) + "\n");

        System.out.println("intMax(6, 2, 5) ==> 6 ; My result --> " + kata.intMax(6, 2, 5));
        System.out.println("intMax(5, 6, 2) ==> 6 ; My result --> " + kata.intMax(5, 6, 2));
        System.out.println("intMax(5, 2, 6) ==> 6 ; My result --> " + kata.intMax(5, 2, 6));

        System.out.println("\n");

        // kata twenty-five - close10 called and printed
        System.out.println("*** Exercise 25 - Close 10 Method ***");
        System.out.println("close10(8, 13) ==> 8 ; My result --> " + kata.close10(8, 13));
        System.out.println("close10(13, 8) ==> 8 ; My result --> " + kata.close10(13, 8));
        System.out.println("close10(13, 7) ==> 0 ; My result --> " + kata.close10(13, 7));
        System.out.println("close10(7, 13) ==> 0 ; My result --> " + kata.close10(7, 13) + "\n");

        System.out.println("close10(9, 13) ==> 9 ; My result --> " + kata.close10(9, 13));
        System.out.println("close10(13, 8) ==> 8 ; My result --> " + kata.close10(13, 8));
        System.out.println("close10(10, 12) ==> 10 ; My result --> " + kata.close10(10, 12));
        System.out.println("close10(11, 10) ==> 10 ; My result --> " + kata.close10(11, 10) + "\n");

        System.out.println("close10(5, 21) ==> 5 ; My result --> " + kata.close10(5, 21));
        System.out.println("close10(0, 20) ==> 0 ; My result --> " + kata.close10(0, 20));
        System.out.println("close10(10, 10) ==> 0 ; My result --> " + kata.close10(10, 10));

        System.out.println("\n");

        // kata twenty-six - in3050 called and printed
        System.out.println("*** Exercise 26 - In 3050 Method ***");
        System.out.println("in3050(30, 31) ==> true ; My result --> " + kata.in3050(30, 31));
        System.out.println("in3050(30, 41) ==> false ; My result --> " + kata.in3050(30, 41));
        System.out.println("in3050(40, 50) ==> true ; My result --> " + kata.in3050(40, 50));
        System.out.println("in3050(40, 51) ==> false ; My result --> " + kata.in3050(40, 51) + "\n");

        System.out.println("in3050(39, 50) ==> false ; My result --> " + kata.in3050(39, 50));
        System.out.println("in3050(50, 39) ==> false ; My result --> " + kata.in3050(50, 39));
        System.out.println("in3050(40, 39) ==> true ; My result --> " + kata.in3050(40, 39));
        System.out.println("in3050(49, 48) ==> true ; My result --> " + kata.in3050(49, 48) + "\n");

        System.out.println("in3050(50, 40) ==> true ; My result --> " + kata.in3050(50, 40));
        System.out.println("in3050(50, 51) ==> false ; My result --> " + kata.in3050(50, 51));
        System.out.println("in3050(35, 36) ==> true ; My result --> " + kata.in3050(35, 36));
        System.out.println("in3050(35, 45) ==> false ; My result --> " + kata.in3050(35, 45));

        System.out.println("\n");

        // kata twenty-seven - max1020 called and printed
        System.out.println("*** Exercise 27 - Max 1020 Method ***");
        System.out.println("max1020(11, 19) ==> 19 ; My result --> " + kata.max1020(11, 19));
        System.out.println("max1020(19, 11) ==> 19 ; My result --> " + kata.max1020(19, 11));
        System.out.println("max1020(11, 9) ==> 11 ; My result --> " + kata.max1020(11, 9));
        System.out.println("max1020(9, 21) ==> 0 ; My result --> " + kata.max1020(9, 21) + "\n");

        System.out.println("max1020(10, 21) ==> 10 ; My result --> " + kata.max1020(10, 21));
        System.out.println("max1020(21, 10) ==> 10 ; My result --> " + kata.max1020(21, 10));
        System.out.println("max1020(9, 11) ==> 11 ; My result --> " + kata.max1020(9, 11));
        System.out.println("max1020(23, 10) ==> 10 ; My result --> " + kata.max1020(23, 10) + "\n");

        System.out.println("max1020(20, 10) ==> 20 ; My result --> " + kata.max1020(20, 10));
        System.out.println("max1020(7, 20) ==> 20 ; My result --> " + kata.max1020(7, 20));
        System.out.println("max1020(17, 16) ==> 17 ; My result --> " + kata.max1020(17, 16));

        System.out.println("\n");

        // kata twenty-eight - stringE called and printed
        System.out.println("*** Exercise 28 - String E Method ***");
        System.out.println("stringE(\"Hello\") ==> true ; My result --> " + kata.stringE("Hello"));
        System.out.println("stringE(\"Heelle\") ==> true ; My result --> " + kata.stringE("Heelle"));
        System.out.println("stringE(\"Heelele\") ==> false ; My result --> " + kata.stringE("Heelele") + "\n");

        System.out.println("stringE(\"HII\") ==> false ; My result --> " + kata.stringE("HII"));
        System.out.println("stringE(\"e\") ==> true ; My result --> " + kata.stringE("e"));
        System.out.println("stringE(\"\") ==> false ; My result --> " + kata.stringE(""));

        System.out.println("\n");

        // kata twenty-nine - lastDigit called and printed
        System.out.println("*** Exercise 29 - Last Digit Method ***");
        System.out.println("lastDigit(7, 17) ==> true ; My result --> " + kata.lastDigit(7, 17));
        System.out.println("lastDigit(6, 17) ==> false ; My result --> " + kata.lastDigit(6, 17));
        System.out.println("lastDigit(3, 113) ==> true ; My result --> " + kata.lastDigit(3, 113));
        System.out.println("lastDigit(114, 113) ==> false ; My result --> " + kata.lastDigit(114, 113) + "\n");

        System.out.println("lastDigit(114, 4) ==> true ; My result --> " + kata.lastDigit(114, 4));
        System.out.println("lastDigit(10, 0) ==> true ; My result --> " + kata.lastDigit(10, 0));
        System.out.println("lastDigit(11, 0) ==> false ; My result --> " + kata.lastDigit(11, 0));

        System.out.println("\n");

        // kata thirty - endUp called and printed
        System.out.println("*** Exercise 30 - End Up Method ***");
        System.out.println("endUp(\"Hello\") ==> \"HeLLO\" ; My result --> \"" + kata.endUp("Hello") + "\"");
        System.out.println("endUp(\"hi there\") ==> \"hi thERE\" ; My result --> \"" + kata.endUp("hi there") + "\"");
        System.out.println("endUp(\"hi\") ==> \"HI\" ; My result --> \"" + kata.endUp("HI") + "\"");
        System.out.println("endUp(\"woo hoo\") ==> \"woo HOO\" ; My result --> \"" + kata.endUp("woo hoo") + "\"\n");

        System.out.println("endUp(\"xyz12\") ==> \"xyZ12\" ; My result --> \"" + kata.endUp("xyz12") + "\"");
        System.out.println("endUp(\"x\") ==> \"X\" ; My result --> \"" + kata.endUp("x") + "\"");
        System.out.println("endUp(\"\") ==> \"\" ; My result --> \"" + kata.endUp("") + "\"");

        System.out.println("\n");

        // kata thirty-one - everyNth called and printed
        System.out.println("*** Exercise 31 - Every Nth Method ***");
        System.out.println("everyNth(\"Miracle\", 2) ==> \"Mrce\" ; My result --> \"" + kata.everyNth("Miracle", 2) + "\"");
        System.out.println("everyNth(\"abcdefg\", 2) ==> \"aceg\" ; My result --> \"" + kata.everyNth("abcdefg", 2) + "\"");
        System.out.println("everyNth(\"abcdefg\", 3) ==> \"adg\" ; My result --> \"" + kata.everyNth("abcdefg", 3) + "\"");
        System.out.println("everyNth(\"Chocolate\", 3) ==> \"Cca\" ; My result --> \"" + kata.everyNth("Chocolate", 3) + "\"\n");

        System.out.println("everyNth(\"Chocolates\", 3) ==> \"Ccas\" ; My result --> \"" + kata.everyNth("Chocolates", 3) + "\"");
        System.out.println("everyNth(\"Chocolates\", 4) ==> \"Coe\" ; My result --> \"" + kata.everyNth("Chocolates", 4) + "\"");
        System.out.println("everyNth(\"Chocolates\", 100) ==> \"C\" ; My result --> \"" + kata.everyNth("Cocolates", 100) + "\"");









    }
}
