package com.motion.shoplist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.motion.shoplist.domain.ShoppingList
import com.motion.shoplist.domain.ShoppingListRepository
import java.lang.RuntimeException

class ShopListImpl :ShoppingListRepository {
   private val shoppingList=MutableLiveData<List<ShoppingList>>()
    private val shoppingListIml= mutableListOf<ShoppingList>()
    private var counter=0

    override fun addShopList(shoppingList: ShoppingList) {
        if (shoppingList.id==ShoppingList.SHOPLISTID){
            shoppingList.id=counter++
        }
        for (i in 0 until 10){
            val item=ShoppingList("Bread",i,true,i)
            shoppingListIml.add(item)
        }
        upDateList()
    }

    override fun deleteShopList(shoppingList: ShoppingList) {
     shoppingListIml.remove(shoppingList)
        upDateList()
    }

    override fun getShopListById(shoppingListId: Int):ShoppingList {
        return shoppingListIml.find { it.id ==shoppingListId }?:throw RuntimeException("$shoppingListId not found")
        upDateList()
    }

    override fun editShopList(shoppingList: ShoppingList) {
    val oldElement=getShopListById(shoppingList.id)
        shoppingListIml.remove(oldElement)
        addShopList(shoppingList)
    }

    override fun getAllShopList():LiveData<List<ShoppingList>> {
        return shoppingList
    }
    private fun upDateList(){
        shoppingList.value=shoppingListIml.toList()
    }
}