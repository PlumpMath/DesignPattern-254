package proxy;

import target.IGamePlayer;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer target;

    public GamePlayerProxy(IGamePlayer target) {
        this.target = target;
    }

    @Override
    public void login(String user, String password) {
        before();
        target.login(user,password);
        after();
    }

    @Override
    public void killBoss() {
        before();
        target.killBoss();
        after();
    }

    @Override
    public void upgrade() {
        before();
        target.upgrade();
        after();
    }

    private void before(){
        System.out.println("proxy before");
    }

    private void after(){
        System.out.println("proxy after");
    }
}
