package com.critc.model;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
public class Staff {
    private int id;//员工id
    private String name;//员工姓名

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Staff{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
