package handler;

import request.Request;

/**
 * Created by STZHANGJK on 2016/9/5.
 */
public class Handler2 extends Handler{

    public Handler2() {
        super(2);
    }

    @Override
    public void response(Request request) {
        System.out.println(request.getLevel() + " " + request.getMessage());
    }
}
