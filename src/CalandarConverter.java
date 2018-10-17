public class CalandarConverter {
    public final static int PONIEDZIALEK = 1;
    public final static int WTOREK = 2;
    public final static int SRODA = 3;
    public final static int CZWARTEK = 4;
    public final static int PIATEK = 5;
    public final static int SOBOTA = 6;
    public final static int NIEDZIELA = 7;

    public static String convertDayToString(int day) {
        String dayOfWeek = null;
        switch (day) {
            case PONIEDZIALEK:
                dayOfWeek = "Poniedziałek";
                break;
            case WTOREK:
                dayOfWeek = "Wtorek";
                break;
            case SRODA:
                dayOfWeek = "Środa";
                break;
            case CZWARTEK:
                dayOfWeek = "Czwartek";
                break;
            case PIATEK:
                dayOfWeek = "Piątek";
                break;
            case SOBOTA:
                dayOfWeek = "Sobota";
                break;
            case NIEDZIELA:
                dayOfWeek = "Niedziela";
                break;
            default:
                dayOfWeek = "Undefined";
        }
        return dayOfWeek;
    }
}