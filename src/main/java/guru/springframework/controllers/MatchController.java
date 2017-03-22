package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import guru.springframework.model.User;
import org.springframework.ui.ModelMap;
/**
 * Created by aacuna on 3/20/17.
 */
@Controller
public class MatchController {
    @RequestMapping("/match")
    public String match(ModelMap modelMap){
        User user = new User("Alison", "Acuna");
        modelMap.put("user", user);
        return "match";
    }

}