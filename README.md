# Invoice Calculation Project

This Java project calculates and prints an invoice for three products. The Invoice class computes the total cost, tax, and final amount. The Product class holds product details like name and price. The main program creates products, calculates the invoice, and displays the breakdown.

## Project Structure

The project consists of three main Java files:

1. **Product.java**: Defines the Product class, which holds details such as product name and price. This class includes getter and setter methods for managing the product information.

2. **Invoice.java**: Defines the Invoice class, which is responsible for calculating the invoice based on the products provided. The class includes methods to calculate the total amount, tax, and final total (including tax). It also prints a detailed breakdown of the invoice.

3. **Main.java**: The main class where the products are created, and the invoice is generated and printed. The program calculates and prints the details of the products, tax percentage, total cost before tax, and the final amount including tax.

## Features

- **Product Information**: Store and manage information about products, including their name and price.
- **Invoice Calculation**: Calculate the total price of all products, compute tax based on a specified tax rate, and determine the final amount after adding the tax.
- **Detailed Invoice Printing**: Print a detailed breakdown of each product, the tax rate, and the final amount.

## How to Run

1. Compile all the Java files:
   ```sh
   javac Product.java Invoice.java Main.java
   ```
2. Run the `Main` class to see the invoice output:
   ```sh
   java Main
   ```

## Example Output

```
Fatura Detayları
MacBook: 50000.0 TL
Airpods: 3500.0 TL
Apple-Watch: 18500.0 TL
Vergi oranı :  % 0.18
Vergisiz toplam tutar: 72000.0
Vergili toplam tutar  84880.0
```

## Classes and Methods

### Product Class
- **Fields**: `productName`, `productFee`
- **Constructor**: Initialize product name and price
- **Methods**: Getter and setter methods for `productName` and `productFee`

### Invoice Class
- **Fields**: `product1`, `product2`, `product3`, `tax`
- **Constructor**: Accepts three products and a tax rate
- **Methods**:
  - `calculateTotal()`: Calculates the total price of all products
  - `calculateTax()`: Computes the tax amount based on the total
  - `calculateTotalWithTax()`: Calculates the final amount including tax
  - `printTotalFee()`: Prints a detailed breakdown of the invoice

### Main Class
- **Main Method**: Creates three products, sets the tax rate, and generates the invoice

## Requirements

- Java Development Kit (JDK) 8 or later

## License

This project is licensed under the MIT License.



