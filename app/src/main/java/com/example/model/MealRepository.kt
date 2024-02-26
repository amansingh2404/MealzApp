package com.example.model

import com.example.model.api.MealsWebService
import com.example.model.response.Category
import com.example.model.response.Response

class MealRepository( private val webService: MealsWebService = MealsWebService() ) {
    private var cachedMeals = listOf<Category>()
  suspend  fun getMeals(function: () -> Unit): Response  {
      val response = webService.getMeals()
      cachedMeals = response.categories
        return response

    }

    fun getMeal(id: String): Category?{
        return cachedMeals.firstOrNull(){
            it.id == id
        }
    }
}