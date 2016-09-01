import org.junit.Test;
import proxy.GamePlayerHandler;
import target.GamePlayer;
import target.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by STZHANGJK on 2016/9/1.
 */
public class Test007 {
    @Test
    public void test(){
        IGamePlayer player = new GamePlayer();
        InvocationHandler handler = new GamePlayerHandler(player);
        ClassLoader loader = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(loader,player.getClass().getInterfaces(),handler);
        proxy.login("user","123456");
        proxy.killBoss();
        proxy.upgrade();
    }
}
