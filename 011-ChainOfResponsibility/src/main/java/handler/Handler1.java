package handler;

import request.Request;

/**
 * Created by STZHANGJK on 2016/9/5.
 */
public class Handler1 extends Handler{

    public Handler1() {
        super(1);
    }

    @Override
    public void response(Request request) {
        System.out.println(request.getLevel() + " " + request.getMessage());
    }
}
