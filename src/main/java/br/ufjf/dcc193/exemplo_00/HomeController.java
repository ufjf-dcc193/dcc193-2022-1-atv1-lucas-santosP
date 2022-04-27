package br.ufjf.dcc193.exemplo_00;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping({ "", "index.html" })
    public String index(){
        return "home.jsp";
    }
}
