/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package store;

/**
 *
 * @author Asus
 */
public class Store {
public static String[] productNames = {"tire", "tube", "chain", "metal"};
    public static double[] productPrices = {50.0, 45.0, 120.0, 80.0};
    public static int[] inventoryStocks = {20, 20, 20, 20};

    // Transaction Logs (Fixed size)
    public static String[] logProductNames = new String[100];
    public static int[] logQuantities = new int[100];
    public static double[] logCost = new double[100];

    // Counter to track number of transactions
    public static int transactionCount = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TransactionFrame tframe = new TransactionFrame();
        
        tframe.setVisible(true);
    
    }

}
