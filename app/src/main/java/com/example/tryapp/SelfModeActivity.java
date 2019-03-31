package com.example.tryapp;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.HttpsCallableResult;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class SelfModeActivity extends AppCompatActivity {

    private Button sendSOS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_mode);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sendSOS = findViewById(R.id.button4);
        sendSOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                SOS mySos = new SOS("C1","P1","CHILD","PARENT","Emergency");
//               new RealTimeDBHandler(SelfModeActivity.this).onCreateReference(mySos);

//                FirebaseFunctions mfunc = FirebaseFunctions.getInstance();
//               try{
//                   Map<String,Object> data= new HashMap<>();
//                   data.put("text","Hello from client");
//                   data.put("push",true);
//                   mfunc.getHttpsCallable("addMessage")
//                           .call(data)
//                           .continueWith(new Continuation<HttpsCallableResult, Object>() {
//                               @Override
//                               public Object then(@NonNull Task<HttpsCallableResult> task) throws Exception {
//                                   HashMap<String,Object> ob = null;
//                                   try {
//
//                                   }catch (Exception e)
//                                   {
//                                       Log.e("mytag",e.getMessage());
//                                   }
//                                  return ob;
//                               }
//                           });
//               }catch (Exception e)
//               {
//                   Log.e("mytag",e.getMessage());
//               }

                SOS sos = new SOS("nCUezDQAsLcXVWUe6Gm5rtwc7Qi1","Yk10MhFrLvQ8JA4og9j2BduAllK2","CHILD","PARENT","EMERGENCY");
                new RealTimeDBHandler(SelfModeActivity.this).onCreateReference(sos);
            }
        });
    }
}
