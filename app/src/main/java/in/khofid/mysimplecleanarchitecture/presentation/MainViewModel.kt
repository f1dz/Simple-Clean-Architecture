package `in`.khofid.mysimplecleanarchitecture.presentation

import `in`.khofid.mysimplecleanarchitecture.domain.MessageEntity
import `in`.khofid.mysimplecleanarchitecture.domain.MessageUseCase
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val messageUseCase: MessageUseCase): ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}