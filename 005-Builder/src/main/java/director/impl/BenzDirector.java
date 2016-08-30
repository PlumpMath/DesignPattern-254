package director.impl;

import builder.CarBuilder;
import builder.impl.BMWBuilder;
import builder.impl.BenzBuilder;
import director.Director;
import product.CarModel;
import product.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public class BenzDirector implements Director{

    private List<Sequence> sequences = new ArrayList<>();
    private CarBuilder builder = new BenzBuilder();

    @Override
    public CarModel getACarModel() {
        sequences.add(Sequence.START);
        sequences.add(Sequence.ENGINE_BOOM);
        sequences.add(Sequence.STOP);
        builder.setSequences(sequences);
        return builder.buildCarModel();
    }

    @Override
    public CarModel getBCarModel() {
        return null;
    }

    @Override
    public CarModel getCCarModel() {
        return null;
    }

    @Override
    public CarModel getDCarModel() {
        return null;
    }
}
