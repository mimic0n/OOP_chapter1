public class Date {
    private int day;
    private int month;
    private int year ;
    public Date ( int day , int month , int year ){
        this.day = day ;
        this.month = month ;
        this.year = year ;
        }
    public int getDay() {
        return day ;
    }
    public void setDay(int day) {
        if (day >= 1 && day <= 31){
            this.day = day;
        }
        else System.out.println("Invalid day");
    }
    public int getMonth() {
        return month ;
    }
    public void setMonth(int month) {
        if (month >= 1 && month <= 12){
            this.month = month;
        }
        else System.out.println("Invalid month");
    }
    public int getYear() {
        return year ;
    }
    public void setYear(int year) {
        if (year >= 1900 && year <= 9999){
            this.year = year;
        }
        else System.out.println("Invalid year");
    }
    public void setDate(int day , int month , int year){
       String formatteDay = String.format("%02d", day);
       String formatteMonth = String.format("%02d", month);
        System.out.printf(formatteDay,formatteMonth,year);
    }
    public String toString(){
      return String.format("%02d:%02d:%02d", day, month, year) ;
    }



    }

