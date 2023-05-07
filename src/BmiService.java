public class BmiService {
    public double calculate(double meter, double kg ){
        double bmi=kg/ (meter * meter);
        return bmi;
    }

}
