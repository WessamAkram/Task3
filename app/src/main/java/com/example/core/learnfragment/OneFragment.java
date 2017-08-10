package com.example.core.learnfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DefaultItemAnimator;
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
public class OneFragment extends Fragment {
    private RecyclerView recyclerView;

    public OneFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View oneFragment = inflater.inflate(R.layout.fragment_one, container, false);

        RecyclerView recyclerView = (RecyclerView) oneFragment.findViewById(R.id.recycler1_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        CallAdapter adapter = new CallAdapter(getActivity(),createDummyData());

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
      //  recyclerView.getAdapter().notifyDataSetChanged();

        return oneFragment;
    }

    private List<CallData> createDummyData() {

        List<CallData> persons = new ArrayList<>();

        CallData p = new CallData();
        p.setName("Amany");
        p.setDescription("Hey my name is AMany Akram and Iam php developer");
        p.setImg("R.drawable/chrome");

        CallData p2 = new CallData();
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
