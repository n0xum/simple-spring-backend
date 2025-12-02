package n0xum.simple.backend.accounting.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello", description = "Simple Hello World API")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Get Hello World message", description = "Returns a simple Hello World greeting")
    public String hello() {
        return "Hello World";
    }
}
