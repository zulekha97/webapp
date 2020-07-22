package loginBean;

public class LoginBean {
    private String pass;
    private String name;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean validate() {
        if (pass.equals("123")) {
            return true;
        } else {
            return false;
        }

    }
}