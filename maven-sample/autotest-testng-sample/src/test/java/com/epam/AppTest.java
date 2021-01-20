package com.epam;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


/**
 * Simple tests on Petclinic app using testng
 */
public class AppTest 
{
    private final String pathToServer = "http://localhost:8080";
    private final CloseableHttpClient httpclient = HttpClients.createDefault();

    @Test
    public void getOwner4InfoPage() throws IOException {

        HttpGet httpGet = new HttpGet(pathToServer + "/owners/4");
        CloseableHttpResponse response = httpclient.execute(httpGet);
        Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
    }

    //TODO Seems this test doesn't work
//    @Test
//    public void getOwner4EditPage() throws IOException {
//
//        HttpGet httpGet = new HttpGet(pathToServer + "/owners/4/edit");
//        CloseableHttpResponse response = httpclient.execute(httpGet);
//        Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
//    }

    @Test
    public void getHomePage() throws IOException {
        HttpGet httpGet = new HttpGet(pathToServer + "/");
        CloseableHttpResponse response = httpclient.execute(httpGet);
        Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
    }

}
