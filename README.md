# Gift Store Application

This Java application simulates a gift store where users can select multiple gifts, calculate the total amount, and apply GST and discounts based on the total price.

## Features

- Display a list of available gifts with their prices.
- Allow users to input the number of gifts they wish to buy.
- Calculate the total amount with applicable GST (5%) and discounts (10% if total amount > 2500).
- Handle invalid inputs such as entering a non-positive number of gifts.

## Classes

### GiftStore Class
The `GiftStore` class represents an individual gift item. It contains:
- `type`: Type of gift (Standard or Premium).
- `giftName`: Name of the gift.
- `giftPrice`: Price of the gift.

```java
class GiftStore {
    private String type;
    private String giftName;
    private int giftPrice;

    GiftStore(String type, String giftName, int giftPrice) {
        this.type = type;
        this.giftName = giftName;
        this.giftPrice = giftPrice;
    }

    public String getType() {
        return type;
    }
    public String getGiftName() {
        return giftName;
    }
    public int getGiftPrice() {
        return giftPrice;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }
    public void setGiftPrice(int giftPrice) {
        this.giftPrice = giftPrice;
    }
}
