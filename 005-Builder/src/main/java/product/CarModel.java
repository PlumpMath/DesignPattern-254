package product;


import java.util.List;

/**
 * Created by STZHANGJK on 2016/8/30.
 */
public abstract class CarModel {


    private List<Sequence> sequences;

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run(){
        for (Sequence seq : sequences){
            switch (seq){
                case START:
                    start();
                    break;
                case STOP:
                    stop();
                    break;
                case ALARM:
                    alarm();
                    break;
                case ENGINE_BOOM:
                    engineBoom();
                    break;
            }
        }
    }

    public void setSequences(List<Sequence> sequences) {
        this.sequences = sequences;
    }
}
