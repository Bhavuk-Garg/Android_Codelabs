package com.example.codelab;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>{
    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;
    private static final String LOG_TAG=WordListAdapter.class.getSimpleName();
    private static int count=0;
    public WordListAdapter(Context context, LinkedList<String> mWordList) {
        mInflater = LayoutInflater.from(context);

        this.mWordList = mWordList;
    }

    @NonNull
      @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull  ViewGroup viewGroup, int i) {
        count++;
        View mItemView = mInflater.inflate(R.layout.word_list_item,
                null, false);
        return new WordViewHolder(mItemView, this);

    }

    @Override
    public void onBindViewHolder(@NonNull  WordListAdapter.WordViewHolder wordViewHolder, int i) {

                Log.d(LOG_TAG,"bind view holder  "+i+"\nview holders created: "+count);
                wordViewHolder.wordHeadingView.setText(mWordList.get(i));
                wordViewHolder.wordDescriptionView.setText("It was supposed to have description like something :"+mWordList.get(i));

    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView wordHeadingView;
        public final TextView wordDescriptionView;
        final WordListAdapter mAdapter;
        private final String LOG_TAG=WordViewHolder.class.getSimpleName();

        public WordViewHolder(@NonNull View itemView, WordListAdapter mAdapter) {
            super(itemView);
            itemView.setOnClickListener(this);
            wordHeadingView = itemView.findViewById(R.id.heading);
            wordDescriptionView=itemView.findViewById(R.id.description);
            this.mAdapter = mAdapter;
        }

        @Override
        public void onClick(View v) {
            int pos=getLayoutPosition();
            mWordList.set(pos,"clicked : "+mWordList.get(pos));
            Log.d("WordViewHolder","pos : "+pos); //String.valueOf(wordHeadingView.getText()));
        }
    }
}
