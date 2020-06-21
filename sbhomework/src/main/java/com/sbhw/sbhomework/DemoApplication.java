package com.sbhw.sbhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Controller
	public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
		return "index.html";
	}
	
	@RequestMapping(value="/new")
	public String another() {
	return "anotherpage.html";
	}
	@RequestMapping(value="/last")
	public String last() {
    return "lastone.html";
}

}


}
