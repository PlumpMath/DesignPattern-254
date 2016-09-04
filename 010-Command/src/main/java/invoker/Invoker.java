package invoker;

import command.Command;

/**
 * 命令调用者，通过它执行命令
 */
public class Invoker {
    /**客户命令*/
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户的命令
     */
    public void action(){
        command.execute();
    }
}
