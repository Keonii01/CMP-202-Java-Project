package CMP202;

public class Savings extends Account {
    public float withdrawl_savings(float amount){
        if(amount > 20000) {
            return 0;
        }else{return withdrawl(amount);}

        }
    }

