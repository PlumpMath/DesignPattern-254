package sender.impl;

import factory.ISenderFactory;
import sender.ISender;

/**
 * Created by STZHANGJK on 2016/8/28.
 */
public class EmailSender implements ISender {
    @Override
    public void send() {
        System.out.println("email send!");
    }
}
