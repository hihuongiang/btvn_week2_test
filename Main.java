import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int job = sc.nextInt();
        double income = sc.nextDouble();
        int region = sc.nextInt();

        String group = classifyCustomer(age, job, income, region);
        System.out.println(group);
        sc.close();
    }

    public static String classifyCustomer(int age, int job, double income, int region) {
        if (age >= 18 && age <= 35 && job == 1 && income >= 500 && region == 1) return "A";
        if (age < 18 || job == 0 || (job == 2 && income < 500)) return "B";
        if (age >= 36 && age <= 60 && income >= 300) return "C";
        if (age >= 61) return "D";
        return "Không xác định";
    }
}
