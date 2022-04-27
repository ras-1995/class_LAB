package com.bnta.assignment;


import java.util.ArrayList;

public class Invoice {
        public static ArrayList<Invoice> invoice = new ArrayList<>();
        private String id;
        private String desc;
        private int qty;
        private double unitPrice;

        public Invoice(String id, String desc, int qty, double unitPrice) {
            this.id = id;
            this.desc = desc;
            this.qty = qty;
            this.unitPrice = unitPrice;
        }

        public String getId() {
            return id;
        }

        public String getDesc() {
            return desc;
        }

        public int getQty() {
            return qty;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public double getTotal(){
            return qty * unitPrice;
        }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

