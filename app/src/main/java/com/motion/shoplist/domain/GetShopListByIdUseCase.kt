package com.motion.shoplist.domain

class GetShopListByIdUseCase(private val shoppingListRepository: ShoppingListRepository) {
    fun getShopListById(id:Int):ShoppingList{
 return shoppingListRepository.getShopListById(id)
    }
}