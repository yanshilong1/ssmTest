package Mybatis.Master_２.Domain;

/**
 * @Author: yanshilong
 * @Date: 19-2-22 下午2:52
 * @Version 1.0
 */
public class Blog {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private  String  uusername;

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", uusername='" + uusername + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }

    private String upassword;


    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
