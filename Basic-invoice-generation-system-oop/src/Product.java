/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
public class Product {
  private String productName;
  private double productFee;
  
  public Product(String productName,double productFee){
      this.productName= productName;
      this.productFee= productFee;
      
  }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productFee
     */
    public double getProductFee() {
        return productFee;
    }

    /**
     * @param productFee the productFee to set
     */
    public void setProductFee(double productFee) {
        this.productFee = productFee;
    }

    
  
    
}
