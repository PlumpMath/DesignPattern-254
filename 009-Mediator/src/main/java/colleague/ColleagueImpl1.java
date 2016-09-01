package colleague;

import mediator.Mediator;

/**
 * Created by STZHANGJK on 2016/9/1.
 */
public class ColleagueImpl1 extends Colleague {

    public ColleagueImpl1(Mediator mediator) {
        super(mediator);
    }

    /**
     * 自有方法
     */
    public void selfMethod() {
        System.out.println("colleague.Colleague1 selfMethod");
    }

    /**
     * 依赖方法
     */
    public void depMethod() {
        super.mediator.func1();
    }
}
