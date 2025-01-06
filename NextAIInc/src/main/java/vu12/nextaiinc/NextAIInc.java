
package vu12.nextaiinc;
public class NextAIInc {

    // Method to calculate and print total weekly pay
    public void calculatePay(double basePay, int hoursWorked) {
        // Check for minimum base pay
        if (basePay < 30000) {
            System.out.println("Error: Base pay must be at least UGX 30,000/hour.");
            return;
        }

        // Check for maximum hours limit
        if (hoursWorked > 72) {
            System.out.println("Error: Hours worked must not exceed 72 hours per week.");
            return;
        }

        double totalPay;
        int regularHours = Math.min(hoursWorked, 48);
        int overtimeHours = Math.max(hoursWorked - 48, 0);

        // Calculate total pay
        totalPay = (regularHours * basePay) + (overtimeHours * basePay * 2);

        // Print total pay
        System.out.println("Total weekly pay: UGX " + totalPay);
    }
    public static void main(String[] args) {
        NextAIInc company = new NextAIInc();

        // Test case: Contractor A
        System.out.println("Contractor A:");
        company.calculatePay(30000, 51); // Expected Outcome: Total pay includes 48 regular hours and 3 overtime hours

        // Test case: Contractor B
        System.out.println("\nContractor B:");
        company.calculatePay(20000, 40); // Expected Outcome: Error message displayed due to base pay being below the minimum required rate

        // Test case: Contractor C
        System.out.println("\nContractor C:");
        company.calculatePay(35000, 96); // Expected Outcome: Error message displayed due to hours worked exceeding the 72-hour limit
    }
}
