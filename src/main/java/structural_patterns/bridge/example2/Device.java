package structural_patterns.bridge.example2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Device {
    protected boolean on = false;
    protected int volume = 30;
    protected int channel = 1;
    public boolean isEnabled() {
        return on;
    }
    public void enable() {
        on = true;
    }
    public void disable() {
        on = false;
    }
    abstract void printStatus();
}
