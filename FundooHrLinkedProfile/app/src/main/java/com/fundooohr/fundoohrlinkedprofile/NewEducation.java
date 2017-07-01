package com.fundooohr.fundoohrlinkedprofile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;

/**
 * Created by bridgeit on 23/6/17.
 */

public class NewEducation extends AppCompatActivity implements View.OnClickListener {
    AppCompatEditText schoolEditText,degreeEditText,fieldofStudyEditText,gradeEditText,activityEditText,descriptionEditText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_new_education);
        initView();

    }

    private void initView() {
        schoolEditText= (AppCompatEditText) findViewById(R.id.school_editText);
        degreeEditText= (AppCompatEditText) findViewById(R.id.degree_editText);
        fieldofStudyEditText= (AppCompatEditText) findViewById(R.id.study_editText);
        gradeEditText= (AppCompatEditText) findViewById(R.id.grade_editText);
        activityEditText= (AppCompatEditText) findViewById(R.id.activities_editText);
        descriptionEditText= (AppCompatEditText) findViewById(R.id.description);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
        }
    }
}
