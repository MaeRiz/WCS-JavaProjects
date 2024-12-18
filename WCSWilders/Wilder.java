public class Wilder {

    private String firstname;
    private boolean aware;

    Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    public String whoAmI(){
        return "Je m'appelle " + this.firstname + " et je " + (this.aware ? "suis aware" : "ne suis pas aware");
    }

    public void setFirsname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname(){
        return this.firstname;
    }

    public void setAware(boolean aware){
        this.aware = aware;
    }
    public boolean isAware(){
        return this.aware;
    }
}