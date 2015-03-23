import java.lang.Math;

/*
 * AP CS MOOC
 * Term 2 - Assignment 2: Time
 * A class which represents the time of day in hours and seconds.
 */

public class Time implements Comparable {
    private int hour;
    private int minute;

    /* Complete required constructors and methods here */

    /*
    *Default constructor that sets time to 1200.
    */
    public Time() {
        this(12, 0);
    }

    /*
    * If h is between 1 and 23 inclusive, set the hour to h.
    * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive,
    * set the minutes to m. Otherwise, set the minutes to 0.
    */
    public Time(int h, int m) {
        if (h >= 1 && h <= 23) {
            hour = h;
        } else {
            hour = 0;
        }

        if (m >= 0 && m <= 59) {
            minute = m;
        } else {
            minute = 0;
        }
    }

    /* Returns the time as a String of length 4 in the format: 0819.
    * Notice that if the hour or minute is one digit, it should
    * print a zero first. For example, 6 should print as 06.
    */
    public String toString() {
        String time;
        time = "";
        if (hour < 10) {
            time += "0" + hour;
        } else {
            time += hour;
        }

        if (minute < 10) {
            time += "0" + minute;
        } else {
            time += minute;
        }
        return time;
    }

    /*
    * Returns the time as a String converted from military time
    * to standard time. For example, 0545 becomes 5:45 am and
    * 1306 becomes 1:06 pm.
    */
    public String convert() {
        String standardTime;
        standardTime = "";

        if (hour == 0) {
            standardTime += "12:" + this.toString().substring(2) + " am";
        } else if (hour == 12) {
            standardTime += "12:" + this.toString().substring(2) + " pm";
        } else if ((hour * 100) + minute <= 1259) {
            standardTime += this.toString().substring(0, 2) + ":" + this.toString().substring(2) + " am";
            if (standardTime.charAt(0) == '0') {
                standardTime = standardTime.substring(1);
            }
        } else {
            hour -= 12;
            standardTime = this.toString().substring(0, 2) + ":" + this.toString().substring(2) + " pm";
            hour += 12;
            if (standardTime.charAt(0) == '0') {
                standardTime = standardTime.substring(1);
            }
        }

        return standardTime;
    }

    public String diffConvert() {
        String diffTime;
        diffTime = "";

        diffTime += this.toString().substring(0, 2) + ":" + this.toString().substring(2);
        return diffTime;
    }

    /*
    * Advances the time by one minute.
    * Remember that 60 minutes = 1 hour.
    * Therefore, if your time was 0359, and you add one minute,
    * it becomes 0400. 2359 should increment to 0000.
    */
    public void increment() {
        if (hour == 23 && minute == 59) {
            hour = 0;
            minute = 0;
        } else if (minute == 59) {
            hour += 1;
            minute = 0;
        } else {
            minute += 1;
        }
    }

    public int compareTo(Object other) {
        Time otherTime = (Time) other;
        if (otherTime.hour == hour) {
            if (otherTime.minute == minute) {
                return 0;
            } else if (otherTime.minute > minute) {
                return -1;
            } else {
                return 1;
            }
        } else if (otherTime.hour > hour) {
            return -1;
        } else {
            return 1;
        }
    }

    public String difference(Time t) {
        Time diffTime = new Time(Math.abs(hour - t.hour), Math.abs(minute - t.minute));
        return diffTime.diffConvert();
    }
}
