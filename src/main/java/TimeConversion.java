public class TimeConversion {

    public static void main(String[] args) {
        Result.timeConversion("12:40:22AM");
    }
}

class Result {

    public static void timeConversion(String date) {
        var time = date.substring(0, (date.length() - 2));
        var timeType = date.substring(date.length() - 2);
        var hour = 0;
        String stringHour;
        var newDate = time;

        if (timeType.equals("PM") || time.startsWith("12")) {
            hour = Integer.parseInt(time.substring(0, 2));
            stringHour = String.valueOf(hour + 12);

            if (stringHour.equals("24")) {
                if (timeType.equals("AM")) {
                    stringHour = "00";
                } else {
                    stringHour = "12";
                }
            }

            newDate = stringHour + ":" + time.substring(3);
        }

        System.out.println(newDate);
    }

}