public class Landline implements Phone{
   private String myPhoneNo;
   private boolean isRinging;
   private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public boolean powerOn() {
        return true;
    }

    @Override
    public void callNumber(String number) {
        if(isPowerOn){
            System.out.println("You are dialing the number:"+number);
        }else{
            System.out.println("Your landline is off");
        }
        return;
    }

    @Override
    public void receiveCall(String number) {
        if(isPowerOn && myPhoneNo.equals(number)){
            this.isRinging=true;
            System.out.println("Hey "+myPhoneNo+" Incoming call");
        }else{
            System.out.println("Call not received");
        }
        return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("Call is answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
       return isRinging;
    }
}
