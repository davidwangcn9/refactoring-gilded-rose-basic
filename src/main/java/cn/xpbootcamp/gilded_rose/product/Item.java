package cn.xpbootcamp.gilded_rose.product;

public abstract class Item {

    private final String name;
    private int sellIn;
    private int quality;

    protected int getSellIn() {
        return sellIn;
    }

    protected boolean withinMaxQuality() {
        return quality < 50;
    }

    protected boolean withinMinQuality() {
        return quality > 0;
    }

    protected boolean passSellInDay() {
        return getSellIn() < 0;
    }

    protected void increaseQuality() {
        quality = quality + 1;
    }

    protected void decreaseQuality() {
        quality = quality - 1;
    }

    protected void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    protected void resetQuality() {
        quality = 0;
    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void update();

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
