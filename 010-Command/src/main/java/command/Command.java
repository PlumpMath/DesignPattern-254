package command;

import group.CodeGroup;
import group.PageGroup;
import group.RequirementGroup;

/**
 * 基础命令抽象类
 */
public abstract class Command {

    /**
     * 本例子中客户命令需要用的资源
     */
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected CodeGroup codeGroup = new CodeGroup();
    protected PageGroup pageGroup = new PageGroup();

    /**
     * 留给客户定义的命令
     */
    public abstract void execute();
}
