package `in`.khofid.mysimplecleanarchitecture.di

import `in`.khofid.mysimplecleanarchitecture.data.IMessageDataSource
import `in`.khofid.mysimplecleanarchitecture.data.MessageDataSource
import `in`.khofid.mysimplecleanarchitecture.data.MessageRepository
import `in`.khofid.mysimplecleanarchitecture.domain.IMessageRepository
import `in`.khofid.mysimplecleanarchitecture.domain.MessageInteractor
import `in`.khofid.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}