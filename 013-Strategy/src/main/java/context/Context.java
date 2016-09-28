package context;

import strategy.IStrategy;

/**
 * Created by STZHANGJK on 2016.9.28.
 * 使用锦囊的上下文
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void useStrategy(){
        strategy.use();
    }
}
