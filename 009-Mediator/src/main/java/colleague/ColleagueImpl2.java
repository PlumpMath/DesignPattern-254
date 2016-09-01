package colleague;

import mediator.Mediator;

/**
 * Created by STZHANGJK on 2016/9/1.
 */
public class ColleagueImpl2 extends Colleague {

    public ColleagueImpl2(Mediator mediator) {
        super(mediator);
    }

    /**
     * 自有方法
     */
    public void selfMethod() {
        System.out.println("colleague.Colleague2 selfMethod");
    }

    /**
     * 依赖方法
     */
    public void depMethod() {
        super.mediator.func2();
    }
}
