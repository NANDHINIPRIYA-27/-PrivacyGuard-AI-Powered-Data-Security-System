import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== PrivacyGuard Security Check ===");

        System.out.print("Enter Application Name: ");
        String app = sc.nextLine();

        System.out.print("Enter number of permissions: ");
        int total = sc.nextInt();
        sc.nextLine();

        int riskScore = 0;

        System.out.println("\nEnter permissions:");

        for (int i = 1; i <= total; i++) {

            System.out.print("Permission " + i + ": ");
            String permission = sc.nextLine().toLowerCase();

            switch (permission) {

                case "camera":
                    System.out.println("Camera usage detected - High Risk");
                    riskScore += 4;
                    break;

                case "microphone":
                    System.out.println("Microphone usage detected - High Risk");
                    riskScore += 4;
                    break;

                case "location":
                    System.out.println("Location tracking detected - Medium Risk");
                    riskScore += 2;
                    break;

                default:
                    System.out.println(permission + " considered low risk");
                    riskScore += 1;
            }
        }

        System.out.println("\nFinal Risk Score: " + riskScore);

        if (riskScore >= 7) {
            System.out.println("Warning: This application may misuse your data.");
        } else {
            System.out.println("This application appears relatively safe.");
        }

        sc.close();
    }
}
