package com.example.recipeapproom

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RecipeDao {
    @Query("SELECT * FROM Recipes")
    fun gettingAllRecipes(): LiveData<List<Information>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addNewRecipe(recipe: Information)

    @Delete
    fun deleteRecipe(recipe: Information)

    @Update
    fun updateRecipe(recipe: Information)
}