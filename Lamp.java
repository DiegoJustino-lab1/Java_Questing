class Lamp {
    private boolean isOn;
    private boolean isHot;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void heatUp() {
        isHot = true;
    }

    public void coolDown() {
        isHot = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isHot() {
        return isHot;
    }
}

class Switch {
    private Lamp lamp;

    public Switch(Lamp lamp) {
        this.lamp = lamp;
    }

    public void flip() {
        if (lamp.isOn()) {
            lamp.turnOff();
        } else {
            lamp.turnOn();
            lamp.heatUp();
        }
    }
}