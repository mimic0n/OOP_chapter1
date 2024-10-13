public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        }
        else {
            System.out.println("Invalid hour");
        }
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if (minute <= 59 && minute >= 0) {
            this.minute = minute;
        }
        else {
            System.out.println("Invalid minute");
        }
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
        else {
            System.out.println("Invalid second");
        }
    }
    public void setTime(int hour, int minute, int second) {
        String formatteHour = String.format("%02d", hour);
        String formatteMinute = String.format("%02d", minute);
        String formatteSecond = String.format("%02d", second);
        System.out.printf(formatteHour, formatteMinute,formatteSecond);
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour");
        }
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute");
        }
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Invalid second");
        }
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }


    }
