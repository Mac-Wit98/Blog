package pl.akademiakodu.springExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.springExample.Model.Mem;

@Controller
public class MemController {
    @GetMapping("/mem")
    public String add(){
        return "mem";
    }
    @GetMapping("/image")
    public String show(@ModelAttribute Mem mem,
                       ModelMap modelMap){
        modelMap.put("mem",mem);
        return  "image";

    }
}
