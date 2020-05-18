package cn.xpbootcamp.gilded_rose.product;

public class BackstagePassItem extends Item {
    public BackstagePassItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void update() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
            if (getSellIn() < 11 && getQuality() < 50) {
                setQuality(getQuality() + 1);
            }

            if (getSellIn() < 6 && getQuality() < 50) {
                setQuality(getQuality() + 1);
            }
        }
        setSellIn(getSellIn() - 1);
        if (getSellIn() < 0) {
            setQuality(0);
        }
    }
}
