package coda.bushidoarmor.init;

import coda.bushidoarmor.BushidoArmor;
import coda.bushidoarmor.item.SamuraiArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BAItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BushidoArmor.MOD_ID);

    public static final RegistryObject<Item> ICY_BLUE_SAMURAI_HELMET = ITEMS.register("icy_blue_samurai_helmet", () -> new SamuraiArmorItem("icy_blue", EquipmentSlotType.HEAD));
}
