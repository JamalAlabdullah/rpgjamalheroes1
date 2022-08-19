public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int hoursPadded = 0;
        int minutesPadded = 0;
        int secondsPadded = 0;
        int secondsRemaining;
        if (seconds <= 359999) {
            if (seconds < 60) {
                secondsPadded = seconds;
            } else {
                secondsRemaining = seconds / 60;
                if (secondsRemaining < 60) {
                    minutesPadded = secondsRemaining;
                    secondsPadded = seconds - (secondsRemaining * 60);
                } else {
                    secondsPadded = seconds - (secondsRemaining * 60);
                    minutesPadded = secondsRemaining % 60;
                    secondsRemaining = secondsRemaining / 60;
                    hoursPadded = secondsRemaining;
                }
            }
            String hoursString = String.valueOf(hoursPadded).length() == 2 ? String.valueOf(hoursPadded) : "0" + String.valueOf(hoursPadded);
            String minutesString = String.valueOf(minutesPadded).length() == 2 ? String.valueOf(minutesPadded) : "0" + String.valueOf(minutesPadded);
            String secondsString = String.valueOf(secondsPadded).length() == 2 ? String.valueOf(secondsPadded) : "0" + String.valueOf(secondsPadded);
            return hoursString + ":" + minutesString + ":" + secondsString;

        }

        return "Maximum time exceeded.";
    }
}
