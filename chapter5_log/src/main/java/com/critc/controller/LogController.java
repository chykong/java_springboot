package com.critc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
@RestController
public class LogController {
    private static Logger sysLog = LoggerFactory.getLogger("sysLog");

    @RequestMapping("/log")
    public void log() {
        sysLog.info("日志成功输出");
    }
}
