public class Main {
    public static void main(String[] args) {
        int weightKg = 75;
        double heightM = 1.85;
        BmiService service = new BmiService();
        int bmi = service.calculate(weightKg, heightM);
        System.out.println("Индекс массы тела при заданных параметрах: Рост " + heightM +" метра, " + "Вес " + weightKg + " кг " + "- равен " + bmi);
    }
}