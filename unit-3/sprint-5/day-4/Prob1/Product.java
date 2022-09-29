package Prob1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Product implements Comparable<Product>{
    int productId;
    String productName;
    double productPrice;
    int sortChoice;
    public Product(int productId, String productName, double productPrice, int num){
        this.productId = productId;
        this.productName= productName;
        this.productPrice = productPrice;
        this.sortChoice = num;
    }
    @Override
    public int compareTo(Product s) {
        if(s.sortChoice==1) {
            if (this.productPrice > s.productPrice)
                return +1;
            else
                return -1;
        }else if(s.sortChoice==2){
            return this.productName.compareTo(s.productName);
        }else{
            return this.productId > s.productId ? +1: -1;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
//        Product product = new Product();
        TreeSet<Product> prd = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            System.out.println("Enter the details of Product" + (i + 1));
            System.out.println("Enter the Product Price :");
            double productPrice = sc.nextDouble();
            System.out.println("Enter the Product Name :");
            String productName = sc.next();
            System.out.println("Enter the product ID :");
            int productId= sc.nextInt();
            System.out.println("Enter the choice for sorting products :");
            int num = sc.nextInt();
            prd.add(new Product(productId, productName, productPrice, num));

            System.out.println("==========================================");
        }
        System.out.println("****************************************");
        System.out.println("Your Products are :");
        for(Product pr : prd){
            System.out.println(pr);
        }
    }
}