package report;

/**
 * Created by STZHANGJK on 2016/9/6.
 */
public class ForthScoreReport implements ScoreReport {

    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }

    @Override
    public void sign(String name) {
        System.out.println("         "+name);
    }
}
