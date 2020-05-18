package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.product.Item;

class GildedRose {
    private final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update_quality() {
        for (int i = 0; i < items.length; i++) {
            items[i].update();
        }
    }
}
