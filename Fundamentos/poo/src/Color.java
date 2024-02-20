public enum Color {
    ROJO("rojo"),
    AMARILLO("amarillo"),
    AZUL("azul"),
    VERDE("verde"),
    NARANJA("naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
}
