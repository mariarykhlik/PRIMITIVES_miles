public class Main {

    public static void main(String[] args) {

        int ticketPrice = 1000;
        int bonusAmount = 20;

        int bonusesNumber = ticketPrice / bonusAmount;

        System.out.println("За покупку билета на сумму "  + ticketPrice + " рублей начислено " + bonusesNumber + " бесплатных миль");

    }

}
