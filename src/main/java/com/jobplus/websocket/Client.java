package com.jobplus.websocket;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.net.URI;

public class Client {
   /* public static void main(String[] args) throws Exception{
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet();
        request.setHeader("ConnectionFrom", "back");
        request.setURI(new URI("http://localhost:7397/websocket?receiver=11&&content=okok"));
        HttpResponse response = client.execute(request);
        System.out.println("----------------------------------------");
        System.out.println(response.getStatusLine());
        if (response != null) {
            System.out.println("Response content length: " + response.getEntity());
        }
        System.out.println("success");
    }*/
}
