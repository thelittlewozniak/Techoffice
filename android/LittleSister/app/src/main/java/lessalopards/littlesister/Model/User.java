package lessalopards.littlesister.Model;

public class User {

    private String id;
    private String email;
    private String name;
    private boolean ghostmode;
    private int positionId;

    public User(String id, String email, String name, boolean ghostmode, int positionId) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.ghostmode = ghostmode;
        this.positionId = positionId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGhostmode() {
        return ghostmode;
    }

    public void setGhostmode(boolean ghostmode) {
        this.ghostmode = ghostmode;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }
}
