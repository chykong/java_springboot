package com.critc.test;

import com.critc.model.Staff;
import com.critc.repository.StaffRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMongodb {
    @Autowired
    private StaffRepository staffRepository;

    @Test
    public void test() {
        staffRepository.deleteAll();
        // save a couple of customers
        staffRepository.save(new Staff("张三"));
        staffRepository.save(new Staff("李四"));

        // fetch all customers
        System.out.println("查询所有数据:");
        System.out.println("-------------------------------");
        for (Staff staff : staffRepository.findAll()) {
            System.out.println(staff);
        }
        // fetch an individual customer
        System.out.println("按姓名查询");
        System.out.println("--------------------------------");
        System.out.println(staffRepository.findByName("张三"));

    }
}
