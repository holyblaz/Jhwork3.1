public class BonusMilesService {
    public int calculate(int cost) {
        int bonusForOneMile = 20; // количество рублей за 1 милю
        int bonus = cost / bonusForOneMile; // количество наичисленных мили за билет

        return bonus;
    }
}
/*

public class BonusMilesService {
    public void calculate(int cost) {
        int bonusForMile = 20;
        int bonus = cost / bonusForMile;
        System.out.println("Доступно количество бонусов: " + bonus);
    }
}

 */