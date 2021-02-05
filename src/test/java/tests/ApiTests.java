package tests;

import config.ApiConfigHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTests {

    @Test
    void apiTest() {
        assertEquals("https://ya.ru", ApiConfigHelper.getUrl());
        assertEquals("123qwe123qwe", ApiConfigHelper.getToken());
    }
}
