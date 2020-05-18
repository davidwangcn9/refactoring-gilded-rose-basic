package cn.xpbootcamp.gilded_rose.product;

public class NormalItem extends Item {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
        setSellIn(getSellIn() - 1);
        if (getSellIn() < 0 && getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
    }
}
