package com.github.rexfilius.viewgroupszuri.loginView

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.rexfilius.viewgroupszuri.databinding.ActivityLoginBinding
import com.github.rexfilius.viewgroupszuri.listView.ListActivity

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        login()
    }

    private fun login() {
        val emailText = binding.loginEditTextEmail.text
        val passwordText = binding.loginEditTextPassword.text

        binding.loginButton.setOnClickListener {
            when {
                emailText.toString().isEmpty() || passwordText.toString().isEmpty()
                -> showToast("Email or Password is empty")

                emailText.toString() == "one@gmail.com" && passwordText.toString() == "3000"
                -> goToListActivity()

                else -> showToast("Email or Password is wrong")
            }
        }
    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    private fun goToListActivity() {
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
        showToast("Login successful")
        finish()
    }


}