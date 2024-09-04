public class BmiService {

    public int calculate(int weightKg, double heightM) {
        double bmi = weightKg / (heightM * heightM);
        return (int) bmi;
    }
}