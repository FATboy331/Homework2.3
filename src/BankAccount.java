
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
            throw new LimitException("Сумма снятия больше чем остаток",this.amount);
        }
       this.amount -= sum;
       return this.amount;


    }
    public void withDrawRemaining() {
        Double rem = this.amount;
        this.amount -= this.amount;
        System.out.println("Произошло сниятия остатка " + rem);
    }


}
