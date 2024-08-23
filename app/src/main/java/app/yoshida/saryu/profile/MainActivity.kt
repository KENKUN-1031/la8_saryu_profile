package app.yoshida.saryu.profile

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.isVisible
import androidx.core.view.WindowInsetsCompat
import app.yoshida.saryu.profile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    fun switchColor(pressed: String){
        //全てグレー
        binding.showProfileButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        binding.showSportButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        binding.showFoodButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        binding.showHobbyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(150,150,150))
        if (pressed == "profile"){
            binding.showProfileButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180,220))
        }else if (pressed == "sport"){
            binding.showSportButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,0,100))
        }else if (pressed == "hobby"){
            binding.showHobbyButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(220,100,0))
        }else if (pressed == "food"){
            binding.showFoodButton.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,180,120))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        binding.showProfileButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.randy_image)
            binding.profileLabelText.text = "名前"
            binding.profileCommentText.text = "Androidメンターのランディだよ"
            switchColor("profile")
        }
        binding.showSportButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.baseball_image)
            binding.profileLabelText.text = "スポーツ"
            binding.profileCommentText.text = "野球が好きで、スタジアムに通っている"
            switchColor("sport")
        }
        binding.showFoodButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.donut_image)
            binding.profileLabelText.text = "好きな食べ物"
            binding.profileCommentText.text = "キャンディやドーナッツが大好き"
            switchColor("food")
        }
        binding.showHobbyButton.setOnClickListener {
            binding.profileImage.setImageResource(R.drawable.gadget_image)
            binding.profileLabelText.text = "趣味"
            binding.profileCommentText.text = "ガジェットを集めて動かすこと"
            switchColor("hobby")
        }
    }
}