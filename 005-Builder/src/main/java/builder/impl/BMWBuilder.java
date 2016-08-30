package builder.impl;

import builder.CarBuilder;
import product.CarModel;
import product.Sequence;
import product.impl.BMWModel;

import java.util.List;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public class BMWBuilder implements CarBuilder{

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequences(List<Sequence> sequences) {
        bmw.setSequences(sequences);
    }

    @Override
    public CarModel buildCarModel() {
        return bmw;
    }
}
