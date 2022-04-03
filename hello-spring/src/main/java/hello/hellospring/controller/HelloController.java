package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // get & post
    @GetMapping("hello")
    public String hello(Model model) {
        // ${data}에 hello라는 value값 적용
        model.addAttribute("data", "hello!!");
        // hello.html 반환
        return "hello";
    }

    @GetMapping("hello-mvc")
    //    http://localhost:8080/hello-mvc?name= (value)
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; //"hello spring"
    }

}
