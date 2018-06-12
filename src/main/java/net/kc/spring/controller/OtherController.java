package net.kc.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by keshav.chaure on 6/12/2018.
 */
@Controller
public class OtherController {

    @RequestMapping(value = {"/other"}, method = RequestMethod.GET)
    public String getMessage() {
        return "other";
    }
}
