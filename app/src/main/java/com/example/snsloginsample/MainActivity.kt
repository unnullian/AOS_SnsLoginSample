package com.example.snsloginsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snsloginsample.databinding.ActivityMainBinding
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel = FacebookViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val callbackManager = CallbackManager.Factory.create()

        binding.viewModel = viewModel

        LoginManager.getInstance().registerCallback(callbackManager, object: FacebookCallback<LoginResult> {
            override fun onSuccess(result: LoginResult?) {
            }

            override fun onCancel() {
            }

            override fun onError(error: FacebookException?) {
            }

        })

    }
}