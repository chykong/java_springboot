package com.critc.repository;

import com.critc.model.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
public interface  StaffRepository extends MongoRepository<Staff, String> {
    public Staff findByName(String name);
}
