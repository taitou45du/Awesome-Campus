package cn.edu.jxnu.awesome_campus.support.adapter.library;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.edu.jxnu.awesome_campus.R;
import cn.edu.jxnu.awesome_campus.model.library.BookSearchResultModel;
import cn.edu.jxnu.awesome_campus.support.adapter.BaseListAdapter;

/**
 * Created by MummyDing on 16-2-19.
 * GitHub: https://github.com/MummyDing
 * Blog: http://blog.csdn.net/mummyding
 */
public class BookSearchResultAdapter extends BaseListAdapter<BookSearchResultModel,BookSearchResultAdapter.VH> {

    public BookSearchResultAdapter(Context mContext, BookSearchResultModel model) {
        super(mContext, model);
    }

    @Override
    protected void updateView() {
        notifyDataSetChanged();
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.card_book_result,parent,false);
        VH vh = new VH(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        BookSearchResultModel model = new BookSearchResultModel("");
        holder.bookTitle.setText(model.getBookTitle());
    }

    class VH extends RecyclerView.ViewHolder{
        View itemView;
        TextView bookTitle;
        public VH(View itemView) {
            super(itemView);
            this.itemView = itemView;
            bookTitle = (TextView) itemView.findViewById(R.id.bookTitle);
        }
    }
}