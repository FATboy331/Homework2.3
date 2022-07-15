
public class BankAccount {

    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }


    public void deposit(Double sum){
       this.amount += sum;
    }
    public Double withDraw(int sum) throws LimitException {
        if(sum > amount){
            Double rem = this.amount;
            this.amount -= this.amount;
            throw new LimitException("Произошло сниятия остатка " + rem, this.amount);

        }
       this.amount -= sum;

        return this.amount;


    }


}
