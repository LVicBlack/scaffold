package cn.vic.trial.shardingsphere.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mixed")
public class MixedController {

    /**
     * 连表查询
     *
     * @return
     */
    @GetMapping("/query/union")
    public String queryUnionTable() {

        return "Hello World!";
    }
}
