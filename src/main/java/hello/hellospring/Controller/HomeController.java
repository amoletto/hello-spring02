package hello.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //testgdfgdfgdfgd
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
