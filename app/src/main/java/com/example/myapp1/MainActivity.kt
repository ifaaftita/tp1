import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorBlockUI()
            FourColorBlockUI()
        }
    }
}
//
@Composable
fun ColorBlockUI() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Premier bloc rouge
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red)
        )

        // blocs bleu et vert
        Row(modifier = Modifier.weight(1f)) {
            // Bloc bleu
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue)
            )

            // Bloc vert
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }
    }
}
@Composable
fun FourColorBlockUI() {
    Column(modifier = Modifier.fillMaxSize()) {
        // rangée : bleu et vert
        Row(modifier = Modifier.weight(1f)) {
            // Bloc bleu
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue)
            )

            // Bloc vert
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }

        // rangée rouge et jaune
        Row(modifier = Modifier.weight(1f)) {
            // Bloc rouge
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
            )

            // Bloc jaune
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ColorBlockUI()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview1() {
    FourColorBlockUI()
}

