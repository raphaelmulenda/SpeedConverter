public class Main {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(25.42);
            System.out.println(miles);
        SpeedConverter.printConversion(95.75);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        BarkingDog.shouldWakeUP(true,25);
        LeapYear.isLeapYear(2000);
        DecimalComparator.areEqualByThreeDecimalPlaces(20.3547,20.35494);
        EqualSumChecker.hasEqualSum(1,2,3);

    }




}
