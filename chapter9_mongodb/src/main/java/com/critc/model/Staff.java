package com.critc.model;

import org.springframework.data.annotation.Id;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
public class Staff {
    @Id
    private String id;
    private String name;//姓名

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Staff{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Staff(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
