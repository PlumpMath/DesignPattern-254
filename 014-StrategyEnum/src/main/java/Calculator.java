/**
 * 策略枚举
 */
public enum Calculator {
    ADD{
        @Override
        public int execute(int a, int b) {
            return a+b;
        }
    },
    SUB{
        @Override
        public int execute(int a, int b) {
            return a-b;
        }
    };

    public abstract int execute(int a, int b);
}
