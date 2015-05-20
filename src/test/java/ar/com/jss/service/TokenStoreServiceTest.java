package ar.com.jss.service;

import ar.com.jss.domain.TokenType;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenStoreServiceTest {

    @Test
    public void _void() {
        TokenType token = new TokenType();
        token = new TokenStoreService().getHelloPort().hello(token);
    }
}