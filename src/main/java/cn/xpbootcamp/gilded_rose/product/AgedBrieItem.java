package cn.xpbootcamp.gilded_rose.product;

public class AgedBrieItem extends Item {

    public AgedBrieItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void update() {
        if (withinMaxQuality()) {
            increaseQuality();
        }
        decreaseSellIn();
        if (passSellInDay() && withinMaxQuality()) {
            increaseQuality();
        }
    }
}
