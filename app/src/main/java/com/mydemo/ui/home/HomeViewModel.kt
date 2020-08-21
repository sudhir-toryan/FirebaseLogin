package com.mydemo.ui.home

import android.view.View
import androidx.lifecycle.ViewModel
import com.mydemo.data.repositries.UserRepository
import com.mydemo.utils.startLoginActivity

class HomeViewModel(
    private val repository: UserRepository
) : ViewModel() {

    val user by lazy {
        repository.currentUser()
    }
    
    fun logout(view: View){
        repository.logout()
        view.context.startLoginActivity()
    }
}