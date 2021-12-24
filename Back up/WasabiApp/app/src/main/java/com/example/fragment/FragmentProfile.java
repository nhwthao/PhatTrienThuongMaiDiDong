package com.example.fragment;

import static android.app.appsearch.AppSearchResult.RESULT_OK;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.example.wasabiapp.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class FragmentProfile extends Fragment {

    LinearLayout layoutDetailProfile, layoutEditProfile, layoutHealthTracking, layoutHealthProfile;
    TextView txtNameProfile, txtSDTProfile,txtDiaChiProfile;
    ImageButton imbChangeAvatarProfile;
    ImageView imvAvatarProfile;

    LinearLayout sheetOpenCamera, sheetOpenGallery;
    BottomSheetDialog sheetDialog;
    ActivityResultLauncher<Intent>activityResultLauncher;
    boolean isCamera;

    public FragmentProfile(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        layoutDetailProfile = view.findViewById(R.id.layoutDetailProfile);
        layoutEditProfile = view.findViewById(R.id.layoutEditProfile);
        layoutHealthTracking = view.findViewById(R.id.layoutHealthTracking);
        layoutHealthProfile = view.findViewById(R.id.layoutHealthProfile);

        txtNameProfile = view.findViewById(R.id.txtNameProfile);
        txtSDTProfile = view.findViewById(R.id.txtSDTProfile);
        txtDiaChiProfile = view.findViewById(R.id.txtDiaChiProfile);

        imbChangeAvatarProfile = view.findViewById(R.id.imbChangeAvatarProfile);
        imvAvatarProfile = view.findViewById(R.id.imvAvatarProfile);

        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if(result.getResultCode() == RESULT_OK && result.getData() != null){
                    if(isCamera){
                        Bitmap bitmap = (Bitmap)result.getData().getExtras().get("data");
                        imvAvatarProfile.setImageBitmap(bitmap);
                    }else
                        {
                        Uri uri = result.getData().getData();
                        if(uri != null){
                            try {
                                InputStream inputStream = getActivity().getContentResolver().openInputStream(uri);
                                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                                imvAvatarProfile.setImageBitmap(bitmap);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });

        addEvents();
        createSheetDialog();
        getInformation();
        return view;

    }

    private void addEvents() {
        layoutDetailProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentProfileDetails fragmentProfileDetails = new FragmentProfileDetails();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frFragmentProfile,fragmentProfileDetails );
                transaction.commit();
            }
        });
        layoutEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentEditProfile fragmentEditProfile = new FragmentEditProfile();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frFragmentProfile, fragmentEditProfile);
                transaction.commit();
            }
        });
        layoutHealthTracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentHealthTracking fragmentHealthTracking = new FragmentHealthTracking();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frFragmentProfile, fragmentHealthTracking);
                transaction.commit();
            }
        });
        layoutHealthProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentHealthProfile fragmentHealthProfile = new FragmentHealthProfile();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frFragmentProfile, fragmentHealthProfile);
                transaction.commit();
            }
        });
        imbChangeAvatarProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sheetDialog.show();


            }
        });
    }
    private void createSheetDialog() {
        if(sheetDialog==null){
            View view = LayoutInflater.from(this.getActivity()).inflate(R.layout.bottom_sheet,null);
            sheetOpenCamera = view.findViewById(R.id.sheetOpenCamera);
            sheetOpenGallery = view.findViewById(R.id.sheetOpenGallery);
            sheetOpenCamera.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    isCamera = true;
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    activityResultLauncher.launch(intent);
                    sheetDialog.dismiss();
                }
            });
            sheetOpenGallery.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    isCamera = false;
                    Intent intent = new Intent(Intent.ACTION_PICK);
                    intent.setType("image/*");
                    activityResultLauncher.launch(intent);
                    sheetDialog.dismiss();
                }
            });
            sheetDialog = new BottomSheetDialog(this.getActivity());
            sheetDialog.setContentView(view);
        }

    }

    private void getInformation() {
        Bundle bundle = getArguments();
        if(bundle!=null){
            txtNameProfile.setText(bundle.getString("nameEP"));
            txtSDTProfile.setText(bundle.getString("SDTEP"));
            txtDiaChiProfile.setText(bundle.getString("diaChiEP"));
        }

    }
}
