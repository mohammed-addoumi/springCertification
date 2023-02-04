package question19;

public class Target implements Targeatable {

    public int calculateSum(int a, int b) {
        return a+b;
    }

    @Override
    public void test() {
        System.out.println(calculateSum(12,12));
    }
}
