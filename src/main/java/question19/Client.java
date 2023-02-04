package question19;

public class Client {

    private Proxy proxy;

    public Client() {
        this.proxy = new Proxy();
    }

    public int show(int a,int b){
        return proxy.calculateSum(a, b);
    }
}
