package coda.bushidoarmor.item;

import coda.bushidoarmor.BushidoArmor;
import coda.bushidoarmor.client.model.SamuraiArmorModel;
import coda.bushidoarmor.init.BAItems;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class SamuraiArmorItem extends ArmorItem {
    private final String name;

    public SamuraiArmorItem(String name, EquipmentSlotType slot) {
        super(
                new BAArmorMaterial( BushidoArmor.MOD_ID + ":" + name,  15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, () -> Ingredient.of(Items.IRON_INGOT, Items.LEATHER)),
                slot,
                new Item.Properties().tab(ItemGroup.TAB_COMBAT)
        );

        this.name = name;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> components, ITooltipFlag flag) {
        if (name.equals("icy_blue")) {
            if (stack.getItem().equals(BAItems.ICY_BLUE_SAMURAI_HELMET.get())) components.add(new TranslationTextComponent("item." + BushidoArmor.MOD_ID + "." + name + "_samurai_helmet_desc"));
        }
    }

    @SuppressWarnings("unchecked")
    @Nullable
    @Override
    @OnlyIn(Dist.CLIENT)
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) SamuraiArmorModel.INSTANCE;
    }
}
