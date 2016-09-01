package target;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public class GamePlayer implements IGamePlayer {
    @Override
    public void login(String user, String password) {
        System.out.println("user = " + user + "password = " + password);
    }

    @Override
    public void killBoss() {
        System.out.println("kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println("update");
    }
}
