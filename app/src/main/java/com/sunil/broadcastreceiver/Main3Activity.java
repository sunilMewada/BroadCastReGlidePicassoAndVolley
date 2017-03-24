package com.sunil.broadcastreceiver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextUrl;
    private Button buttonLoad;
    private NetworkImageView imageView;
    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTextUrl = (EditText)findViewById(R.id.editTextUrl);
        buttonLoad = (Button)findViewById(R.id.buttonLoad);
        imageView = (NetworkImageView)findViewById(R.id.imageView);

        buttonLoad.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == buttonLoad){
            loadImage();
        }
    }
    private void loadImage(){
        String url = editTextUrl.getText().toString().trim();
        if (url.equals("")){
            Toast.makeText(this,"Please enter a Uri",Toast.LENGTH_SHORT).show();
            return;
        }
        imageLoader = CustomVolleyRequest.getInstance(this.getApplicationContext()).getImageLoader();
        imageLoader.get(url,ImageLoader.getImageListener(imageView,R.drawable.img,android.R.drawable.ic_dialog_alert));
        imageView.setImageUrl(url,imageLoader);
    }
}
