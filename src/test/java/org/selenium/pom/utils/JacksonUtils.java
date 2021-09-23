package org.selenium.pom.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.selenium.pom.objects.BillingAddress;

import java.io.IOException;
import java.io.InputStream;

public class JacksonUtils {

    public static BillingAddress deserialization(InputStream is, BillingAddress billingAddress) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
     return objectMapper.readValue(is, billingAddress.getClass());
    }
}
