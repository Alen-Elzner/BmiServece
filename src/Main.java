public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Bmi = service.calculate(61.5,1.75);
        System.out.println(Bmi);
    }
}
