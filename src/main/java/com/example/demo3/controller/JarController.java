package com.example.demo3.controller;

import com.example.demo3.controller.model.JarDepositRequest;
import com.example.demo3.user_case.CompareJars;
import com.example.demo3.user_case.ReceiveLink;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JarController {

    @RequestMapping("/receive")
    public ResponseEntity<Boolean> receiveJarLink(JarDepositRequest jarDepositRequest) {
        ReceiveLink receiveLink = new ReceiveLink(jarDepositRequest.userId(), jarDepositRequest.jarLink1(), jarDepositRequest.jarLink2());
        receiveLink.execute();
        return ResponseEntity.ok(true);
    }

    @RequestMapping("/compare")
    public ResponseEntity<Boolean> compareJars(String jarLink1, String jarLink2) {
        CompareJars compareJars = new CompareJars(jarLink1, jarLink2);
        compareJars.execute();

        return ResponseEntity.ok(true);
    }

}
