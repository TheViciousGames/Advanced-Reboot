package com.theviciousgames.advancedreboot.UI;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.theviciousgames.advancedreboot.Utils.Tools;
import com.theviciousgames.advancedreboot.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private RewardedAd rewardedAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(declareVars());
    }

    protected View declareVars() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        Tools.lockPortrait(this);
        buttonFunctions();
        return binding.getRoot();
    }

    protected void buttonFunctions() {
        binding.simpleRebootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.rebootSimple();
            }
        });
        binding.recoveryRebootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.rebootRecovery();
            }
        });
        binding.bootloaderRebootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.rebootBootloader();
            }
        });
        binding.fastbootRebootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tools.rebootFastboot();
            }
        });
    }


}