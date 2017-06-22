package net.triplegerms.unitygear.ability;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class ArmorEventHandler {
	
	@SubscribeEvent
	public void onPlayerLogsIn(PlayerLoggedInEvent event){
		EntityPlayer player = event.player;
		IAbility cooldown = player.getCapability(AbilityProvider.COOLDOWN, null);
		
		String msg = String.format("hi bby");//, cooldown.getCoolDown());
	}
	
	@SubscribeEvent
    public static void arrowNocked(ArrowNockEvent event) {
        System.out.println("Arrow nocked!");
    }
	

}
