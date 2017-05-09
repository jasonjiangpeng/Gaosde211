package com.junhui.gaode.volley;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.Cache;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.junhui.gaode.R;

/**
 * Created by 骏辉出行 on 2017/5/8.
 */

public class Volley_Act extends AppCompatActivity {
    String httpAddress="http://blog.csdn.net/guolin_blog/article/details/17482095/";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volley_test);
        RequestQueue  requestQueue = Volley.newRequestQueue(this);
        StringRequest  stringRequest=new StringRequest(httpAddress, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error.networkResponse.statusCode);
            }
        });
 
        requestQueue.add(stringRequest);

    }
}
