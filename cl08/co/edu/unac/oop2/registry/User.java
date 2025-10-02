package co.edu.unac.oop2.registry;

public class User {

    private String names;
    private String lastNames;
    private String idType;
    private String id;
    private String password;

    public User(String names, String lastNames, String idType, String id, String password) {
        this.names = names;
        this.lastNames = lastNames;
        this.idType = idType;
        this.id = id;
        this.password = password;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
