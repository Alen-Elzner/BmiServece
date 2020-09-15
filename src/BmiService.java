public class BmiService {
   public double calculate(double weight, double growth){
       double Bmi =  weight / (growth * growth);
       return Bmi;
   }
}
