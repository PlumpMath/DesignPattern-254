package sender.impl;

import sender.ISender;

/**
 * Created by STZHANGJK on 2016/8/28.
 */
public class SmsSender implements ISender {
    @Override
    public void send() {
        System.out.println("sms send!");
    }
}
