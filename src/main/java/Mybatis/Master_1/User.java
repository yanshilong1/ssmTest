package Mybatis.Master_1;

/**
 * @Author: yanshilong
 * @Date: 19-2-22 下午12:13
 * @Version 1.0
 */
public class User {
    private int id;
    private  String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private  String password;

    @Override
    public String toString() {
        return "Mybatis.Master_1.User {" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
