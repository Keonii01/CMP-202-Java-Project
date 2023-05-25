package CMP202;

public class Account {
    public float Balance = 1000000;

    public float withdrawl(float amount){
        Balance = Balance - amount;
        return Balance;
    }

    public float deposit(float amount){
        Balance = Balance + amount;
        return Balance;
    }
}
