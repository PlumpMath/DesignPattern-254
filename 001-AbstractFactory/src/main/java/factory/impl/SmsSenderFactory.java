package factory.impl;

import factory.ISenderFactory;
import sender.ISender;
import sender.impl.SmsSender;

/**
 * Created by STZHANGJK on 2016/8/28.
 */
public class SmsSenderFactory implements ISenderFactory {
    @Override
    public ISender generateSender() {
        return new SmsSender();
    }
}
