public class BarkingDog {
    public static boolean shouldIWakeUP(boolean barking, int hourOfDay) {
        if (hourOfDay >=0 && hourOfDay <24)
        {
            return barking && (hourOfDay < 8 || hourOfDay > 22);
        }
        return false;

    }

    public static void shouldWakeUP(boolean barking, int hourOfDay) {
        String results = String.valueOf(shouldIWakeUP(barking,hourOfDay));
        System.out.println(results);

    }
}
