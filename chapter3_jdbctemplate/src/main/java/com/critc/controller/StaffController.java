package com.critc.controller;

import com.critc.dao.StaffDao;
import com.critc.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
@RestController
public class StaffController {
    @Autowired
    private StaffDao staffDao;

    @RequestMapping("/add")
    public String add(Staff staff) {
        staffDao.add(staff);
        return "新增成功";
    }

    @RequestMapping("/update")
    public String update(Staff staff) {
        staffDao.update(staff);
        return "修改成功";
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        staffDao.delete(id);
        return "删除成功";
    }

    @RequestMapping("/get")
    public String get(int id) {
        Staff staff = staffDao.get(id);
        return staff.toString();
    }

    @RequestMapping("/list")
    public String list() {
        List<Staff> list = staffDao.list();
        return list.toString();
    }
}
