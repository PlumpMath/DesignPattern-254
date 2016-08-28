import factory.impl.EmailSenderFactory;
import factory.ISenderFactory;
import factory.impl.SmsSenderFactory;
import org.junit.Test;
import sender.ISender;

/**
 * Created by STZHANGJK on 2016/8/28.
 */
public class Test001 {
    @Test
    public void test(){
        ISenderFactory factory = new EmailSenderFactory();
        ISender sender = factory.generateSender();
        sender.send();

        factory = new SmsSenderFactory();
        sender = factory.generateSender();
        sender.send();
    }
}
