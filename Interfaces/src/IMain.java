import java.util.ArrayList;
import java.util.List;

public class IMain {
    public static void main(String[] args) {
        List<IMappable> mappables = new ArrayList<>();

        mappables.add(new IBuilding("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new IBuilding("Sydney Opera House",
                UsageType.ENTERTAINMENT));
        mappables.add(new IBuilding("Stadium Australia", UsageType.SPORTS));

        mappables.add(new IUtility("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new IUtility("Olympic Blvd", UtilityType.WATER));

        for (var m : mappables) {
            IMappable.mapIT(m);
        }
    }
}
