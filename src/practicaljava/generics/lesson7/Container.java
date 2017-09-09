package practicaljava.generics.lesson7;

public class Container<i1, i2> {

    private i1 firstItem;
    private i2 secondItem;

    Container(i1 firstItem, i2 secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    //getters and setters

    i1 getFirstItem() {
        return firstItem;
    }

    void setFirstItem(i1 firstItem) {
        this.firstItem = firstItem;
    }

    i2 getSecondItem() {
        return secondItem;
    }

    void setSecondItem(i2 secondItem) {
        this.secondItem = secondItem;
    }
}
