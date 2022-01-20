package com.motion.shoplist.domain

class DeleteShoppingListUseCase(private val shoppingListRepository: ShoppingListRepository) {

    fun deleteShoppingList(shoppingList: ShoppingList){
    shoppingListRepository.deleteShopList(shoppingList)
    }
}