import command.AddRequirementCommand;
import command.Command;
import command.DeletePageCommand;
import invoker.Invoker;
import org.junit.Test;

/**
 * Created by STZHANGJK on 2016/9/4.
 */
public class Test010 {
    @Test
    public void test(){

        Invoker invoker = new Invoker();

        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();

        Command command1 = new DeletePageCommand();
        invoker.setCommand(command1);
        invoker.action();
    }
}
