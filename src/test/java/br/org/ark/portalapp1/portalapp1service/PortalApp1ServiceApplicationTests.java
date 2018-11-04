package br.org.ark.portalapp1.portalapp1service;

import br.org.ark.portalapp1.portalapp1service.config.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestConfig.class})
public class PortalApp1ServiceApplicationTests {

    @Test
    public void contextLoads() {
    }
}
