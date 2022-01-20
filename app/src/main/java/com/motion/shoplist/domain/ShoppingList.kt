package com.motion.shoplist.domain

data class ShoppingList(val name:String, val count:Int, val enable:Boolean,
                        var id:Int = SHOPLISTID)
{
    companion object{
        const val SHOPLISTID=0
    }
}