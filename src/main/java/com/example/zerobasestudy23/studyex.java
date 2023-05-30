package com.example.zerobasestudy23;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.net.URI;

class studyex
{

        public static void main(String[] args) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpUriRequest httpget = RequestBuilder.get()
                    .setUri(new URI("http://openapi.seoul.go.kr:8088/6b47795770647564313035424e485451/json/TbPublicWifiInfo/1/6/"))
                    .addParameter("page", "1")
                    .build();

            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                System.out.println(EntityUtils.toString(response.getEntity()));
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
    }
    }
