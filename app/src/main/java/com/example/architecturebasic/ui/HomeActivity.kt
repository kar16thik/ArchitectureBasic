package com.example.architecturebasic.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.activity.viewModels
import com.example.architecturebasic.R
import com.example.architecturebasic.compose.MainComposeActivity
import com.example.architecturebasic.databinding.ActivityHomeBinding
import com.example.architecturebasic.ui.viewmodel.HomeViewModel

class HomeActivity : AppCompatActivity() {
    private lateinit var mHomeActivityBinding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mHomeActivityBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mHomeActivityBinding.root)
      //  viewModel.setup()
        startActivity(Intent(this@HomeActivity, MainComposeActivity::class.java))
    }
}