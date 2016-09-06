package decorator;

import report.ScoreReport;

/**
 * Created by STZHANGJK on 2016/9/6.
 */
public class SortDecorator extends Decorator{
    public SortDecorator(ScoreReport report) {
        super(report);
    }

    @Override
    public void report() {
        /*修饰*/
        reportSort();
        report.report();
    }

    /**
     * 排名情况
     */
    private void reportSort(){
        System.out.println("我是排名第38名...");
    }
}
