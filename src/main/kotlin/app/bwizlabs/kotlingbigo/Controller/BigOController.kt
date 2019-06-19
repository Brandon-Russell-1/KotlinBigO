package app.bwizlabs.kotlingbigo.Controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


//Controller
@CrossOrigin(value = "*", exposedHeaders = ["Content-Disposition"])
@RestController
class BigOController {

    @RequestMapping("/")
    fun Hello(): String {

        return "Hello World"
    }

}