package ucf.assignments;

public class Ex5Ops {
    public static String add(double f_numVal, double s_numVal) {
        return String.valueOf(f_numVal + s_numVal);
    }

    public static String subtract(double f_numVal, double s_numVal) {
        return String.valueOf(f_numVal - s_numVal);
    }

    public static String multiply(double f_numVal, double s_numVal) {
        return String.valueOf(f_numVal * s_numVal);
    }

    public static String divide(double f_numVal, double s_numVal) {
        if(s_numVal != 0){
            return String.valueOf(f_numVal / s_numVal);
        }
        return "Error";
    }
}