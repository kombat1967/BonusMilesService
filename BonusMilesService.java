public class BonusMilesService {

    public int calculate(int cost) {
        int bonus = 20;// количество рублей для одной бонусной милли
        //Логика
        int miles = cost / bonus; // новую переменную

        return miles;
    }
}
