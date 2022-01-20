package com.motion.shoplist.domain

class EditShopListUseCase(private val shoppingListRepository: ShoppingListRepository) {
   fun editShopList(shoppingList: ShoppingList){
    shoppingListRepository.editShopList(shoppingList)
   }
}