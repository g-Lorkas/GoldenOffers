package com.example.lord.goldenoffers.user;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lord.goldenoffers.R;
import com.example.lord.goldenoffers.business.Offer;

import java.util.List;



public class OffersDesiresAdapter extends RecyclerView.Adapter<OffersDesiresAdapter.ProductViewHolder>{

    private Context mCtx;
    private List<Offer> offerList;

    public OffersDesiresAdapter(Context mCtx, List<Offer> offerList) {
        this.mCtx = mCtx;
        this.offerList = offerList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.offers_desires_listt, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OffersDesiresAdapter.ProductViewHolder holder, int position) {
        Offer offer = offerList.get(position);


        holder.imageView.setImageBitmap(offer.getPhoto());
        holder.textViewTitle.setText(offer.getProduct_name());
        holder.textViewShortDesc.setText(offer.getDescription());
        holder.textViewPrice.setText(String.valueOf(offer.getPrice()));
        holder.textViewExpDate.setText(String.valueOf(offer.getExpDate()));


    }

    @Override
    public int getItemCount() {
        return offerList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewPrice, textViewRegDate, textViewExpDate;
        ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
            textViewExpDate = itemView.findViewById(R.id.expDate);
            textViewRegDate = itemView.findViewById(R.id.regDate);
        }
    }
}