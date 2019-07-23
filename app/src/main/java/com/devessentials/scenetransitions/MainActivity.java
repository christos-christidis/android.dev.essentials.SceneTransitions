package com.devessentials.scenetransitions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    private Scene mScene1;
    private Scene mScene2;
    private Transition mTransition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup rootContainer = findViewById(R.id.root_container);
        mScene1 = Scene.getSceneForLayout(rootContainer, R.layout.scene1_layout, this);
        mScene2 = Scene.getSceneForLayout(rootContainer, R.layout.scene2_layout, this);

        mScene1.enter();

        mTransition = TransitionInflater.from(this).inflateTransition(R.transition.transition);
    }

    public void goToScene1(View view) {
        TransitionManager.go(mScene1, mTransition);
    }

    public void goToScene2(View view) {
        TransitionManager.go(mScene2, mTransition);
    }
}
