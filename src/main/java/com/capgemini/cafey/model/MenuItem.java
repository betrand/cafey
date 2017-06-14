package com.capgemini.cafey.model;

/**
 *
 * @author bu
 */
public enum MenuItem {

    Cola(false, 50),
    Coffee(true, 100),
    Cheese_Sandwich(false, 200);

    private boolean hot;
    private int price;

    MenuItem(boolean hot, int price) {
        this.hot = hot;
        this.price = price;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
