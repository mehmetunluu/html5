package com.mehmetunluu.ajax.ajaxdemo.controller;

import com.mehmetunluu.ajax.ajaxdemo.model.Personel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TCMEUNLU on 1/10/2018.
 */
@RestController
public class AjaxController {

    private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);

    @CrossOrigin
    @RequestMapping(value = "/personel", method = RequestMethod.GET, produces = {"application/json; charset=utf-8"})
    public List<Personel> getPersonel() {
        logger.info("istek geldi");
        List<Personel> personels = new ArrayList<>();
        personels.add(new Personel("mehmet", "unlu", "patron"));
        return personels;
    }
}
