package poly.ex.pay1;

public abstract class PayStore {
    public static Pay selectPay(String payName) {
        if (payName.equals("kakao")){
            return new KakaoPay();
        } else if (payName.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
