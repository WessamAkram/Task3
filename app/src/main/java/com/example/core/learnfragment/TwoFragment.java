package com.example.core.learnfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {

public RecyclerView rv;
    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View TwoFragment = inflater.inflate(R.layout.fragment_two, container, false);

        RecyclerView recyclerView = (RecyclerView) TwoFragment.findViewById(R.id.recycler2_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return TwoFragment;
}
    private List<ChatData> createDummyData() {

        List<ChatData> persons = new ArrayList<>();

       ChatData p = new  ChatData();
        p.setName("Amany");
        p.setDescription("Hey my name is AMany Akram and Iam php developer");
        p.setImg("R.drawable/chrome");

        ChatData p2 = new ChatData();
        p2.setName("Wessam ");
        p2.setDescription("Hey my name is Wessam and Iam an android developer");
        p2.setImg("R.drawable/drive");
        persons.add(p);
        persons.add(p2);
        persons.add(p);
        persons.add(p2);
        persons.add(p);
        persons.add(p);
        persons.add(p2);
        persons.add(p);
        persons.add(p);
        persons.add(p2);
        persons.add(p2);



        return persons;
    }


}
