public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(50000);
        System.out.println((miles) + " Бонусных миль");

    }
}
