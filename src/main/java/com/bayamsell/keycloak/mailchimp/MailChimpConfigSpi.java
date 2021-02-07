package com.bayamsell.keycloak.mailchimp;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class MailChimpConfigSpi implements Spi {

    @Override
    public boolean isInternal() {
        return false;
    }

    @Override
    public String getName() {
        return "mailchimp-config";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return MailChimpConfigService.class;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return MailChimpConfigFactory.class;
    }

}
