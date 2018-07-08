package com.kodilla.good.patterns.challenges;

public class Product {
    String productName;
    double productQuantity;

    public Product(String productName, double productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.productQuantity, productQuantity) != 0) return false;
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productName.hashCode();
        temp = Double.doubleToLongBits(productQuantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
