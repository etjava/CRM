package com.et;

import okhttp3.*;
import org.json.JSONObject;

import java.io.*;
public class TestAi {

    static final OkHttpClient HTTP_CLIENT = new OkHttpClient().newBuilder().build();

    public static void main(String []args) throws IOException{
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "vue动态路由怎么创建？");
        Request request = new Request.Builder()
                .url("https://aip.baidubce.com/oauth/2.0/token?client_id=LGyv1tzC0MeWfcr2E9VoFjht&client_secret=Uw482EOrsmDF7uhWGHlprzQrSUqYoekH&grant_type=client_credentials")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        Response response = HTTP_CLIENT.newCall(request).execute();
        System.out.println(response.body().string());
    }

}
