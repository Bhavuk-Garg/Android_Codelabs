package com.example.codelab;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.widget.RelativeLayout;

import androidx.navigation.fragment.NavHostFragment;

import com.example.codelab.databinding.FragmentFirstBinding;

import java.util.LinkedList;
import java.util.List;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    public RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @SuppressLint("NewApi")
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView=view.findViewById(R.id.recyclerView);
        LinkedList<String> list=new LinkedList<String>();
        list.add("hello");
        list.add("world");
        list.add("Bhavuk");
        list.add("Garg");
        list.add("Verma");
        list.add("Sharma");
        list.add("hello");
        list.add("world");
        list.add("Bhavuk");
        list.add("Garg");
        list.add("Verma");
        list.add("Sharma");
        list.add("hello");
        list.add("world");
        list.add("Bhavuk");
        list.add("Garg");
        list.add("Verma");
        list.add("Sharma");
        list.add("hello");
        list.add("world");
        list.add("Bhavuk");
        list.add("Garg");
        list.add("Verma");
        list.add("Sharma");
        mAdapter= new WordListAdapter(getContext(),list);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}