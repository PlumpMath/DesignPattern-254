/**
 * Created by STZHANGJK on 2016/9/1.
 */
public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        PrototypeClass pc = null;
        try{
            pc = (PrototypeClass) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return pc;
    }
}
