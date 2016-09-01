import colleague.ColleagueImpl1;
import colleague.ColleagueImpl2;
import mediator.MediatorImpl;
import org.junit.Test;

/**
 * Created by STZHANGJK on 2016/9/1.
 */
public class Test009 {
    @Test
    public void test(){
        MediatorImpl mediator = new MediatorImpl();
        ColleagueImpl1 c1 = new ColleagueImpl1(mediator);
        ColleagueImpl2 c2 = new ColleagueImpl2(mediator);

        mediator.setC1(c1);
        mediator.setC2(c2);

        c1.depMethod();
        c2.depMethod();
    }
}
