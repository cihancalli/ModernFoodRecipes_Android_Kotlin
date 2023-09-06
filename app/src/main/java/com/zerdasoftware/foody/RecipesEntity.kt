package com.zerdasoftware.foody

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.zerdasoftware.foody.models.FoodRecipe
import com.zerdasoftware.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0
}