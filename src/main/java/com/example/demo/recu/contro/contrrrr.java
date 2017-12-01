package com.example.demo.recu.contro;

import com.example.demo.recu.enty.enty;
import com.example.demo.recu.serv.server;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 张超 on 2017/11/30.
 */
@RestController
@RequestMapping(value="/train")
@Api("ler相关api")
public class contrrrr {
   @Resource
   private server ser;


    @ApiOperation(value = "训练", notes = "")
    @RequestMapping(value = "/train", method = RequestMethod.GET)
    public List<enty> train(@RequestParam String ss) {
        return ser.sql(ss);
    }
    @ApiOperation(value = "dataclean", notes = "")
    @RequestMapping(value = "/dataclean", method = RequestMethod.GET)
    public List<enty> dataclean(@RequestParam String ss) {
        return ser.finddataclean(ss);
    }
}
