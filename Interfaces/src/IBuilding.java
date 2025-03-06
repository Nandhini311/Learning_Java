enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}

public class IBuilding implements IMappable {

    private String name;
    private UsageType type;

    //all class must have a constructoir
    public IBuilding (String name, UsageType type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String label() {
        return name + "(" + type + ")";
    }

    @Override
    public geometry geometryType() {
        return geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }
}

//all three methods are now implemented.
