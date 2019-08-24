package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by at on on 17-Aug-19.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index.html"})
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/oups")
    public String oups() {

        return "notImplemented";
    }
}
