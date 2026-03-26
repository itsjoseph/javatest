public class DateMinima {

    // constructor sin parametros
    public DateMinima() {
        month = 1;
        day = 1;
        year = 2000;
    }

    // constructor con parametros
    public DateMinima(int themonth, int theday, int theyear) {
        month = themonth;
        day = theday;
        year = theyear;
    }

    // devuelve true si los valores son iguales
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DateMinima)) {
            return false;
        }
        DateMinima dateminima = (DateMinima) obj;
        return dateminima.month == month && dateminima.day == day && dateminima.year == year;
    }

    public String toString(){
        return month + "/" + day + "/" + year;
    }

    // campos
    private int month;
    private int day;
    private int year;

}
