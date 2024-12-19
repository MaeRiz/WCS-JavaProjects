public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName() + " takes off in the sky.");
    }

    @Override
    public void glide() {
        System.out.println(this.getName() + " glide into the air.");
    }

    @Override
    public void land() {
        if (this.getAltitude() > 1) {
            System.out.println(this.getName() + " is too high, it can't land.");
        } else {
            System.out.println(this.getName() + " lands on the ground.");
        }
    }

    @Override
    public int ascend(int meters) {
        this.setAltitude(this.getAltitude()+meters);
        System.out.println(this.getName() + " flies upward, altitude: " + this.getAltitude());
        return meters;
    }

    @Override
    public int descend(int meters) {
        this.setAltitude(this.getAltitude()-meters);
        System.out.println(this.getName() + " flies downward, altitude: " + this.getAltitude());
        return meters;
    }

    public int getAltitude() {
        return altitude;
    }

    private void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
