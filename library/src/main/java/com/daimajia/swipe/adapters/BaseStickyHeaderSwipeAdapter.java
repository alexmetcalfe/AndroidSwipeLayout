package com.daimajia.swipe.adapters;

import android.view.View;
import android.view.ViewGroup;

import com.emilsjolander.components.stickylistheaders.StickyListHeadersAdapter;


/**
 * Created by alex on 26/09/2014.
 */
public abstract class BaseStickyHeaderSwipeAdapter extends BaseSwipeAdapter implements StickyListHeadersAdapter {

    @Override
    public abstract View getHeaderView(int i, View view, ViewGroup viewGroup);

    @Override
    public abstract long getHeaderId(int i);
}
