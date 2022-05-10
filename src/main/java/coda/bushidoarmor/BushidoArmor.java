package coda.bushidoarmor;

import coda.bushidoarmor.init.BAItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BushidoArmor.MOD_ID)
public class BushidoArmor {
    public static final String MOD_ID = "bushidoarmor";

    public BushidoArmor() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::registerClient);

        BAItems.ITEMS.register(bus);
    }

    private void registerClient(FMLClientSetupEvent event) {
    }
}
