package com.motion.shoplist.domain

class AddShopListUseCase(private val shoppingListRepository: ShoppingListRepository) {

    fun addShopList(shoppingList: ShoppingList){
        shoppingListRepository.addShopList(shoppingList)
    }
}