/**
 * Created by irufus on 2/19/15.
 */
package com.coinbase.exchange.api.exchange;

import org.springframework.http.HttpEntity;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public interface CoinbaseExchange {
    /**
     * @return
     * @throws IOException
     * @throws InvalidKeyException
     * @throws NoSuchAlgorithmException
     * @throws CloneNotSupportedException
     */
    public String getBaseUrl();
    public HttpEntity<String> securityHeaders(String endpoint, String method, String body) throws InvalidKeyException, CloneNotSupportedException;
    public String generateSignature(String timestamp, String method, String endpoint_url, String body) throws InvalidKeyException, CloneNotSupportedException;

}
