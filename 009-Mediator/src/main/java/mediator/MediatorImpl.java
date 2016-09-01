package mediator;

import colleague.ColleagueImpl1;
import colleague.ColleagueImpl2;

/**
 * Created by STZHANGJK on 2016/9/1.
 */
public class MediatorImpl extends Mediator{

    private ColleagueImpl1 c1;
    private ColleagueImpl2 c2;

    @Override
    public void func1() {
        System.out.println("func1");
        c1.selfMethod();
        c2.selfMethod();
    }

    @Override
    public void func2() {
        System.out.println("func2");
        c1.selfMethod();
        c2.selfMethod();
    }

    public ColleagueImpl1 getC1() {
        return c1;
    }

    public void setC1(ColleagueImpl1 c1) {
        this.c1 = c1;
    }

    public ColleagueImpl2 getC2() {
        return c2;
    }

    public void setC2(ColleagueImpl2 c2) {
        this.c2 = c2;
    }
}
