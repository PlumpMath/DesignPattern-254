package builder.impl;

import builder.CarBuilder;
import product.CarModel;
import product.Sequence;
import product.impl.BenzModel;

import java.util.List;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public class BenzBuilder implements CarBuilder{

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequences(List<Sequence> sequences) {
        benz.setSequences(sequences);
    }

    @Override
    public CarModel buildCarModel() {
        return benz;
    }
}
