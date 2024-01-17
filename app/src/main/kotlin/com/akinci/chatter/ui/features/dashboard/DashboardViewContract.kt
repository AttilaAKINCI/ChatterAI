package com.akinci.chatter.ui.features.dashboard

import com.akinci.chatter.core.compose.UIState
import com.akinci.chatter.domain.user.User
import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf

object DashboardViewContract {

    data class State(
        val name: String = "",
        val users: PersistentList<User> = persistentListOf(),
        val loading: Boolean = true,
        val noData: Boolean = false,
        val error: Boolean = false,
        val isNewChatButtonLoading: Boolean = false,
        val logoutUser: Boolean = false,
        val isLogoutDialogVisible: Boolean = false,
    ) : UIState
}
