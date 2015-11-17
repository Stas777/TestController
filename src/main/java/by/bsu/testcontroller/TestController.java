package by.bsu.testcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getTest(@PathVariable String name, ModelMap model) {

        model.addAttribute("test", name);
        return "list";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDefaultTest(ModelMap model) {

        model.addAttribute("test", "this is default test");
        return "list";

    }

}