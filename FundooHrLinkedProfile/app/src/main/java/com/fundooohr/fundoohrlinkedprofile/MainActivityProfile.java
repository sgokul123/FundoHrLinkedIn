package com.fundooohr.fundoohrlinkedprofile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.CardView;
import android.view.View;

import com.fundooohr.fundoohrlinkedprofile.base.BaseActivity;

public class MainActivityProfile extends BaseActivity implements View.OnClickListener {
    AppCompatImageView imageViewAddExperience,imageViewEditExperience;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);
        init();
        setListener();
    }

    @Override
    public void init() {
        imageViewEditExperience= (AppCompatImageView) findViewById(R.id.image_view_edit);
       // cardView= (CardView) findViewById(R.id.cardview_profile);
    }

    @Override
    public void setListener() {
        imageViewEditExperience.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.image_view_edit:
                Intent intent=new Intent(this,ProfileActivity.class);
                startActivity(intent);
                break;
            default:

                break;
        }
    }
}
