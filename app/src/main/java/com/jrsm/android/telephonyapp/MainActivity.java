package com.jrsm.android.telephonyapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TelephonyManager telManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);

        telManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);

        StringBuilder sb = new StringBuilder();
        sb.append("IMEI: ").append(telManager.getDeviceId()).append("\n");
        sb.append("Version de software del dispositivo: ").append(telManager.getDeviceSoftwareVersion()).append("\n");
        sb.append("Número telefonico: ").append(telManager.getLine1Number()).append("\n");
        sb.append("Red país ISO:").append(telManager.getNetworkCountryIso()).append("\n");
        sb.append("Nombre del operador de red: ").append(telManager.getNetworkOperatorName()).append("\n");
        sb.append("Sim país ISO:").append(telManager.getSimCountryIso()).append("\n");
        sb.append("Sim operador:").append(telManager.getSimOperator()).append("\n");
        sb.append("Sim operador nombre:").append(telManager.getSimOperatorName()).append("\n");
        sb.append("ICCID:").append(telManager.getSimSerialNumber()).append("\n");
        sb.append("Id suscriptor:").append(telManager.getSubscriberId()).append("\n");
        sb.append("Etiquta buzón de voz:").append(telManager.getVoiceMailAlphaTag()).append("\n");
        sb.append("Marcación buzón de voz:").append(telManager.getVoiceMailNumber()).append("\n");




        tv1.setText(sb.toString());

    }
}
