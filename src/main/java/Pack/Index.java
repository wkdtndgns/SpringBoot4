package Pack;


import org.springframework.web.bind.annotation.RequestMapping;

public class Index {
    @RequestMapping("/")
    String index() {
        return "index";
    }
}
