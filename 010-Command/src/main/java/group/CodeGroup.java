package group;

/**
 * Created by STZHANGJK on 2016/9/4.
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("添加一个功能");
    }

    @Override
    public void delete() {
        System.out.println("删除一个功能");
    }

    @Override
    public void change() {
        System.out.println("修改一个功能");
    }

    @Override
    public void plan() {

    }
}
