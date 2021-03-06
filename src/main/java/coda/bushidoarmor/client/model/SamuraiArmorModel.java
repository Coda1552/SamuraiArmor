package coda.bushidoarmor.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SamuraiArmorModel extends BipedModel<LivingEntity> {
    public static final SamuraiArmorModel INSTANCE = new SamuraiArmorModel();
    public ModelRenderer rightPauldron;
    public ModelRenderer rightLeggings;
    public ModelRenderer rightBoot;
    public ModelRenderer helmetBase;
    public ModelRenderer chinPad;
    public ModelRenderer headdress;
    public ModelRenderer strap1;
    public ModelRenderer strap2;
    public ModelRenderer hatLeft;
    public ModelRenderer hatRight;
    public ModelRenderer hatBack;
    public ModelRenderer chestplate;
    public ModelRenderer belt;
    public ModelRenderer loin;
    public ModelRenderer string1;
    public ModelRenderer string2;
    public ModelRenderer leftPauldron;
    public ModelRenderer leftLeggings;
    public ModelRenderer leftBoot;

    public SamuraiArmorModel() {
        super(0);
        this.texWidth = 128;
        this.texHeight = 128;
        this.hatLeft = new ModelRenderer(this, 81, 64);
        this.hatLeft.setPos(4.5F, -7.5F, -0.5F);
        this.hatLeft.addBox(-1.0F, 0.0F, -4.0F, 1.0F, 6.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(hatLeft, 0.0F, 0.0F, -0.17453292519943295F);
        this.chestplate = new ModelRenderer(this, 64, 96);
        this.chestplate.setPos(0.0F, 0.0F, 0.0F);
        this.chestplate.addBox(-4.5F, 0.0F, -2.5F, 9.0F, 12.0F, 5.0F, 0.05F, 0.05F, 0.05F);
        this.headdress = new ModelRenderer(this, 64, 72);
        this.headdress.setPos(0.0F, -7.5F, -4.5F);
        this.headdress.addBox(-3.5F, -7.0F, 0.0F, 7.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(headdress, 0.08726646259971647F, 0.0F, 0.0F);
        this.strap2 = new ModelRenderer(this, 64, 78);
        this.strap2.setPos(-4.25F, -5.5F, -2.5F);
        this.strap2.addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.rightLeggings = new ModelRenderer(this, 100, 83);
        this.rightLeggings.mirror = true;
        this.rightLeggings.setPos(0.0F, 0.0F, 0.0F);
        this.rightLeggings.addBox(-3.0F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeggings, 0.0F, 0.0F, 0.08726646259971647F);
        this.string1 = new ModelRenderer(this, 64, 115);
        this.string1.setPos(0.5F, 11.0F, -2.6F);
        this.string1.addBox(-0.1F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(string1, -0.2617993877991494F, 0.0F, -0.17453292519943295F);
        this.rightBoot = new ModelRenderer(this, 100, 96);
        this.rightBoot.setPos(0.0F, 0.0F, 0.0F);
        this.rightBoot.addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.1F, 0.1F, 0.1F);
        this.leftPauldron = new ModelRenderer(this, 112, 64);
        this.leftPauldron.setPos(1.0F, 0.0F, 0.0F);
        this.leftPauldron.addBox(-0.5F, -3.0F, -2.5F, 3.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftPauldron, 0.0F, 0.0F, -0.2617993877991494F);
        this.hatBack = new ModelRenderer(this, 92, 64);
        this.hatBack.setPos(0.0F, -7.5F, 4.5F);
        this.hatBack.addBox(-4.5F, 0.0F, -1.0F, 9.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(hatBack, 0.17453292519943295F, 0.0F, 0.0F);
        this.chinPad = new ModelRenderer(this, 64, 64);
        this.chinPad.setPos(0.0F, -2.5F, 0.0F);
        this.chinPad.addBox(-4.5F, -0.5F, -4.5F, 9.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chinPad, 0.08726646259971647F, 0.0F, 0.0F);
        this.belt = new ModelRenderer(this, 64, 109);
        this.belt.setPos(0.0F, 0.0F, 0.0F);
        this.belt.addBox(-4.5F, 11.0F, -2.5F, 9.0F, 1.0F, 5.0F, 0.1F, 0.1F, 0.1F);
        this.strap1 = new ModelRenderer(this, 64, 78);
        this.strap1.setPos(4.25F, -5.5F, -2.5F);
        this.strap1.addBox(0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.leftBoot = new ModelRenderer(this, 100, 96);
        this.leftBoot.setPos(0.0F, 0.0F, 0.0F);
        this.leftBoot.addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.1F, 0.1F, 0.1F);
        this.leftLeggings = new ModelRenderer(this, 100, 83);
        this.leftLeggings.setPos(0.0F, 0.0F, 0.0F);
        this.leftLeggings.addBox(0.0F, 0.0F, -2.5F, 3.0F, 8.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeggings, 0.0F, 0.0F, -0.08726646259971647F);
        this.hatRight = new ModelRenderer(this, 81, 64);
        this.hatRight.setPos(-4.5F, -7.5F, -0.5F);
        this.hatRight.addBox(0.0F, 0.0F, -4.0F, 1.0F, 6.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(hatRight, 0.0F, 0.0F, 0.17453292519943295F);
        this.rightPauldron = new ModelRenderer(this, 112, 64);
        this.rightPauldron.mirror = true;
        this.rightPauldron.setPos(-1.0F, 0.0F, 0.0F);
        this.rightPauldron.addBox(-2.5F, -3.0F, -2.5F, 3.0F, 10.0F, 5.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightPauldron, 0.0F, 0.0F, 0.2617993877991494F);
        this.helmetBase = new ModelRenderer(this, 64, 79);
        this.helmetBase.setPos(0.0F, 0.0F, 0.0F);
        this.helmetBase.addBox(-4.5F, -9.5F, -4.5F, 9.0F, 4.0F, 9.0F, 0.0F, 0.0F, 0.0F);
        this.loin = new ModelRenderer(this, 100, 103);
        this.loin.setPos(0.0F, 12.0F, -1.5F);
        this.loin.addBox(-3.0F, 0.0F, -1.0F, 6.0F, 9.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(loin, -0.17453292519943295F, 0.0F, 0.0F);
        this.string2 = new ModelRenderer(this, 64, 115);
        this.string2.setPos(-0.5F, 11.0F, -2.6F);
        this.string2.addBox(-0.9F, 0.0F, 0.0F, 1.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(string2, -0.2617993877991494F, 0.0F, 0.17453292519943295F);
        this.helmetBase.addChild(this.hatLeft);
        this.body.addChild(this.chestplate);
        this.helmetBase.addChild(this.headdress);
        this.helmetBase.addChild(this.strap2);
        this.rightLeg.addChild(this.rightLeggings);
        this.belt.addChild(this.string1);
        this.rightLeg.addChild(this.rightBoot);
        this.leftArm.addChild(this.leftPauldron);
        this.helmetBase.addChild(this.hatBack);
        this.helmetBase.addChild(this.chinPad);
        this.body.addChild(this.belt);
        this.helmetBase.addChild(this.strap1);
        this.leftLeg.addChild(this.leftBoot);
        this.leftLeg.addChild(this.leftLeggings);
        this.helmetBase.addChild(this.hatRight);
        this.rightArm.addChild(this.rightPauldron);
        this.head.addChild(this.helmetBase);
        this.body.addChild(this.loin);
        this.belt.addChild(this.string2);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void prepareMobModel(LivingEntity livingEntity, float p_212843_2_, float p_212843_3_, float p_212843_4_) {
        super.prepareMobModel(livingEntity, p_212843_2_, p_212843_3_, p_212843_4_);

        if (Minecraft.getInstance().player.isCrouching()) {
            belt.xRot = -0.5F;
            loin.xRot = -0.5F;
            System.out.println("e");
        }
    }
}
