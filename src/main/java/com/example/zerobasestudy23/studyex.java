package com.example.zerobasestudy23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class studyex {


    public static void main(String[] args) throws Exception {
        URL url = new URL("http://openapi.seoul.go.kr:8088/6b47795770647564313035424e485451/json/TbPublicWifiInfo/1/6/");
        URLConnection connection = url.openConnection();

        // `HttpURLConnection` connection = (HttpURLConnection) url.openConnection();
        // connection.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}


