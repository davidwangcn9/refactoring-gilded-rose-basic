package cn.xpbootcamp.gilded_rose.product;

public class AgedBrieItem extends Item {

    public AgedBrieItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void update() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
        setSellIn(getSellIn() - 1);
        if (getSellIn() < 0 && getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }
}
