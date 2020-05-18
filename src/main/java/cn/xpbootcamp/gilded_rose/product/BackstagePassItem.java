package cn.xpbootcamp.gilded_rose.product;

public class BackstagePassItem extends Item {
    public BackstagePassItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void update() {
        if (withinMaxQuality()) {
            increaseQuality();
            if (getSellIn() < 11 && withinMaxQuality()) {
                increaseQuality();
            }

            if (getSellIn() < 6 && withinMaxQuality()) {
                increaseQuality();
            }
        }
        decreaseSellIn();
        if (passSellInDay()) {
            resetQuality();
        }
    }
}
