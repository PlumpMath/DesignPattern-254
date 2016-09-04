package command;

/**
 * 命令实例，添加需求命令
 */
public class AddRequirementCommand extends Command{
    /**
     * 实现命令的执行方法
     */
    @Override
    public void execute() {
        System.out.println("AddRequirementCommand");
        requirementGroup.find();
        requirementGroup.add();
        requirementGroup.plan();
    }
}
