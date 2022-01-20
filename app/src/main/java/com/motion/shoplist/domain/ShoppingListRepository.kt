package com.motion.shoplist.domain

import androidx.lifecycle.LiveData

interface ShoppingListRepository {

    fun addShopList(shoppingList: ShoppingList)

    fun deleteShopList(shoppingList: ShoppingList)

    fun getShopListById(shoppingListId: Int):ShoppingList

    fun editShopList(shoppingList: ShoppingList)

    fun getAllShopList():LiveData<List<ShoppingList>>
}