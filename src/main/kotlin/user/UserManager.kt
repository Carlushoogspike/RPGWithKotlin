package dev.carlos.kotlin.games.rpg.user

import org.bukkit.entity.Player

class UserManager {

    private val list = mutableListOf<User>();

    private fun addUser(user: User) {
        list.add(user)
    }

    fun createUser(player: Player){
        val user = User(player.name, player.uniqueId);
        addUser(user);
    }
}