import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*           Объявляете переменные для входных данных и
             параметров программы: начального счёта,
             суммы пополнения и тп

             Условным оператором проверяете превысила ли
             сумма пополнения порог и для этих двух разных
             сценариев рассчитываете сумму бонуса и выводите
             на экран.                                              */

        Scanner console = new Scanner(System.in);

        int totalMoney = 100, refillAmount, bonusMoney = 0;

        System.out.print("You have ");
        System.out.print(totalMoney);
        System.out.println(" money on your account.");
        System.out.print("How many money you want to refill on your mobile account?\nEnter here: ");
        refillAmount = console.nextInt();
        if (refillAmount < 0) {
            while(refillAmount < 0) {
                System.out.print("You can't refill your account with a negative number.\nEnter new number here: ");
                refillAmount = console.nextInt();
            }
        }
        totalMoney = totalMoney + refillAmount;
        if (refillAmount >= 1000) {
            bonusMoney = refillAmount / 100;
        }
        totalMoney = totalMoney + bonusMoney;
        System.out.print("You have ");
        System.out.print(totalMoney);
        System.out.println(" money on your account.");
        if (bonusMoney > 0) {
            System.out.print("You have gained ");
            System.out.print(bonusMoney);
            System.out.println(" bonus money on your account!");
        }
    }
}
