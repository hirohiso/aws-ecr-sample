package hirohiso.demo.aws.aws_ecr_sample.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApi {
    @RequestMapping("/sample")
    public String sample(){
        return "Hello Aws Ecr Sample";
    }
}
