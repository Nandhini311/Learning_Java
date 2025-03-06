enum geometry{LINE, POLYGON, POINT}

enum Color {BLACK, BLUE, GREEN, ORANGE, RED}
enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}
enum LineMarker {DASHED, DOTTED, SOLID}

public interface IMappable {

    String JSON_PROPERTY = """
            "properties: " {%s}
            """;

    String label(); //by default this will be public and abstract.
    geometry geometryType();
    String getMarker();

    default String toJSON(){
      return """
              "type": %s, "label": "%s", "marker": %s"
              """.formatted(geometryType(), label(), getMarker());
    }

    //it has asked us to create a static method
    static void mapIT(IMappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}

