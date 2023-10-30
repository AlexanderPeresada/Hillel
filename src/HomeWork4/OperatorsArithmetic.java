package HomeWork4;

public class OperatorsArithmetic {
    static int productNumber;
    static String productType;
    static int numOfDays;
    static double price;
    static int countOfSales;
    static double sumOfSalesPerDay;
    static double avgDailySales;
    static String CURRENCY = "EUR";

    public static void main(String[] args) {

        productNumber = 1;
        productType = "smartphone";
        numOfDays = 5;
        countOfSales = 1;
        price = 12153.41;

        sumOfSalesPerDay = price * countOfSales;
        avgDailySales = sumOfSalesPerDay / numOfDays;

        System.out.printf("Product No " + productNumber + ": " + productType + "%n"
                + "total sales for " + numOfDays + " days is " + CURRENCY + " %.2f %nsales by day is %s %.2f", sumOfSalesPerDay, CURRENCY, avgDailySales);

        productNumber++;
        productType = "laptop";
        numOfDays = 7;
        countOfSales = 1;
        price = 10486.85;

        sumOfSalesPerDay = price * countOfSales;
        avgDailySales = sumOfSalesPerDay / numOfDays;

        System.out.printf("%nProduct No " + productNumber + ": " + productType + "%n"
                + "total sales for " + numOfDays + " days is " + CURRENCY + " %.2f %nsales by day is %s %.2f", sumOfSalesPerDay, CURRENCY, avgDailySales);

    }
}
