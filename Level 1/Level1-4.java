
//4
//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 



class Main {
    public static void main(String[] args) {
        int costPrice=129;
        int sellingPrice = 191;
        int profit = sellingPrice-costPrice;
        float profitPercent = (float)profit/(float)costPrice*100;
        System.out.println("The Cost Price is INR " + costPrice + " and  Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
        
    }
}