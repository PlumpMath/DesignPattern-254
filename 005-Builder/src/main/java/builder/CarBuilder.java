package builder;

import product.CarModel;
import product.Sequence;

import java.util.List;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public interface CarBuilder {

    void setSequences(List<Sequence> sequences);

    CarModel buildCarModel();

}
