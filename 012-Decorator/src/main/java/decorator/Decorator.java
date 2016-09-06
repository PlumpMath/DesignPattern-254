package decorator;

import report.ScoreReport;

/**
 * Created by STZHANGJK on 2016/9/6.
 */
public abstract class Decorator implements ScoreReport{
    protected ScoreReport report;

    public Decorator(ScoreReport report) {
        this.report = report;
    }

    /**
     * 留给子类实现
     */
    public abstract void report();

    /**
     * 不需要装饰的方法
     * @param name
     */
    @Override
    public void sign(String name) {
        report.sign(name);
    }
}
