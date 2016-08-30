import org.junit.Test;
import proxy.GamePlayerProxy;
import target.GamePlayer;
import target.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public class Test006 {
    @Test
    public void test(){
        IGamePlayer player = new GamePlayer();
        GamePlayerProxy proxy = new GamePlayerProxy(player);
        proxy.login("p1","123456");
        proxy.killBoss();
        proxy.upgrade();
    }
}
