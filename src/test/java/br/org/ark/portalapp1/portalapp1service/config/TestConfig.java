package br.org.ark.portalapp1.portalapp1service.config;

import br.org.ark.portalapp1.portalapp1service.mock.ApplicationsControllerClientMock;
import org.microportal.api.client.ApplicationsControllerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public ApplicationsControllerClient getApplicationsControllerClient() {
        return new ApplicationsControllerClientMock();
    }
}
