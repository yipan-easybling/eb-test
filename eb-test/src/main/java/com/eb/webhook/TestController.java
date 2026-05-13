package com.eb.webhook;

import com.eb.webhook.entity.WebhookUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        WebhookUser webhookUser = new WebhookUser();
        webhookUser.setEmail("110@163.com");
        return "test -----v2.0.0";
    }
}
