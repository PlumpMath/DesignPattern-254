package command;

/**
 * 命令实例，删除页面命令
 */
public class DeletePageCommand extends Command{
    /**
     * 实现命令的执行方法
     */
    @Override
    public void execute() {
        System.out.println("DeletePageCommand");
        requirementGroup.find();
        requirementGroup.delete();
        requirementGroup.plan();

        codeGroup.find();
        codeGroup.delete();
        codeGroup.plan();

        pageGroup.find();
        pageGroup.delete();
        pageGroup.plan();
    }
}
