public class BmiService {
    public int calculate(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            System.out.println("Bес и рост должны быть положительными значениями.");
            return 0;
        }
        double bmi = weight / (height * height);
        return (int) bmi;
    }
}
