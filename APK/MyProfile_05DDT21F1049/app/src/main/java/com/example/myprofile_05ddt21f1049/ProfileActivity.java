package com.example.myprofile_05ddt21f1049;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvName;
    private ImageView ivProfilePicture;
    private Button btnUpdateProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = findViewById(R.id.tvName);
        ivProfilePicture = findViewById(R.id.ivProfilePicture);
        btnUpdateProfile = findViewById(R.id.btnUpdateProfile);

        String name = getIntent().getStringExtra("name");
        tvName.setText(name);

        btnUpdateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "Your profile has successfully updated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
