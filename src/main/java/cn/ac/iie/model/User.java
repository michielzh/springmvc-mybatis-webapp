package cn.ac.iie.model;

public class User {
    private Integer uid;

    private String upassword;

    private Boolean usex;

    private String uname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Boolean getUsex() {
        return usex;
    }

    public void setUsex(Boolean usex) {
        this.usex = usex;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }
}