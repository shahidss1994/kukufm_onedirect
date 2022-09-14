package com.shock.kukufm_onedirect

/*
import `in`.onedirect.chatsdk.sdksupport.ChatSdk
import `in`.onedirect.chatsdk.sdksupport.SdkCallbacks
import android.content.Context
import com.google.firebase.messaging.RemoteMessage
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.*
import javax.inject.Inject

class OneDirectChat @Inject constructor(@ApplicationContext private val context: Context) : SdkCallbacks {

    companion object {
        const val BRAND_HASH = "ODc3N18xNjYwODIwNTQ0ODUzXzQ="
        val _UUID = UUID.randomUUID().toString()
    }

    private var chatSdk: ChatSdk = ChatSdk.Builder(context)
        .setBrandHash(BRAND_HASH)
        .setBrandNotificationHandling(false)
        .setScreenShotEnabled(true)
        .setActivityRotationToPortrait(false)
        .disableAttachmentOption(false)
        .build()

    init {
        chatSdk.registerSdkCallBacks(this)
    }

    override fun onSdkExit() {

    }

    override fun onTicketRaised(sessionHash: String?, ticketId: Long?, customerHash: String?) {

    }

    override fun onEventRaised(eventMap: MutableMap<String, Any>?) {

    }

    override fun onOnedirectNotificationReceived(remoteMessage: RemoteMessage?) {

    }

    fun startChat() {
        val hashMap = hashMapOf<String, String>()
        hashMap["prechat_Name"] = "Shahid Shaikh"
        hashMap["prechat_PrimaryEmail"] = "shahid@supertal.io"
        hashMap["prechat_PrimaryMobile"] = "9987146461"
        chatSdk.doSdkLogin("9987146461")
        chatSdk.startChatFlow(false, "9987146461", hashMapOf<String, String>(), hashMap)
    }


}*/
