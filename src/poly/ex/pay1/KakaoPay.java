package poly.ex.pay1;

public class KakaoPay implements Pay{

    public boolean pay(int amount) {
        System.out.println("카카오 시스쳄과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
