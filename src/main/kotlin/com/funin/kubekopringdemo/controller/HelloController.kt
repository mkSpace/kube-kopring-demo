import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {

    @ResponseBody
    @GetMapping("/")
    fun hello(): String {
        return "Hello-world!"
    }
}