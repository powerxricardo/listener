package listener;
 
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
 
import net.md_5.bungee.api.ChatColor;
 
public class Chat implements Listener{
   
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        event.setFormat(ChatColor.translateAlternateColorCodes('&',"&7Lvl: &r0 &e" + player.getName() + " &a" + event.getMessage()));
    }
 
}