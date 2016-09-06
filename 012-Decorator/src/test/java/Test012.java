import decorator.Decorator;
import decorator.HighScoreDecorator;
import decorator.SortDecorator;
import org.junit.Test;
import report.ForthScoreReport;
import report.ScoreReport;

/**
 * Created by STZHANGJK on 2016/9/6.
 */
public class Test012 {
    @Test
    public void test(){
        ScoreReport report = new ForthScoreReport();
        report = new HighScoreDecorator(report);
        report = new SortDecorator(report);

        report.report();

        report.sign("老三");
    }
}
