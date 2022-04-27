public class BonusMilesService {
    public int calculate(int cost) {
        int bonusForOneMile = 20; // количество рублей за 1 милю
        int price = cost / bonusForOneMile; // количество наичисленных мили за билет

        return price;
    }
}
/*

public class BonusMilesService {
    public void calculate(int cost) {
        int bonusForMile = 20;
        int price = cost / bonusForMile;
        System.out.println("Доступно количество бонусов: " + price);
    }
}

 */