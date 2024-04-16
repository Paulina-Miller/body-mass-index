public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // вес в килограммах
        double height = 1.87;  // рост в метрах

        int bmi = service.calculate(weight, height);

        System.out.printf("Ваш индекс массы тела (BMI) составляет %d\n", bmi);
        System.out.println("Интерпертация: ");
        System.out.println("BMI < 18.5: Недостаточный вес");
        System.out.println("18.5 <= BMI < 25: Нормальный вес");
        System.out.println("25 <= BMI < 30: Избыточный вес");
        System.out.println("BMI >= 30 : Ожирение");
    }
}
