package com.example.mealzapp.ui.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.transform.CircleCropTransformation
import com.example.mealzapp.button.Button
import com.example.model.response.Category

@Composable
fun MealDetailsScreen(meal: Category?){
    Column {
        Row {
           Card {
               Image(
                   painter = rememberAsyncImagePainter(model = meal?.imageUrl),
                   contentDescription = null,
                   modifier = Modifier
                       .size(200.dp)
                       .clip(CircleShape)
               )
           }

                Text(text = meal?.name?: "Default Name")

        }
        androidx.compose.material3.Button(onClick = { /*TODO*/ }) {
            Text(text = "Change state of meal profile picture")
        }
    }
}