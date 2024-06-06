package dev.carlos.kotlin.games.rpg.events

import dev.carlos.kotlin.games.rpg.user.UserManager
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class OnPlayerJoin(private val manager: UserManager) : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        val player: Player = event.player;
        manager.createUser(player);
    }

}