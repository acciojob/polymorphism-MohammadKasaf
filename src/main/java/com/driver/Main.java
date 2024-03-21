package com.driver;

public class Main {

    static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String args[]) {

        Product p = new Product();
        System.out.println("Product of 1 and 2: " + p.product(1, 2));
        System.out.println("Product of 2, 3, and 4: " + p.product(2, 3, 4));
        System.out.println("Product of 2.3 and 5.6: " + p.product(2.3d, 5.6d));
    }
}
