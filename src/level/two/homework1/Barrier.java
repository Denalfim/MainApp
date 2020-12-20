package level.two.homework1;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    public abstract boolean moving(Goable actions);

    public String getName() {
        return name;
    }
}