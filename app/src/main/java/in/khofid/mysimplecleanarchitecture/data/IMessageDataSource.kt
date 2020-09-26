package `in`.khofid.mysimplecleanarchitecture.data

import `in`.khofid.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}