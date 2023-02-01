package com.zerobase.cms.user.client;

import com.zerobase.cms.user.client.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {
        mailgunClient.sendEmail(SendMailForm.builder()
            .from("zerobase-test@gmail.com")
            .to("sis02064@daum.net")
            .text("메일 테스트")
            .subject("TEST")
            .build());
    }
}
