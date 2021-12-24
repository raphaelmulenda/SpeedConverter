public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int kiloBytesNum = 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int megabytes = kiloBytes / kiloBytesNum;
            int remainingKilobytes = kiloBytes % kiloBytesNum;
            System.out.println(kiloBytes+" KB"+ " = " + megabytes + " MB and " + remainingKilobytes + " KB" );

        }



        }

    }
