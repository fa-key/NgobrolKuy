package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class ProfilePicActivity extends AppCompatActivity {

    private static final String TAG = ProfilePicActivity.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;
    private ImageView avatarImage;
    private TextView cv_lewati;
    private CardView cv_lanjut;




    public void handleChangeAvatar(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, GALLERY_REQUEST_CODE);
    }
    public void handleHomechat(View view) {
        Intent move = new Intent(ProfilePicActivity.this, HomeChat.class);
        startActivity(move);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        avatarImage =(ImageView) findViewById(R.id.profilePic);
        cv_lewati = (TextView) findViewById(R.id.lewati) ;
        cv_lanjut = (CardView) findViewById(R.id.lanjut) ;

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED) {
            return;
        }
        if (requestCode == GALLERY_REQUEST_CODE) {
            if (data != null) {
                try {
                    Uri imageUri = data.getData();
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                    avatarImage.setImageBitmap(bitmap);
                    cv_lewati.setVisibility(View.INVISIBLE);
                    cv_lanjut.setVisibility(View.VISIBLE);

                } catch (IOException e) {
                    Toast.makeText(this, "Can't load image", Toast.LENGTH_SHORT).show();
                    Log.e(TAG, e.getMessage());
                }
            }
        }
    }
}