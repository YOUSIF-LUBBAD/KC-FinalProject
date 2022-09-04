package com.example.petadoptioncenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class petAdapter extends ArrayAdapter<pets> {

    List<pets> itemsList;

    public petAdapter(@NonNull Context context, int resource, @NonNull List<pets> objects) {
        super(context, resource, objects);
        itemsList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.pet_row, parent, false);
        pets currentItem = itemsList.get(position);

        TextView PetName = v.findViewById(R.id.PetName);
        TextView PetAge = v.findViewById(R.id.PetAge);
        ImageView PetImage = v.findViewById(R.id.PetImage);

        PetName.setText(currentItem.getPetName());
        PetAge.setText(String.valueOf(currentItem.getPetAge()));
        PetImage.setImageResource(currentItem.getPetImage());

        ImageView delet = v.findViewById(R.id.Delete);

        delet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemsList.remove(position);
                notifyDataSetChanged();
            }
        });

        return v;
    }
}

