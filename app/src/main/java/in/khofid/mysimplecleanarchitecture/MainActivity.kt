package `in`.khofid.mysimplecleanarchitecture

import `in`.khofid.mysimplecleanarchitecture.presentation.MainViewModel
import `in`.khofid.mysimplecleanarchitecture.presentation.MainViewModelFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.setName("Dicoding")
        viewModel.message.observe(this, {
            tv_welcome.text = it.welcomeMessage
        })
    }
}