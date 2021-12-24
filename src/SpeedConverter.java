public class SpeedConverter {
    public static long toMilesPerHour(double kilometresPerHours) {
        if (kilometresPerHours < 0) {
            return -1;
        }
        return Math.round(kilometresPerHours * 0.6215);

    }

    public static void printConversion( double kilometresPerHours
    ) {
        if (kilometresPerHours < 0 ) {
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometresPerHours);
            System.out.println(kilometresPerHours +" km/h = " + milesPerHour+ " mi/h");
        }


    }
}
