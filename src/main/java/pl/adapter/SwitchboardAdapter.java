package pl.adapter;

public class SwitchboardAdapter implements Adapter {
    private Switchboard switchboard;

    public SwitchboardAdapter(Switchboard switchboard) {
        this.switchboard = switchboard;
    }

    @Override
    public double give32A() {
        return switchboard.give32A() / 2;
    }
}
