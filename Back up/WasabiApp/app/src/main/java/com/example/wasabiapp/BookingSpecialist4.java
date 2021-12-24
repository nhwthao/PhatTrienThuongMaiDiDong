package com.example.wasabiapp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class BookingSpecialist4 extends AppCompatActivity {

    EditText edtName, edtDescription,edtDay,edtHour;
    Button btnDatLich;
    ImageView imvPhoto;
    ImageButton imbGallery;


    ActivityResultLauncher<Intent> activityResultLauncher;
    boolean isCamera;
    public static MyDataBaseBooking db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_specialist4);
        linkView();
        addEvents();
        db = new MyDataBaseBooking(this);

        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                    if (isCamera == true) {
                        Bitmap bitmap = (Bitmap) result.getData().getExtras().get("data");
                        imvPhoto.setImageBitmap(bitmap);

                    } else {

                        Uri uri = result.getData().getData();
                        if (uri != null) {

                            try {

                                InputStream inputStream = getContentResolver().openInputStream(uri);
                                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                                imvPhoto.setImageBitmap(bitmap);
                            }catch (FileNotFoundException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }

            }

        });
    }

    private void linkView() {
        edtName = findViewById(R.id.edtName);
        edtDescription = findViewById(R.id.edtDescription);
        edtDay=findViewById(R.id.edtDay);
        edtHour=findViewById(R.id.edtHour);

        imbGallery=findViewById(R.id.imbGallery);
        imvPhoto = findViewById(R.id.imvPhoto);

        btnDatLich=findViewById(R.id.btnDatLich);


    }

    private void addEvents() {
        btnDatLich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Insert data
                String name, day,hour, des;
                name = edtName.getText().toString();
                day = edtDay.getText().toString();
                hour=edtHour.getText().toString();
                des = edtDescription.getText().toString();
                if (!name.equals("")&&!des.equals("")){
                    boolean flag= db.insertData(name,day,hour,des,convertPhoto());
                    if (flag){
                        Toast.makeText(BookingSpecialist4.this, "Success!", Toast.LENGTH_SHORT).show();
                        Intent intent= new Intent(BookingSpecialist4.this,BookingNoticate.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(BookingSpecialist4.this, "Fail!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        imbGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Open Gallery
                isCamera = false;
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                activityResultLauncher.launch(intent);

            }
        });
    }

    private byte[] convertPhoto() {

        BitmapDrawable drawable = (BitmapDrawable) imvPhoto.getDrawable();
        Bitmap bitmap = drawable.getBitmap();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);
        return outputStream.toByteArray();
    }


//    private void createSheetDialog() {
//        if (dialog == null) {
//            View view = LayoutInflater.from(this).inflate(R.layout.bottom_sheet, null);
//            sheetOpenCamera = view.findViewById(R.id.sheetOpenCamera);
//            sheetOpenGallery = view.findViewById(R.id.sheetOpenGallery);
//            sheetOpenCamera.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    //Open Camera
//                    isCamera = true;
//                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                    activityResultLauncher.launch(intent);
//                    dialog.dismiss();
//                }
//            });
//            sheetOpenGallery.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    //Open Gallery
//                    isCamera = false;
//                    Intent intent = new Intent(Intent.ACTION_PICK);
//                    intent.setType("image/*");
//                    activityResultLauncher.launch(intent);
//
//                }
//            });
//            dialog = new BottomSheetDialog(this);
//            dialog.setContentView(view);
//        }
//    }
}