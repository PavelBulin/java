public abstract class Stage {
    protected int length;
    protected String description;
    public String getDescription() {
        return description;
    }

    public Object getLength() {
        return length;
    }

    public abstract void go(Car c);
}
