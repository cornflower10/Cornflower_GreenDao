package cornflower.com;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by xiejingbao on 2017/5/14.
 */
@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;

    private int sex;

    private String name;

    private String phone;

    @Transient //忽略，不持久化
    private String address;

    @Generated(hash = 2024091942)
    public User(Long id, int sex, String name, String phone) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.phone = phone;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSex() {
        return this.sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
