package com.critc.dao;

import com.critc.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
@Repository
public class StaffDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(Staff staff) {
        return jdbcTemplate.update("insert into staff(name) values(?)",
                staff.getName());

    }

    public int update(Staff staff) {
        return jdbcTemplate.update("update  staff SET name=?   WHERE id=?",
                staff.getName(), staff.getId());
    }

    public int delete(int id) {
        return jdbcTemplate.update("DELETE from staff where id=?", id);
    }

    public Staff get(int id) {
        List<Staff> list = jdbcTemplate.query("select * from staff where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Staff.class));
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public List<Staff> list() {
        List<Staff> list = jdbcTemplate.query("select * from staff", new Object[]{}, new BeanPropertyRowMapper(Staff.class));
        return list;
    }
}
