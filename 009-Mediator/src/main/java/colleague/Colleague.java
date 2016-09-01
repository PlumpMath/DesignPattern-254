package colleague;

import mediator.Mediator;

/**
 * Created by STZHANGJK on 2016/9/1.
 */
public abstract class Colleague {
    protected Mediator mediator;

    protected Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
