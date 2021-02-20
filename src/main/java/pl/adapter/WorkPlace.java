package pl.adapter;

public class WorkPlace {
    private Adapter adapter;

    public WorkPlace(Adapter adapter){
        this.adapter = adapter;
    }
    public double charge() {
        return adapter.give32A();
    }
}
