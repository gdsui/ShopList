package com.motion.shoplist.presetation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.motion.shoplist.data.ShopListImpl
import com.motion.shoplist.domain.*

class MainViewModel:ViewModel() {

    private val shoppingList=ShopListImpl()
    private val addShopListUseCase=AddShopListUseCase(shoppingList )
    private val deleteShoppingListUseCase=DeleteShoppingListUseCase(shoppingList)
    private val editShopListUseCase=EditShopListUseCase(shoppingList)
    private val getShopListByIdUseCase=GetShopListByIdUseCase(shoppingList)
    private val getShopListUseCase=GetShopListUseCase(shoppingList)
    val mutableShopList=getShopListUseCase.getAllList()

    fun changeShopList(shoppingList: ShoppingList){
        val newItem=shoppingList.copy(enable = !shoppingList.enable)
        editShopListUseCase.editShopList(newItem)
    }
    fun addShopList(shoppingList: ShoppingList){
        addShopListUseCase.addShopList(shoppingList)
    }
    fun deleteShopList(shoppingList: ShoppingList){
        deleteShoppingListUseCase.deleteShoppingList(shoppingList)
    }
    fun getShopListById(shoppingId:Int){
        getShopListByIdUseCase.getShopListById(shoppingId)
    }
}