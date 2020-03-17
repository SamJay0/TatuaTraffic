package com.devjay.tatuatraffic.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.devjay.tatuatraffic.ChatRoom;

public class HomeCollectionAdapter extends FragmentStateAdapter {

    private static final int HOME_ITEM_SIZE = 2;
    // constructor
    public HomeCollectionAdapter(Fragment fragment){
        super(fragment);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Return a new fragment instance
        Fragment fragment = new ChatRoom();
        Bundle args = new Bundle();
        args.putInt(ChatRoom.ARG_OBJECT,position+1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return HOME_ITEM_SIZE;
    }
}
