/**
 * Created by STZHANGJK on 2016/8/28.
 */
public abstract class AbstractClass {
    protected abstract void doSomething();
    protected abstract void doAnything();

    public void templateMethod(){
        doSomething();
        doAnything();
    }
}
