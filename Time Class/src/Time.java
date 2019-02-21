public class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = getHour();
        this.minute = getMinute();
        this.second = getSecond();
    }

    public String toString(){
        String dHour = "";
        if (hour < 10){
            dHour = "0" + String.valueOf(hour);
        }
        else{
            dHour = String.valueOf(hour);
        }
        String dMinute = "";
        if (minute < 10){
            dMinute = "0" + String.valueOf(minute);
        }
        else{
            dMinute = String.valueOf(minute);
        }
        String dSecond = "";
        if (second < 10){
            dSecond = "0" + String.valueOf(second);
        }
        else{
            dSecond = String.valueOf(second);
        }
        if(hour >= 24) {
            dHour = "0" + 0;
        }
        if(minute >= 60){
            dMinute = "0" + 0;
        }
        if(second >= 60){
            dSecond = "0" + 0;
        }
        return dHour +":"+dMinute +":"+dSecond;
    }

    public void nextSecond(){
        second += 1;
    }

    public void previousSecond(){
        second -= 1;
    }


    



}
