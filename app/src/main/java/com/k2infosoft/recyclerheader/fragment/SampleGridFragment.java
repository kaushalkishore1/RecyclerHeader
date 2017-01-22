/*
 * Copyright 2015 Bartosz Lipinski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.k2infosoft.recyclerheader.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.k2infosoft.k2recyclerheader.RecyclerViewHeader;
import com.k2infosoft.recyclerheader.R;
import com.k2infosoft.recyclerheader.adapter.ColorItemsAdapter;


/*
* @author:kaushal kishore
* @date:22:01:2017
* */
public class SampleGridFragment extends Fragment {

    private RecyclerViewHeader recyclerHeader;
    private RecyclerView recycler;

    public static SampleGridFragment newInstance() {
        SampleGridFragment fragment = new SampleGridFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample, container, false);
        setupViews(view);
        return view;
    }

    private void setupViews(View view) {
        recycler = (RecyclerView) view.findViewById(R.id.recycler);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(new ColorItemsAdapter(getActivity(), 21));

        recyclerHeader = (RecyclerViewHeader) view.findViewById(R.id.header);
        recyclerHeader.attachTo(recycler);
    }

}
