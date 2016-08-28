/**
 * Created by STZHANGJK on 2016/8/28.
 */
public class Singleton {

    private Singleton(){}

    private static Singleton INSTANCE;

    public static Singleton getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
