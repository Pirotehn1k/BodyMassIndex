public class Main {
public static void main (String[] args) {
   BmiService service = new BmiService();
   double kg=98;
   double meter=1.87;
   double bmi = service.calculate(meter,kg);
   System.out.println((int)bmi);

   }
}