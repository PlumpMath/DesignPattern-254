import director.impl.BenzDirector;
import org.junit.Test;
import product.CarModel;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public class Test005 {
    @Test
    public void test(){
        CarModel car = new BenzDirector().getACarModel();
        car.run();
    }
}
