package de.h_da.fbi.fernbedienung;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    ImageButton btnVolumePlus;
    ImageButton btnVolumeMinus;
    ImageButton btnPower;
    ImageButton btnPip;
    ImageButton btnMute;
    ImageButton btnPause;
    ImageButton btnChanelPlus;
    ImageButton btnChanelMinus;
    ImageButton btnMark;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnChanelPlus = view.findViewById(R.id.plusChannelButton);
        btnMute = view.findViewById(R.id.muteButton);
        btnPause = view.findViewById(R.id.pauseButton);
        btnPower = view.findViewById(R.id.powerButton);
        btnPip = view.findViewById(R.id.pipButton);
        btnChanelMinus = view.findViewById(R.id.minusChannelButton);
        btnVolumePlus = view.findViewById(R.id.plusVolumeButton);
        btnVolumeMinus = view.findViewById(R.id.minusVolumeButton);
        btnMark = view.findViewById(R.id.chanelMarkButton);

        btnVolumeMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Volume -1", Toast.LENGTH_SHORT).show();
            }
        });

        btnChanelMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Chanel -1", Toast.LENGTH_SHORT).show();
            }
        });

        btnChanelPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Chanel +1", Toast.LENGTH_SHORT).show();
            }
        });

        btnMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Volume = 0", Toast.LENGTH_SHORT).show();
            }
        });

        btnVolumePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Volume +1", Toast.LENGTH_SHORT).show();
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Power off", Toast.LENGTH_SHORT).show();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Pause", Toast.LENGTH_SHORT).show();
            }
        });

        btnPip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Picture und Picture mode", Toast.LENGTH_SHORT).show();
            }
        });

        btnMark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Add to Favorite", Toast.LENGTH_SHORT).show();
                btnMark.setImageResource(R.drawable.markiert);
            }
        });

        return view;
    }
}
