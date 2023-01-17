public interface Phone {

    boolean powerOn();
    void callNumber(String no);
    void receiveCall(String no);
    boolean answerCall();
    boolean isRinging();

}
