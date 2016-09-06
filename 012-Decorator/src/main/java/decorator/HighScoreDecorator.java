package decorator;

import report.ScoreReport;

/**
 * Created by STZHANGJK on 2016/9/6.
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(ScoreReport report) {
        super(report);
    }

    @Override
    public void report() {
        /*修饰*/
        reportHighScore();
        report.report();
    }

    /**
     * 汇报最高成绩
     */
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
}
