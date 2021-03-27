package sweets;

public abstract class AbstractBar extends AbstractSweet {
    private String packaging;
    public String getPackaging() {
        return packaging;
    }
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }
}
