public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("from morning to night");
        builder.makeItems(new String[]{
            "Good Morning.",
            "Good Evening"
        });
        builder.makeString("in the night");
        builder.makeItems(new String[]{
            "Good Evening",
            "Good Night",
            "Good Bye"
        });
        builder.close();
    }
}