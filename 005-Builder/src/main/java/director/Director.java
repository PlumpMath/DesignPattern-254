package director;

import builder.CarBuilder;
import product.CarModel;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public interface Director {
    CarModel getACarModel();
    CarModel getBCarModel();
    CarModel getCCarModel();
    CarModel getDCarModel();
}
