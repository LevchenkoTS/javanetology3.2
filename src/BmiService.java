public class BmiService {
    public double calculate(double weight, double height){
        return weight / (Math.pow(height / 100, 2)) ;
    }

}
