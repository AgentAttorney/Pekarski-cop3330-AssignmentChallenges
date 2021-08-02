package ucf.assignments;

public class Ex7Ops {
    public static String multiply(double dim1Val, double dim2Val) {
        return String.valueOf(dim1Val * dim2Val);
    }

    public static String convert(String final_answer, String unitsValue) {
        double conv_constant = 0.09290304;
        if(unitsValue.contains("meter")){ // final answer was in meters
            return String.valueOf(Double.parseDouble(final_answer) / conv_constant);
        }
        else{ // Answer was in feet
            return String.valueOf(Double.parseDouble(final_answer) * conv_constant);
        }
    }
}
