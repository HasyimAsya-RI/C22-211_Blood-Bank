package com.example.capstone_blood_bank.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.capstone_blood_bank.R
import com.example.capstone_blood_bank.database.OnBoardingItem

class OnboardingItemAdapter( private val onboardingItems: List<OnBoardingItem>): RecyclerView.Adapter<OnboardingItemAdapter.OnboardingItemViewHolder>() {

    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): OnboardingItemViewHolder {
        return OnboardingItemViewHolder(
            LayoutInflater.from( parent.context ).inflate( R.layout.onboarding_item, parent, false )
        )
    }

    override fun onBindViewHolder( holder: OnboardingItemViewHolder, position: Int ) {
        holder.bind( onboardingItems[position] )
    }

    override fun getItemCount(): Int {
        return onboardingItems.size
    }

    inner class OnboardingItemViewHolder( view: View ): RecyclerView.ViewHolder( view ) {
        private val imageOnBoarding = view.findViewById<ImageView>( R.id.iv_onbrd )
        private val textTitle       = view.findViewById<TextView>( R.id.tv_title )
        private val textDescription = view.findViewById<TextView>( R.id.tv_descr )

        fun bind( onBoardingItem: OnBoardingItem ) {
            imageOnBoarding.setImageResource( onBoardingItem.onBoardingImage )
            textTitle.text       = onBoardingItem.title
            textDescription.text = onBoardingItem.description
        }
    }
}