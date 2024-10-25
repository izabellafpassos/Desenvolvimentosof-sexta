package singleton;

public class teste {
    public static void main(String[] args) {
        conta cc = conta.getInstance(123);
        cc.depositar(100000.00);
        System.out.println(cc.getSaldo(null));

        conta cc_mobile = conta.getInstance(1235);
        cc_mobile.depositar(10000.00);
        System.out.println(cc_mobile.getSaldo(null));
    }
}
