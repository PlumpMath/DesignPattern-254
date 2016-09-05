package handler;


import request.Request;

/**
 * Created by STZHANGJK on 2016/9/5.
 */
public abstract class Handler {

    /**响应级别，判断是否响应*/
    private int level;
    /**下一任处理者*/
    private Handler successor;

    public Handler(int level) {
        this.level = level;
    }

    /**
     * 模板方法
     * @param request 封装请求信息
     */
    public final void handleRequest(Request request){
        if(request.getLevel() == level){
            /*是自己要处理的*/
            response(request);
        }else{
            /*不是自己需要处理的就传递给下一任处理者*/
            successor.handleRequest(request);
        }
    }

    public abstract void response(Request request);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
