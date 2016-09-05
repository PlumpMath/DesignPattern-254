import handler.Handler;
import handler.Handler1;
import handler.Handler2;
import handler.Handler3;
import org.junit.Test;
import request.Request;

/**
 * Created by STZHANGJK on 2016/9/5.
 */
public class Test011 {
    @Test
    public void test(){
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();
        Handler handler3 = new Handler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        Request request = new Request();
        request.setLevel(3);
        request.setMessage("第三层消息");

        handler1.handleRequest(request);
    }
}
