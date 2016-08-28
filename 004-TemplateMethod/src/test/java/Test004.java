import org.junit.Test;

/**
 * Created by STZHANGJK on 2016/8/28.
 */
public class Test004 {
    @Test
    public void test(){
        ConcreteClass1 temp1 = new ConcreteClass1();
        temp1.templateMethod();

        ConcreteClass2 temp2 = new ConcreteClass2();
        temp2.templateMethod();
    }
}
