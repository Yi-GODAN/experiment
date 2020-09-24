package setup6;

public class TestDateSort {
    public static void main(String args[]) {
        Date[] days = new Date[5];
        days[0] = new Date(2020, 5, 9);
        days[1] = new Date(2020, 4, 6);
        days[2] = new Date(2020, 5, 8);
        days[3] = new Date(1997, 10, 1);
        days[4] = new Date(1997, 9, 1);

//        bubbleSort(days);
        selectSort(days);

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }

    public static Date[] bubbleSort(Date[] date) {
        Date temp;
        int len = date.length;
        for (int i = len - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if ((date[j].compare(date[j + 1])) > 0) {
                    temp = date[j];
                    date[j] = date[j + 1];
                    date[j + 1] = temp;
                }
            }
        }
        return date;
    }

    public static Date[] selectSort(Date[] dates) {
        int k;
        Date date;
        for (int i = 0; i < dates.length; i++) {
            k = i;
            for (int j = k + 1; j < dates.length; j++) {
                if (dates[k].compare(dates[j]) > 0)
                    k = j;
            }
            if (k != i) {
                date = dates[i];
                dates[i] = dates[k];
                dates[k] = date;
            }
        }
        return dates;
    }
}

class Date {
    int year, month, day;

    Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public int compare(Date date) {
        return year > date.year ? 1
                : year < date.year ? -1
                : month > date.month ? 1
                : month < date.month ? -1
                : day > date.day ? 1
                : day < date.day ? -1 : 0;
    }

    public String toString() {
        return "Year:Month:Day -- " + year + "-" + month + "-" + day;
    }

}
