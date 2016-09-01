package proxy;

import target.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by STZHANGJK on 2016/9/1.
 */
public class GamePlayerHandler implements InvocationHandler{

    private IGamePlayer target;

    public GamePlayerHandler(IGamePlayer target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(target,args);
        after();
        return null;
    }

    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }
}
