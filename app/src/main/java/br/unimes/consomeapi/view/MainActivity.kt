package br.unimes.consomeapi.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.unimes.consomeapi.databinding.ActivityMainBinding
import br.unimes.consomeapi.model.User
import br.unimes.consomeapi.viewmodel.LoginViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val viewModel = LoginViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener{
            val login = binding.edtEmail.text.toString()
            val senha = binding.edtSenha.text.toString()
            val user = User(login, senha)
            val ret = viewModel.logar(user)
            Toast.makeText(this, ret, Toast.LENGTH_SHORT).show()
        }

        binding.btnCad.setOnClickListener{
            val login = binding.edtEmail.text.toString()
            val senha = binding.edtSenha.text.toString()
            val user = User(login, senha)
            val ret = viewModel.cadastrar(user)
            Toast.makeText(this, ret, Toast.LENGTH_SHORT).show()
        }

    }
}