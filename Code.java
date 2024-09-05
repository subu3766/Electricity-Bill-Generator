package subu;


import java.util.Scanner;

public class ElectricityBill {
    private String customerName;
    private double previousReading;
    private double currentReading;
    private double ratePerUnit;
    private double billAmount;

    
    public ElectricityBill(String customerName, double previousReading, double currentReading, double ratePerUnit) {
        this.customerName = customerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.ratePerUnit = ratePerUnit;
    }

    
    public void calculateBill() {
        double unitsConsumed = currentReading - previousReading;
        billAmount = unitsConsumed * ratePerUnit;
    }

    
    public void displayBill() {
        System.out.println("Electricity Bill for " + customerName);
      
        System.out.println("Previous Meter Reading: " + previousReading + " units");
        System.out.println("Current Meter Reading: " + currentReading + " units");
        System.out.println("Units Consumed: " + (currentReading - previousReading) + " units");
        System.out.println("Rate per Unit: Rs" + ratePerUnit);
        System.out.println("Total Bill Amount: Rs" + billAmount);
        
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter Previous Meter Reading (in units): ");
        double previousReading = sc.nextDouble();
        System.out.print("Enter Current Meter Reading (in units): ");
        double currentReading = sc.nextDouble();
        System.out.print("Enter Rate per Unit (Rs): ");
        double ratePerUnit = sc.nextDouble();

       
        ElectricityBill bill = new ElectricityBill(customerName, previousReading, currentReading, ratePerUnit);

        
        bill.calculateBill();
        bill.displayBill();

        sc.close();
    }
}
