/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
public class Invoice {
    private Product product1;
    private Product product2;
    private Product product3;
    private  double tax;

    public Invoice(Product product1, Product product2, Product product3, double tax) {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
        this.tax = tax;
    }
     public double calculateTotal(){
         
    return product1.getProductFee() +product2.getProductFee()+product3.getProductFee();
    
}
     public double calculateTax(){
         
         return (calculateTotal()*tax)/100;
     }
     
     public double calculateTotalWithTax(){
         return calculateTotal() + calculateTax();
    
}
     
     public void printTotalFee(){
         System.out.println("Fatura Detayları");
         System.out.println(product1.getProductName() + ": " + product1.getProductFee() + " TL");
         System.out.println(product2.getProductName() + ": " + product2.getProductFee() + " TL");
         System.out.println(product3.getProductName() + ": " + product3.getProductFee() + " TL");
         System.out.println("Vergi oranı :  % " + tax);
         System.out.println("Vergisiz toplam tutar: " + calculateTotal());
         System.out.println("Vergili toplam tutar  " + calculateTotalWithTax());
     }
    
    
    
}
