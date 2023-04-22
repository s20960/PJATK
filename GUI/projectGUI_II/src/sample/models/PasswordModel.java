package sample.models;

public class PasswordModel {
    public String name;
    public String password;
    public String category;
    public String URL;

    public PasswordModel(String name, String password, String category, String URL) {
        this.name = name;
        this.password = password;
        this.category = category;
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getCategory() {
        return category;
    }

    public String getURL() {
        return URL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return name+" "+password+" "+category+" "+URL+"\n";
    }
}
