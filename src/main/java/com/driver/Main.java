package com.driver;

public class Main {
    class Product {
        public int product(int x, int y) {
            return 0;
        }

        public int product(int x, int y, int z) {
            return 0;
        }

        public double product(double x, double y) {
            return 0.0;
        }
    }

    public static void main(String[] args){
        Product p = new Product();
        p.product(10,20);
        p.product(10,20,30);
        p.product(9.9,9.9);

    }

}