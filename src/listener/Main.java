package listener;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
 



public class Main extends JavaPlugin implements Listener{
   
    @Override
    public void onEnable() {
        getLogger().info("YT EP 2 enabled!");
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new Chat(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("YT EP 2 disabled!");
    }
   
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(null);
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lWelcome back &d&l" + player.getName() + ", &6&lto my server!"));
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&b" + player.getName() + " has joined the server!"));
    }
 
}






