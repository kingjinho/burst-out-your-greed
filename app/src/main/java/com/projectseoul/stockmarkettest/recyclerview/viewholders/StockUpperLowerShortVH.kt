package com.projectseoul.stockmarkettest.recyclerview.viewholders

import com.projectseoul.stockmarkettest.databinding.ItemStockUpperLowerShortBinding
import com.projectseoul.stockmarkettest.models.StockByUpperLowerLimit
import com.projectseoul.stockmarkettest.recyclerview.BaseViewHolder
import com.projectseoul.stockmarkettest.screens.main.ScreenMainMvc

/**
 * Created by KING JINHO on 9/27/2021
 */
class StockUpperLowerShortVH(
    private val binding: ItemStockUpperLowerShortBinding,
    private val listener: ScreenMainMvc.ItemClickListener
): BaseViewHolder(binding) {
    override fun bind(item: Any) {
        binding.run {
            stock = item as StockByUpperLowerLimit
            executePendingBindings()
        }

        itemView.setOnClickListener {
            listener.onClick(item)
        }
    }
}