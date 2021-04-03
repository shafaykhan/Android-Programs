package com.shafay.hp.learn_android.fragements;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.shafay.hp.learn_android.R;

import androidx.fragment.app.Fragment;

public class InformationFragment extends Fragment {

    Button btnGithub, btnOtherApp, btnFeedback, btnRateUs, btnShareApp, btnPrivacyPolicy;

    public InformationFragment() {

    }

    public static InformationFragment newInstance(String param1, String param2) {
        InformationFragment fragment = new InformationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.information_fragement, container, false);

        btnGithub = view.findViewById(R.id.buttonGithub);
        btnGithub.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/shafaykhan"));
            startActivity(i);

        });

        btnOtherApp = view.findViewById(R.id.buttonOtherApp);
        btnOtherApp.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/developer?id=Techlogix+Developer&hl=en_IN&gl=US"));
            startActivity(i);

        });

        btnFeedback = view.findViewById(R.id.buttonFeedback);
        btnFeedback.setOnClickListener(view1 -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("email"));
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"Shafaykhan007@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback- Basic Android Program");
            intent.putExtra(Intent.EXTRA_TEXT, "");
            intent.setType("message/rfc822");
            Intent chooser = Intent.createChooser(intent, "Select Email/Gmail For Feedback");
            startActivity(chooser);
        });

        btnRateUs = view.findViewById(R.id.buttonRateUs);
        btnRateUs.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.shafay.hp.learn_android"));
            startActivity(i);


        });

        btnShareApp = view.findViewById(R.id.buttonShareApp);
        btnShareApp.setOnClickListener(v -> {
            String shareBody = "https://play.google.com/store/apps/details?id=com.shafay.hp.learn_android";
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Basic Android Program");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, "Basic Android Program - Open it in Google Play Store to Download the Application " + shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
        });

        btnPrivacyPolicy = view.findViewById(R.id.buttonPrivacyPolicy);
        btnPrivacyPolicy.setOnClickListener(v -> {
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://basicandroidprogram.blogspot.com/p/learn-android-privacy-policy.html?m=1"));
            startActivity(i);

        });

        return view;
    }


}