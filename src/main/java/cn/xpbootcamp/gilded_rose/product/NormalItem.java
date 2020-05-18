package cn.xpbootcamp.gilded_rose.product;

public class NormalItem extends Item {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (withinMinQuality()) {
            decreaseQuality();
        }
        decreaseSellIn();
        if (passSellInDay() && withinMinQuality()) {
            decreaseQuality();
        }
    }
}
