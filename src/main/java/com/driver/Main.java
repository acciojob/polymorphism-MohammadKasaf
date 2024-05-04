package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        // Task 3
        int result1 = p.product(2, 3);


        // Task 4
        int result2 = p.product(2, 3, 4);


        // Task 5
        double result3 = p.product(2.5, 3.5);

    }

    public static class Product {
        // Task 3
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5
        public double product(double x, double y) {
            return x * y;
        }
    }
}