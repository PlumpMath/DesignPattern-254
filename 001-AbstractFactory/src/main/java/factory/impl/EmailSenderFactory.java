package factory.impl;

import factory.ISenderFactory;
import sender.impl.EmailSender;
import sender.ISender;

/**
 * Created by STZHANGJK on 2016/8/28.
 */
public class EmailSenderFactory implements ISenderFactory {
    public ISender generateSender() {
        return new EmailSender();
    }
}
