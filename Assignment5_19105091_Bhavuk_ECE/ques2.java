class RBI{
    private boolean result =false;
    double rateOfInterest;
    boolean isAccountLocked = false;
    double minBalanceAllowed;
    double maxWithdrawalAllowed;
    boolean checkRateOfInterest(){
        if(rateOfInterest>=4.0)
            return true;
        else return false;
    }

    boolean checkMinBalanceAllowed(){
        if(minBalanceAllowed>=500)
            return true;
        else return false;
    }
    boolean checkmaxWithdrawalAllowed() {
        if (maxWithdrawalAllowed >= 5000)
            return true;
        else return false;
    }
    void verifyAccount(account a){
        result = checkmaxWithdrawalAllowed()&& checkMinBalanceAllowed()&&checkRateOfInterest();
        if(result){
            System.out.println("Account Created Successfully");
        }
        else{
            a.lock = true;
            isAccountLocked =true;
            System.out.println("Account Created but locked as result of disregarding RBI guidelines");
        }

    }
    void setRateofInterest(double rateOfInterest ){
        this.rateOfInterest = rateOfInterest;

    }
    void  setMinBalanceAllowed(double minBalanceAllowed){
        this.minBalanceAllowed = minBalanceAllowed;

    }
    void setmaxWithdrawalAllowed(double maxWithdrawalAllowed){
        this.maxWithdrawalAllowed = maxWithdrawalAllowed;

    }

}
class customer {
    String name;
    String dateOfBirth;
}

class account extends customer{
    Class bankName;
    String accountId;
    boolean lock;
    double currBalance;

    account(Class bankName,String accountId, boolean lock, double currBalance,String name,String dateOfBirth){
        this.bankName = bankName;
        this.lock = lock;
        this.currBalance=currBalance;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.accountId = accountId;
    }
}

class SBI extends RBI{

    SBI(){
        setmaxWithdrawalAllowed(10000);
        setMinBalanceAllowed(1000);
        setRateofInterest(4.8);
    }

}
class PNB extends RBI{
    PNB(){
        setmaxWithdrawalAllowed(10000);
        setMinBalanceAllowed(2000);
        setRateofInterest(4.2);

    }
}
class ICICI extends RBI{

    ICICI(){
        setmaxWithdrawalAllowed(12000);
        setMinBalanceAllowed(2000);
        setRateofInterest(4.3);

    }
}
public class ques2 {
    public static void main(String[] args){
        SBI sbi =new SBI();
        ICICI icici = new ICICI();
        PNB pnb = new PNB();
        account a1= new account(sbi.getClass(),"8955KOC45", false, 15000, "John", "10/10/1975");
        sbi.verifyAccount(a1);
    }
}