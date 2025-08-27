package com.example.arkitektura.activity;

import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.arkitektura.R;
import com.google.ar.core.Anchor;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.TransformableNode;

public class ARActivity extends AppCompatActivity {

    private ArFragment arFragment;
    private String modelPath; // store model path

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ar);

        // Get model path from intent
        modelPath = getIntent().getStringExtra("MODEL_PATH");
        if (modelPath == null) {
            modelPath = "file:///android_asset/models/cat.glb"; // fallback
        }

        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arFragment);

        // Tap on plane to place model
        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
            Anchor anchor = hitResult.createAnchor();
            placeModel(anchor, modelPath);
        });
    }

    private void placeModel(Anchor anchor, String modelPath) {
        Uri uri = Uri.parse(modelPath);
        System.out.println("Loading model from: " + uri);

        ModelRenderable.builder()
                .setSource(this, uri)
                .setIsFilamentGltf(true)
                .build()
                .thenAccept(renderable -> {
                    AnchorNode anchorNode = new AnchorNode(anchor);
                    TransformableNode node = new TransformableNode(arFragment.getTransformationSystem());
                    node.setParent(anchorNode);
                    node.setRenderable(renderable);
                    arFragment.getArSceneView().getScene().addChild(anchorNode);
                    node.select();
                })
                .exceptionally(throwable -> {
                    throwable.printStackTrace();
                    return null;
                });
    }
}
