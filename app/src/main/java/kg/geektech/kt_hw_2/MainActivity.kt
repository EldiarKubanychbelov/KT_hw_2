package kg.geektech.kt_hw_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var urlData: ArrayList<String> = arrayListOf(
            "https://i.picsum.photos/id/689/200/200.jpg?hmac=2KHWG2UlfLNAWC1jiBz-LQ7b-TMOB4bcW-FVvdQ_7a4",
            "https://i.picsum.photos/id/335/200/200.jpg?hmac=CS4kiSEelfhSQQtW7j6SFUV2ZlTmUV1vaX2iZKnbx7c",
            "https://i.picsum.photos/id/381/200/200.jpg?hmac=IXUwJuDt0wy3ChotTk60XiBv1aDqt3EbITLD8z4671w",
            "https://i.picsum.photos/id/882/200/200.jpg?hmac=cVjON67mkFjmhVFCS4lYVS-iFp1D3KP-khmMizQxxhQ",
            "https://i.picsum.photos/id/531/200/200.jpg?hmac=PE_UHXALavopqDJ2V1rSz0nCsrJQX3c6rgUPXndBkwo"
        )

        btn_random.setOnClickListener {
            Glide.with(this)
                .load(urlData.random())
                .override(250,250)
                .into(img_url)
        }
    }
}