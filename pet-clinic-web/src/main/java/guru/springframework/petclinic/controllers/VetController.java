package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by at on on 17-Aug-19.
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model){

        return "vets/index";
    }
}