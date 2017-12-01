package com.example.demo.recu.dao;

import com.example.demo.recu.enty.enty;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 张超 on 2017/11/30.
 */
@Repository
public interface zcer {
    List<enty> selee(@Param("name")String name);
    List<enty> findDatacleanAll(@Param("name")String name);
}
