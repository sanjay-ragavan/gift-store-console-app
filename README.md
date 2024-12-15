# Gift Store Management System in Java

## Overview

This project implements a **Gift Store Management System** in Java. The system allows users to choose gifts from a predefined catalog, calculate the total cost including GST, and apply discounts if applicable. It also validates the input for the number of gifts using custom exceptions.

---

## Features

1. **Gift Catalog**: A predefined catalog of gifts with categories, names, and prices.  
2. **Custom Exception Handling**: Ensures the number of gifts is valid (>= 1).  
3. **Dynamic Input**: Users can input the number of gifts and their names.  
4. **Billing System**: Calculates the total amount, adds GST, and applies discounts based on conditions.  

---

## Code Structure

### **Classes**
- **`GiftStore`**: Represents individual gift items with attributes like type, name, and price.  
- **`InvalidNumberException`**: Custom exception for invalid number of gifts.  
- **`Main`**: The driver class for the system, handling user input and gift selection.

### **Main Class Methods**

| Method         | Description                                                                     |
|----------------|---------------------------------------------------------------------------------|
| `getGifts()`   | Takes user input for the number and names of gifts, with validation.            |
| `getTotal()`   | Calculates the total cost including GST and applies discounts if applicable.    |

---

## How to Use

1. Clone this repository or copy the code.  
2. Compile and run the `Main` class.  
3. Follow the prompts to input the number of gifts and their names.  

### Example Usage (from `Main` class)

```java
public class Main {
    public static void main(String[] args) {
        gift.put("Teddybear", new GiftStore("Standard", "Teddybear", 600));
        gift.put("Chocolates", new GiftStore("Standard","Chocolates",1000));
        gift.put("Novel", new GiftStore("Standard","Novel",800));
        gift.put("Photoframe", new GiftStore("Premium","Photoframe",1500));
        gift.put("Ornaments", new GiftStore("Premium","Ornaments",2000));
        gift.put("Personalized", new GiftStore("Premium","Personalized Caricature",1800));

        String[] items = getGifts();  // Take user input
        getTotal(items);             // Calculate and display total cost
    }
}
```

---

## Sample Output

```
Enter number of gift: 3
Enter gift name: Chocolates
Novel
Teddybear
Total amount: 2520.0
```

---

## Customization

- Add more gift items to the catalog.  
- Extend the system to include categories or more detailed billing information.  
- Add features like saving bills to a file or generating unique transaction IDs.

---
