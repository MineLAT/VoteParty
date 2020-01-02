package me.clip.voteparty.messages

import co.aikar.locales.MessageKey
import co.aikar.locales.MessageKeyProvider

enum class Messages : MessageKeyProvider
{
	ERROR__INVALID_NUMBER,
	
	INFO__VOTES_NEEDED,
	
	PARTY__FORCE_START_SUCCESSFUL,
	
	VOTES__VOTES_NEEDED_UPDATED, VOTES__VOTE_COUNTER_UPDATED;
	
	private val key = MessageKey.of(name.toLowerCase().replace("__", ".").replace("_", "-"))
	
	override fun getMessageKey(): MessageKey?
	{
		return key
	}
}
