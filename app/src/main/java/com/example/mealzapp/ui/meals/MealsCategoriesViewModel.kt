package com.example.mealzapp.ui.meals

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.model.MealRepository
import com.example.model.response.Category
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MealsCategoriesViewModel(private  val repository: MealRepository = MealRepository()): ViewModel() {


    init {

        viewModelScope.launch(Dispatchers.IO){
            val meals = getMeal()
            mealsState.value = meals
        }
    }

    val mealsState: MutableState<List<Category>> = mutableStateOf(emptyList<Category>())

   private suspend fun getMeal(): List<Category> {
  return  repository.getMeals{}.categories
   // What would we return here
}
}