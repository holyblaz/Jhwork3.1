public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_000;
        int miles = service.calculate(10000);
        System.out.println(miles);
    }
}



/*
public class Main{
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_000;
        service.calculate(10_000);
    }
}
*/