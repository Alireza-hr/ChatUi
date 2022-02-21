package com.alireza.chatui.persentation.view

import android.os.Bundle
import android.view.ViewGroup
import com.alireza.chatui.R
import com.alireza.chatui.databinding.FragmentChatBinding
import com.alireza.chatui.persentation.view.basic.BaseFragment
import com.alireza.chatui.persentation.viewmodel.ChatViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChatFragment : BaseFragment<FragmentChatBinding, ChatViewModel>(R.layout.fragment_chat) {
    override fun onFragmentCreated(container: ViewGroup?, savedInstanceState: Bundle?) {

    }
}
