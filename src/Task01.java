public class Task03 {
    public void main(){
        double creditBalance = 5000;
        double interestRate = 0.17;
        double totalMonth1 = 0;
        double totalMonth2 = 0;
        double dueInterest = 0;


        totalMonth1 = creditBalance + ( creditBalance*interestRate);
        totalMonth2 = totalMonth1 + ( totalMonth1 *interestRate);

        dueInterest = totalMonth1 - creditBalance;
        System.out.println("Your interest due is $"+dueInterest + ", Your current balance is now $" + totalMonth1);

        dueInterest = totalMonth2 - creditBalance;
        System.out.println("Your interest due is $"+dueInterest + ", Your current balance is now $" + totalMonth2);



    }
}
