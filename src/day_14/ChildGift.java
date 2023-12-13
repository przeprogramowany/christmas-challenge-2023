package day_14;

public record ChildGift(String childFirstName, String giftName, String updatedGiftName) {

    public ChildGift(String childFirstName, String giftName, String updatedGiftName) {
        this.childFirstName = childFirstName;
        this.giftName = giftName;
        this.updatedGiftName = updatedGiftName;
    }

    public ChildGift(String childFirstName, String giftName) {
        this(childFirstName, giftName, null);
    }
}