package com.bogdanutanu.springboot_example.controller;

import com.bogdanutanu.springboot_example.beans.MongoBean;
import com.bogdanutanu.springboot_example.model.Tune;
import com.bogdanutanu.springboot_example.model.TuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HeyThereController {

    @Autowired
    private MongoBean mongoBean;

    @Autowired
    private TuneRepository tuneRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    @ResponseBody
    String home() {
        return mongoBean.dbName();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tune")
    @ResponseBody
    List<Tune> getAll(){
        return tuneRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tune")
    @ResponseBody
    Tune insert(@RequestBody Tune tune){
        return tuneRepository.save(tune);
    }
}
