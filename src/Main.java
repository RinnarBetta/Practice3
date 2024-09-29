//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final double CONV_K=1.60934;
    public static void main(String[] args) {
        System.out.println("Converter App.");
        double F=7;
        double C=7;

        double Celsius = convFToCelsius(F);
        System.out.println("Resul is " + Celsius + "C");
        }
    private static double convFToCelsius(double F){ return ((F-32)*5/9);
    }
    }