public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
       return ((int)(numOne * 1000) == (int) (numTwo * 1000));


    }
}
