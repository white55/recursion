package com.example.demo.recu.serv;

import com.example.demo.recu.dao.zcer;
import com.example.demo.recu.enty.enty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 张超 on 2017/11/30.
 */
@Service
public class server {
    @Resource
    private zcer zc;
    public List<enty> sql(String ss) {
        return zc.selee(ss);
    }
    public List<enty> finddataclean(String name){
        return  zc.findDatacleanAll(name);
    }
}
