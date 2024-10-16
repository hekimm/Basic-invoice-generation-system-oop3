/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
public class Main {
    
    
    public static void main(String[] args) {
        Product urun1 = new Product("MacBook",50000);
        Product urun2 = new Product("Airpods",3500);
        Product urun3 = new Product("Apple-Watch",18500);
        double tax =0.18;
        Invoice invoice = new Invoice(urun1,urun2,urun3,tax);
        
        invoice.printTotalFee();
        
        
        
    }
}
