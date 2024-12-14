import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class InvalidNumberException extends Exception {
    InvalidNumberException(String message) {
        super("Invalid number of gifts, it should be >=1");
    }
}
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
public class Main {
    static Map<String, GiftStore> gift = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static double totalAmount = 0;
    static int itemCount;

//    static void displayGifts() {
//        for(Map.Entry<String, GiftStore> entry : gift.entrySet()) {
//            System.out.println(entry.getKey() + " - Rs." + entry.getValue().getGiftPrice());
//        }
//    }

    static String[] getGifts() {
        System.out.print("Enter number of gift: ");
        itemCount = sc.nextInt();
        String[] items = new String[itemCount];
        try{
            if(itemCount <= 0) {
                throw new InvalidNumberException("Invalid number of gifts");
            }
            System.out.print("Enter gift name: ");


            for(int i = 0; i < itemCount; i++) {
                items[i] = sc.next();
            }

//            getTotal(items, count);
        }
        catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }
        return items;
    }

    static void getTotal(String[] items) {
        for(int i = 0; i < itemCount; i++) {
            totalAmount += gift.get(items[i]).getGiftPrice();
        }

        double gst = (totalAmount * 0.05);

        double discount=0;
        if(totalAmount > 2500) {
            discount = (totalAmount * 0.10);
        }

        totalAmount =  totalAmount + gst - discount;

        System.out.println("Total amount: " + totalAmount);
    }

    public static void main(String[] args) {

        gift.put("Teddybear", new GiftStore("Standard", "Teddybear", 600));
        gift.put("Chocolates", new GiftStore("Standard","Chocolates",1000));
        gift.put("Novel", new GiftStore("Standard","Novel",800));
        gift.put("Photoframe", new GiftStore("Premium","Photoframe",1500));
        gift.put("Ornaments", new GiftStore("Premium","Ornaments",2000));
        gift.put("Personalized", new GiftStore("Premium","Personalized Caricature",1800));

//        displayGifts();
        String[] items = getGifts();
        getTotal(items);

    }
}