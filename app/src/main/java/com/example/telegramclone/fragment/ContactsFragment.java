package com.example.telegramclone.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.telegramclone.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

public class ContactsFragment extends Fragment {
    RecyclerView recyclerView;
    List<ListData> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        ContactAdapter adapter = new ContactAdapter(this.getActivity(), list);
        recyclerView.setAdapter(adapter);
        data();
    }

    private void data() {
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
        list.add(new ListData(R.drawable.img1, "Eldor Turgunov", "online"));
    }

}

class ListData {
    int image;
    String name;
    String title;

    public ListData(int image, String name, String title) {
        this.image = image;
        this.name = name;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private final Context context;
    private final List<ListData> contacts;

    public ContactAdapter(Context context, List<ListData> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {
        ListData data = contacts.get(position);
        holder.iv_profile.setImageResource(data.getImage());
        holder.name.setText(data.getName());
        holder.title.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        TextView name;
        TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_profile = itemView.findViewById(R.id.iv_profile);
            name = itemView.findViewById(R.id.name);
            title = itemView.findViewById(R.id.title);
        }
    }
}