package com.motion.shoplist.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase (private val shoppingListRepository: ShoppingListRepository){
    fun getAllList():LiveData<List<ShoppingList>>{
        return shoppingListRepository.getAllShopList()
    }
}