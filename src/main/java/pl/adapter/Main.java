package pl.adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new SwitchboardAdapter(new Switchboard());
        WorkPlace workPlace = new WorkPlace(adapter);
        System.out.println(workPlace.charge());
    }
}
