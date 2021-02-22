package prueba.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hola {
    
        @RequestMapping("/")
        public String yatusa(){
            return ("FUNCIONA KLK");
        }
}
