import context.Context;
import org.junit.Test;
import strategy.IStrategy;
import strategy.impl.Strategy1;

/**
 * Created by STZHANGJK on 2016.9.28.
 */
public class Test013 {
    @Test
    public void test(){
        IStrategy strategy = new Strategy1();
        Context cxt = new Context(strategy);
        cxt.useStrategy();
    }
}
