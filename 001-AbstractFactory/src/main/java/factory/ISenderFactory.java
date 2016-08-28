package factory;

import sender.ISender;

/**
 * Created by STZHANGJK on 2016/8/28.
 */
public interface ISenderFactory {
    ISender generateSender();
}
