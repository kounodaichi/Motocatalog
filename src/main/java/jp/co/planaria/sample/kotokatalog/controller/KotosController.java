package jp.co.planaria.sample.kotokatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class KotosController {

   @RequestMapping("/hello")
   public String hello(){
    return "text";
  }

}

