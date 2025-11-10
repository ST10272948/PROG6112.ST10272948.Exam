/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog1b.question.pkg1;

/**
 *
 * @author Lant3
 */
public class PROG1BQuestion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sales data: rows = quarters (Q1..Q3 provided), columns = years (Year 1, Year 2)
        int[][] sales = {
            {300, 250}, // Q1: Y1=300, Y2=250
            {150, 200}, // Q2: Y1=150, Y2=200
            {700, 600}  // Q3: Y1=700, Y2=600
        };

        IProductSales calculator = new ProductSales();

        int total = calculator.TotalSales(sales);
        double average = calculator.AverageSales(sales);
        int max = calculator.MaxSale(sales);
        int min = calculator.MinSale(sales);

        System.out.println("Product Sales Report (Two-Year Period)");
        System.out.println("--------------------------------------");
        System.out.println("Total sales:   " + total);
        System.out.printf("Average sales: %.2f%n", average);
        System.out.println("Maximum sales: " + max);
        System.out.println("Minimum sales: " + min);
    }
    
}
