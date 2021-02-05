package tests;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTests {

    @Test
    void apiTest() {
        ApiConfig apiConfig = ConfigFactory.newInstance().create(ApiConfig.class);
        assertEquals("https://ya.ru", apiConfig.apiUrl());
        assertEquals("yandex", apiConfig.apiLogin());
        assertEquals("kotlin", apiConfig.apiPassword());
    }
}
