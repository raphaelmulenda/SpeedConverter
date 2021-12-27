public class TeenNumberChecker {
    public static boolean hasTeen(int numOne, int numTwo, int numThree) {
        return  (  (12 < numOne && numOne <20) || (12 < numTwo && numTwo <20) || (12 < numThree && numThree <20) );


    }

    public static boolean isTeen(int numOne) {
        return    (12 < numOne && numOne <20);

    }
}
