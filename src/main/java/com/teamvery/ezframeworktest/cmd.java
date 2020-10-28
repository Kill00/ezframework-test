package com.teamvery.ezframeworktest;

import me.kingcjy.ezframework.annotations.Command;
import me.kingcjy.ezframework.annotations.EzCommand;
import me.kingcjy.ezframework.annotations.NotFound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@EzCommand("helloworld")
public class cmd {

    @Command("test")
    public void test(CommandSender sender) {
        Player player = (Player) sender;
        player.sendMessage("HelloWorld");
    }

    @NotFound
    public void NotFound(CommandSender sender) {
        Player player = (Player) sender;
        player.sendMessage("§c알수 없는 명령어입니다!");
    }
}
