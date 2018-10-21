package objects.types;

import core.Utils.ReflectionUtils;
import core.annotations.ThisCodeSmells;
import objects.Product;
import objects.Preparable;

public abstract class SolidProduct extends Product implements Preparable {

    public SolidProduct(String name, double weightInGrams, int calIn100g) {
        super(name, weightInGrams, calIn100g,false);
    }

    @Override
    public void prepare() {
        ReflectionUtils.setReady(this,true);
        System.out.println("Peel, boil and cut into pieces : " + getName().toLowerCase());
    }
}
