package com.example.projectbp2681

class LoginModel {
    //variabel
    var username = ""
    var password = ""

    //method/function
    fun loginCek():Boolean{
        if (username.equals("arif") && password.equals("amikom")){
            return true
        }else {
            return false
        }
    }
}