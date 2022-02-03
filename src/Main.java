public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int replenishmentAmount = 3000;
        if (replenishmentAmount <= 1000) {
            System.out.println("бонусов нет");
        } else {
            if (replenishmentAmount >= 1001) {
                System.out.println("Бонус равен - " + replenishmentAmount / 100);
                System.out.println("Итоговая сумма на счету клиента - " + (startingScore + replenishmentAmount));

            }
        }

    }
}
//хотел через счетчик сделать, но понял , что не могу через Условия это реализовать(