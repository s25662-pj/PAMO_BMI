package pjatk.pamo.bmi;

public class BmiUtils {

    public static double calculateBmi(double weightKg, double heightCm) {
        if (weightKg <= 0 || heightCm <= 0) {
            throw new IllegalArgumentException("Waga i wzrost muszą być większe od zera");
        }

        double heightMeters = heightCm / 100.0;
        return weightKg / (heightMeters * heightMeters);
    }

    public static String classifyBmi(double bmi) {
        if (bmi < 18.5) {
            return "Niedowaga";
        } else if (bmi < 25) {
            return "Optimum";
        } else if (bmi < 30) {
            return "Nadwaga";
        } else {
            return "Otyłość";
        }
    }
}
