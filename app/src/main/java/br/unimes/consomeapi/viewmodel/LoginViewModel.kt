package br.unimes.consomeapi.viewmodel

import android.widget.Toast
import androidx.lifecycle.ViewModel
import br.unimes.consomeapi.model.User

class LoginViewModel:ViewModel() {
    private val usuarios = mutableListOf<User>()

    fun cadastrar(user:User):String{
        usuarios.add(user)
        return "Cadastro realizado!"
    }

    fun logar(user: User):String{
        val res = usuarios.find{it.login == user.login && it.senha==user.senha}
        if (res != null){
            return "Login realizado com sucesso"
        }else{
            return "Usuário não cadastrado"
        }
    }
}