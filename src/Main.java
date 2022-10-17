public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 47;
        int height = 169;
        double imt = service.calculate(weight, height);
        System.out.println(imt);
    }
}