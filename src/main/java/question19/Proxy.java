package question19;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Proxy implements Targeatable{

    private Target target;

    public Proxy() {
        this.target = new Target();
    }

    public int calculateSum(int a, int b) {
        if(a < 0 || b < 0) throw new IllegalArgumentException("one of the parameters or more are less than 0");
        return target.calculateSum(a,b);
    }

    @Override
    public void test() {

    }
}
