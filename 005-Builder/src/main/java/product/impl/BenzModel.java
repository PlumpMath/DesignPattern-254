package product.impl;

import product.CarModel;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public class BenzModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("benz start");
    }

    @Override
    protected void stop() {
        System.out.println("benz stop");
    }

    @Override
    protected void alarm() {
        System.out.println("benz alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz boom");
    }
}
