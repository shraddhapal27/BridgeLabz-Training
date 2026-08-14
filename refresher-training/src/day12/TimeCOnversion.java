package day12;

public class TimeCOnversion {
    public static String timeConversion(String s) {
        // Write your code here
        String hour = s.substring(0,2);
        int h = Integer.parseInt(hour);
        String period = s.substring(8);

        if(period.equals("PM") && h != 12){
            h += 12;
        }
        if(period.equals("AM") && h == 12){
            h = 0;
        }
        String minutes = s.substring(3,5);
        String seconds = s.substring(6,8);

        return String.format("%02d:%s:%s", h,minutes,seconds);
    }

}
