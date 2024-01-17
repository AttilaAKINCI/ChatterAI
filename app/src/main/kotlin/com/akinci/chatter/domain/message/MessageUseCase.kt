package com.akinci.chatter.domain.message

import com.akinci.chatter.data.repository.MessageRepository
import com.akinci.chatter.domain.mapper.toDomain
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MessageUseCase @Inject constructor(
    private val messageRepository: MessageRepository,
) {
    fun getMessages(sender: Long, receiver: Long) =
        messageRepository.getMessages(sender, receiver).map {
            it.toDomain(sender)
        }
}