enum UtilityType{ELECTRICAL, FIBER_OPTIC, GAS, WATER}

public class IUtility implements IMappable{
    private String name;
    private UtilityType type;

    //Constructor
    public IUtility(String name, UtilityType type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String label() {
        return "name: " + name + " {" + type +"} " ;
    }

    @Override
    public geometry geometryType() {
        return geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.RED + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarker.SOLID;
            case WATER -> Color.BLUE + " " + LineMarker.SOLID;
            default -> Color.BLACK + " " + LineMarker.SOLID;
        };
    }
}
