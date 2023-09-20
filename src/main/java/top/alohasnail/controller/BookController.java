package top.alohasnail.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * the first controller to illustrate the simple usage of http or rest reqeust and reply
 */

@Controller
public class BookController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tip", "Hello, Spring Boot!");
        return "hello";
    }

    @GetMapping("/rest")
    @ResponseBody
    public ResponseEntity restIndex() {
        return new ResponseEntity("Welcome to the first Spring Boot App", null, HttpStatus.OK);
    }
}
