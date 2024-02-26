package com.example.mealzapp.ui.details

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.model.MealRepository
import com.example.model.response.Category

class MealDetailsViewModel(
    private  val savedStatehandle: SavedStateHandle,
    private  val repository: MealRepository = MealRepository()
): ViewModel() {
    var mealState = mutableStateOf<Category?>(null)
    init {
        val mealId = savedStatehandle.get<String>("meal_category_id")?: ""
        mealState.value = repository.getMeal(mealId)
    }
}