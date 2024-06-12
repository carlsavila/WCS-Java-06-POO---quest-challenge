public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String firstaname) {
        this.firstname = firstaname;
        this.aware = false;
    }

    public Wilder(String firstaname, boolean aware) {
        this.firstname = firstaname;
        this.aware = aware;
    }
    public String getFirstname() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }


    public String whoAmI() {
        if (this.getAware()) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware ! ";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware !";
        }
    }

}
