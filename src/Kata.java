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

        if(str.length() >= n) {
            String front = str.substring(0, n);
            String back = str.substring(n + 1);

            return front + back;
        } else {
            return str;
        }
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
