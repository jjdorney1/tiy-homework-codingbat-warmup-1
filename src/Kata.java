/**
 * Created by jeffreydorney on 8/8/16.
 */
public class Kata {

    //  determines if it's a vacation day or weekend to sleep in (true)
    public boolean sleepIn(boolean weekday, boolean vacation) {

        if((!weekday || vacation)) {
            return true;

        } else {
            return false;
        }
    }

    // if both monkeys are doing the same thing, then we are in trouble (true)
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if( (aSmile && bSmile) || (!aSmile && !bSmile) ) {
            return true;

        } else {
            return false;
        }
    }

    // returns the sum of two int values unless they are the same, if so it doubles the sum
    public int sumDouble(int a, int b) {

        if( a == b) {
            return (a + b) * 2;

        } else {
            return a + b;
        }

    }

    // difference of n and 21, if bigger than 21 than double it
    public int diff21(int n) {

        if( n > 21) {
            return (n - 21) * 2;

        } else {
            return (21 - n);
        }

    }

    // returns if there's trouble if the parrot is talking before 7 or after 20
    public boolean parrotTrouble(boolean talking, int hour) {
        if( !talking ) {
            return false;

        } else if( talking && (hour >= 7 && hour <= 20) ) {
            return false;

        } else {
            return true;
        }

    }

    // two int values if one or the sum is 10 then statement is true
    public boolean makes10(int a, int b) {
        if( a == 10 || b == 10 ) {
            return true;

        } else if( (a + b) == 10) {
            return true;

        } else {
            return false;
        }

    }

    // given n if it is within 10 of 100 or 200 then statement is true

    public boolean nearHundred(int n) {

        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
        /*if( (Math.abs( (200 - n <= 10) || (100 - n <= 10) ) {
            return true;
        } else {
            return false;
        }*/
    }

    // if one number of two is negative then true, or if both negative and negative is true then true

    public boolean posNeg(int a, int b, boolean negative) {

        if(negative) {
            return ( a < 0 && b < 0 );

        } else {
            return ( (a < 0 && b > 0) || (a > 0 && b < 0) );
        }
    }

    // will add "not" to the front of the String unless it's already there

    public String notString(String str) {

        if(str.contains("not ")) {
            return str;

        }else if(str.equals("not")) {
            return str;

        } else
            return "not " + str;


    }

    // removes a character at point n in the String str (or will just print the str if num is invalid)

    public String missingChar(String str, int n) {

        // checks to see if the word is longer than n as long as it is it will run
        if(str.length() >= n) {
            String front = str.substring(0, n);     // sets the front variable to the first letters stopping before n
            String back = str.substring(n + 1);     // sets the back variable to the letters starting at n + 1 and going to the end of the string

            return front + back;
        } else {

            // will simply return the str if n is longer than str since there's nothing to remove
            return str;
        }
    }

    public String frontBack(String str) {

        // checks the length to see if it's one character (0 or 1)
        if(str.length() <= 1) {
            return str;

        } else {

            // sets the middle of the string to a mid String
            String middle = str.substring(1, str.length()-1);

            // returns the last character then the middle then the first character
            return str.charAt(str.length()-1) + middle + str.charAt(0);
        }
    }

    // first three chars are repeated three times unless its less than 3 chars long

    public String front3(String str) {
        String firstThree;

        if( str.length() >= 3) {
            firstThree = str.substring(0, 3);

        } else {
            firstThree = str;
        }

        return firstThree + firstThree + firstThree;

    }

    // takes the last letter and adds it to the front and end of the string
    public String backAround(String str) {
        String lastLetter;

        lastLetter = str.substring(str.length()-1);
        return lastLetter + str + lastLetter;

    }

    // if its divisible by 3 or 5 with no remainder then it returns true

    public boolean or35(int n) {
        if(n % 5 == 0) {
            return true;
        } else if(n % 3 == 0) {
            return true;
        } else {
            return false;
        }

    }

    // takes the first two letters and displays them on the front and back of the string

    public String front22(String str) {
        String lastLetter;

        //lastLetter = str.substring(str.length()-1); - no longer needed
        //return lastLetter + str + lastLetter; - no longer needed

        if(str.length() >= 2) {
            lastLetter = str.substring(str.length()-1);
            return lastLetter + str + lastLetter;
        } else {
            return str + str + str;
        }
    }

    // returns true if the String starts with "hi"

    public boolean startHi(String str) {

        if(str.startsWith("hi")) {
            return true;
        } else {
            return false;
        }
    }

    // returns true if one temp is below zero and the other is above 100

    public boolean icyHot(int temp1, int temp2) {
        if( (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    // returns true if a or b is between 10 and 20 (inclusive)

    public boolean in1020(int a, int b) {
        if(a >= 10 && a <= 20) {
            return true;
        } else if(b >= 10 && b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // at least one of the variables needs to be between 13 and 19 (inclusive) to be true

    public boolean hasTeen(int a, int b, int c) {
        if(a >= 13 && a <= 19) {
            return true;
        } else if(b >= 13 && b <= 19) {
            return true;
        } else if(c >= 13 && c <= 19) {
            return true;
        } else {
            return false;
        }
    }

    //

    public boolean loneTeen(int a, int b) {
        //return !((a >= 13 && a <= 19) && (b >= 13 && b <= 19));
        boolean aTeen = (a >= 13) && (a <= 19);
        boolean bTeen = (b >= 13) && (b <= 19);

        /* code no longer needed but left in
        if((a >= 13) && (a <= 19)) {
          aTeen = true;
        } else {
          aTeen = false;
        }

        if((b >= 13) && (b <= 19)) {
          bTeen = true;
        } else {
          bTeen = false;
        }*/

        return (aTeen && !bTeen) || (!aTeen && bTeen);

    }

    //

    public String delDel(String str) {
        //String delRemovedEnd;
        //String firstLetter = str.charAt(0);

        if( (str.length()>=4) && (str.substring(1, 4).equals("del")) ) {
            return str.substring(0, 1) + str.substring(4);
            //return str.charAt(0) + delRemovedEnd;

        } else {
            return str;
        }

    }

    // return true if the first three letters start with #ix where # is any letter

    public boolean mixStart(String str) {

        if( (str.length() < 3)) return false;

        String twoLetters = str.substring(1, 3);

        return (twoLetters.equals("ix"));

        /*} else if( (str.substring(1, 3) == "ix") ) {
            return true;
        } else {
            return false;
        }*/
    }

    //

    public String startOz(String str) {
        String letters = "";

        // if the string is one letter it checks to see if it is also 'o'
        if( (str.length() >= 1) && (str.charAt(0) == 'o') ) {
            letters = letters + str.charAt(0);
        }

        //if the string is 2 letters long and the second letter is also a 'z'
        if( (str.length() >= 2) && (str.charAt(1) == 'z') ) {
            letters = letters + str.charAt(1);
        }

        return letters;
    }

    /* --- */

    public int intMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;

        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }

    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;

    }

    public int max1020(int a, int b) {

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;

        }

        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {

        return(a % 10 == b % 10);
    }

    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);

        return front + back.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String result = "";

        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }

        return result;
    }



    /*

    public String frontBack(String str) {
        String strFirst = str.charAt(0);
        String strMiddle = str.charAt(1, (str.length() - 1)
        String strLast = str.charAt(str.length());

        if(str.length() <= 1) {
            return str;

        } else if(str.length() == 2) {
            return str.substring(2) + str.substring(1);
        }

    }*/
}
