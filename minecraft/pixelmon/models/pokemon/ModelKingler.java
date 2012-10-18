package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;


public class ModelKingler extends ModelBase
{
  //fields
    ModelRenderer LeftClawBottom;
    ModelRenderer LeftClawTop2;
    ModelRenderer LeftArm;
    ModelRenderer LeftArm1;
    ModelRenderer LeftClawTop;
    ModelRenderer FootR1;
    ModelRenderer BottemLegR1;
    ModelRenderer JointR1;
    ModelRenderer TopLegR1;
    ModelRenderer TopLegR2;
    ModelRenderer JointR2;
    ModelRenderer BottemLegR2;
    ModelRenderer FootR2;
    ModelRenderer FootL1;
    ModelRenderer BottemLegL1;
    ModelRenderer TopLegL1;
    ModelRenderer JointL1;
    ModelRenderer TopLegL2;
    ModelRenderer JointL2;
    ModelRenderer BottemLegL2;
    ModelRenderer FootL2;
    ModelRenderer EyeR;
    ModelRenderer Hair1;
    ModelRenderer EyeL;
    ModelRenderer Hair2;
    ModelRenderer Hair3;
    ModelRenderer Hair4;
    ModelRenderer Hair5;
    ModelRenderer ToothL;
    ModelRenderer Hair6;
    ModelRenderer ToothR;
    ModelRenderer bottomJaw;
    ModelRenderer TopJaw;
    ModelRenderer RightArm;
    ModelRenderer RightClawBottom;
    ModelRenderer RightClawTop2;
    ModelRenderer RightArm1;
    ModelRenderer RightClawTop;
    ModelRenderer Kingler;
    ModelRenderer RightLeg1;
    ModelRenderer RightLeg2;
    ModelRenderer LeftLeg1;
    ModelRenderer LeftLeg2;
    
    public ModelKingler()
    {
      textureWidth = 128;
      textureHeight = 128;

      Kingler = new ModelRenderer(this, "Kingler");
      Kingler.setRotationPoint(0F, 0F, 0F);
      setRotation(Kingler, 0F, 0F, 0F);
      Kingler.mirror = true;
        RightArm = new ModelRenderer(this, 12, 46);
        RightArm.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
        RightArm.setRotationPoint(4F, 18.86667F, 1F);
        RightArm.setTextureSize(128, 128);
        RightArm.mirror = true;
        setRotation(RightArm, 0F, -0.4461433F, -2.082003F);
        RightClawBottom = new ModelRenderer(this, 0, 33);
        RightClawBottom.addBox(-1.5F, -1F, 0F, 3, 1, 3);
        RightClawBottom.setRotationPoint(8F, 14.2F, 3F);
        RightClawBottom.setTextureSize(128, 128);
        RightClawBottom.mirror = true;
        setRotation(RightClawBottom, 0.9294653F, -1.896108F, 0F);
        RightClawTop2 = new ModelRenderer(this, 9, 66);
        RightClawTop2.addBox(-2F, -2F, 0F, 4, 2, 4);
        RightClawTop2.setRotationPoint(10F, 11F, 3.9F);
        RightClawTop2.setTextureSize(128, 128);
        RightClawTop2.mirror = true;
        setRotation(RightClawTop2, 0.1115358F, -1.90192F, 0F);
        RightArm1 = new ModelRenderer(this, 16, 46);
        RightArm1.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
        RightArm1.setRotationPoint(7F, 17F, 2.5F);
        RightArm1.setTextureSize(128, 128);
        RightArm1.mirror = true;
        setRotation(RightArm1, 0F, -0.4461411F, -2.565325F);
        RightClawTop = new ModelRenderer(this, 9, 66);
        RightClawTop.addBox(-2F, -2F, 0F, 4, 3, 5);
        RightClawTop.setRotationPoint(9F, 14.2F, 3.5F);
        RightClawTop.setTextureSize(128, 128);
        RightClawTop.mirror = true;
        setRotation(RightClawTop, 1.449966F, -1.901927F, 0F);
        EyeR = new ModelRenderer(this, 4, 0);
        EyeR.addBox(-2F, -1F, 0F, 4, 2, 0);
        EyeR.setRotationPoint(3F, 15F, 3.5F);
        EyeR.setTextureSize(128, 128);
        EyeR.mirror = true;
        setRotation(EyeR, 0.2974359F, 0F, -0.2974289F);
        Hair1 = new ModelRenderer(this, 0, 0);
        Hair1.addBox(-0.5F, -3F, -0.5F, 1, 4, 1);
        Hair1.setRotationPoint(1F, 14F, 2.4F);
        Hair1.setTextureSize(128, 128);
        Hair1.mirror = true;
        setRotation(Hair1, 0.3346145F, 0F, 0F);
        EyeL = new ModelRenderer(this, 4, 2);
        EyeL.addBox(-2F, -1F, 0F, 4, 2, 0);
        EyeL.setRotationPoint(-3F, 15F, 3.5F);
        EyeL.setTextureSize(128, 128);
        EyeL.mirror = true;
        setRotation(EyeL, 0.2974359F, 0F, 0.2974216F);
        Hair2 = new ModelRenderer(this, 0, 0);
        Hair2.addBox(-0.5F, -3F, -0.5F, 1, 4, 1);
        Hair2.setRotationPoint(2.5F, 14F, 2.4F);
        Hair2.setTextureSize(128, 128);
        Hair2.mirror = true;
        setRotation(Hair2, 0.3346145F, 0F, 0.185895F);
        Hair3 = new ModelRenderer(this, 0, 0);
        Hair3.addBox(-0.5F, -3F, -0.5F, 1, 4, 1);
        Hair3.setRotationPoint(-2.5F, 14F, 2.4F);
        Hair3.setTextureSize(128, 128);
        Hair3.mirror = true;
        setRotation(Hair3, 0.3346145F, 0F, -0.1858931F);
        Hair4 = new ModelRenderer(this, 0, 0);
        Hair4.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
        Hair4.setRotationPoint(-3.5F, 15F, 2.5F);
        Hair4.setTextureSize(128, 128);
        Hair4.mirror = true;
        setRotation(Hair4, 0.3346145F, 0F, -0.4461433F);
        Hair5 = new ModelRenderer(this, 0, 0);
        Hair5.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
        Hair5.setRotationPoint(3.5F, 15F, 2.5F);
        Hair5.setTextureSize(128, 128);
        Hair5.mirror = true;
        setRotation(Hair5, 0.3346145F, 0F, 0.4461411F);
        ToothL = new ModelRenderer(this, 0, 51);
        ToothL.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
        ToothL.setRotationPoint(-4.5F, 18F, 4.5F);
        ToothL.setTextureSize(128, 128);
        ToothL.mirror = true;
        setRotation(ToothL, 0.111544F, 0F, 0F);
        Hair6 = new ModelRenderer(this, 0, 0);
        Hair6.addBox(-0.5F, -3F, -0.5F, 1, 4, 1);
        Hair6.setRotationPoint(-1F, 14F, 2.4F);
        Hair6.setTextureSize(128, 128);
        Hair6.mirror = true;
        setRotation(Hair6, 0.3346145F, 0F, 0F);
        ToothR = new ModelRenderer(this, 0, 51);
        ToothR.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
        ToothR.setRotationPoint(4.5F, 18F, 4.5F);
        ToothR.setTextureSize(128, 128);
        ToothR.mirror = true;
        setRotation(ToothR, 0.111544F, 0F, 0F);
        bottomJaw = new ModelRenderer(this, 0, 54);
        bottomJaw.addBox(-5F, 0F, -5F, 10, 3, 9);
        bottomJaw.setRotationPoint(0F, 18F, 1F);
        bottomJaw.setTextureSize(128, 128);
        bottomJaw.mirror = true;
        setRotation(bottomJaw, 0.1115358F, 0F, 0F);
        TopJaw = new ModelRenderer(this, 0, 66);
        TopJaw.addBox(-4.5F, 0F, -6F, 9, 5, 9);
        TopJaw.setRotationPoint(0F, 15F, 0F);
        TopJaw.setTextureSize(128, 128);
        TopJaw.mirror = true;
        setRotation(TopJaw, 0.3346075F, 0F, 0F);
      LeftLeg1 = new ModelRenderer(this, "LeftLeg1");
      LeftLeg1.setRotationPoint(-4F, 21F, 4F);
      setRotation(LeftLeg1, 0F, 0F, 0F);
      LeftLeg1.mirror = true;
        FootL1 = new ModelRenderer(this, 12, 51);
        FootL1.addBox(-1F, 0F, -1F, 2, 1, 2);
        FootL1.setRotationPoint(-7F, 2F, 0F);
        FootL1.setTextureSize(128, 128);
        FootL1.mirror = true;
        setRotation(FootL1, 0F, 0F, 0F);
        BottemLegL1 = new ModelRenderer(this, 4, 43);
        BottemLegL1.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
        BottemLegL1.setRotationPoint(-4F, -3F, 0F);
        BottemLegL1.setTextureSize(128, 128);
        BottemLegL1.mirror = true;
        setRotation(BottemLegL1, 0F, 0F, 0.4089647F);
        TopLegL1 = new ModelRenderer(this, 0, 45);
        TopLegL1.addBox(-0.5F, 0F, -0.5F, 1, 5, 1);
        TopLegL1.setRotationPoint(0F, -0.1F, 0F);
        TopLegL1.setTextureSize(128, 128);
        TopLegL1.mirror = true;
        setRotation(TopLegL1, 0F, 0F, 2.082002F);
        JointL1 = new ModelRenderer(this, 4, 50);
        JointL1.addBox(-1F, 0F, -1F, 2, 2, 2);
        JointL1.setRotationPoint(0F, 0F, 0F);
        JointL1.setTextureSize(128, 128);
        JointL1.mirror = true;
        setRotation(JointL1, 0F, 0F, 2.082002F);
        
        LeftLeg1.addChild(JointL1);
        LeftLeg1.addChild(TopLegL1);
        LeftLeg1.addChild(BottemLegL1);
        LeftLeg1.addChild(FootL1);
        
      LeftLeg2 = new ModelRenderer(this, "LeftLeg2");
      LeftLeg2.setRotationPoint(-4F, 21F, -2F);
      setRotation(LeftLeg2, 0F, 0F, 0F);
      LeftLeg2.mirror = true;
        TopLegL2 = new ModelRenderer(this, 0, 45);
        TopLegL2.addBox(-0.5F, 0F, -0.5F, 1, 5, 1);
        TopLegL2.setRotationPoint(0F, -0.1F, 0F);
        TopLegL2.setTextureSize(128, 128);
        TopLegL2.mirror = true;
        setRotation(TopLegL2, 0F, 0F, 2.082002F);
        JointL2 = new ModelRenderer(this, 4, 50);
        JointL2.addBox(-1F, 0F, -1F, 2, 2, 2);
        JointL2.setRotationPoint(0F, 0F, 0F);
        JointL2.setTextureSize(128, 128);
        JointL2.mirror = true;
        setRotation(JointL2, 0F, 0F, 2.082002F);
        BottemLegL2 = new ModelRenderer(this, 4, 43);
        BottemLegL2.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
        BottemLegL2.setRotationPoint(-4F, -3F, 0F);
        BottemLegL2.setTextureSize(128, 128);
        BottemLegL2.mirror = true;
        setRotation(BottemLegL2, 0F, 0F, 0.4089647F);
        FootL2 = new ModelRenderer(this, 12, 51);
        FootL2.addBox(-1F, 0F, -1F, 2, 1, 2);
        FootL2.setRotationPoint(-7F, 2F, 0F);
        FootL2.setTextureSize(128, 128);
        FootL2.mirror = true;
        setRotation(FootL2, 0F, 0F, 0F);
        
        LeftLeg2.addChild(JointL2);
        LeftLeg2.addChild(TopLegL2);
        LeftLeg2.addChild(BottemLegL2);
        LeftLeg2.addChild(FootL2);
        
      RightLeg1 = new ModelRenderer(this, "RightLeg1");
      RightLeg1.setRotationPoint(4F, 21F, -2F);
      setRotation(RightLeg1, 0F, 0F, 0F);
      RightLeg1.mirror = true;
        FootR1 = new ModelRenderer(this, 12, 51);
        FootR1.addBox(-1F, 0F, -1F, 2, 1, 2);
        FootR1.setRotationPoint(7F, 2F, 0F);
        FootR1.setTextureSize(128, 128);
        FootR1.mirror = true;
        setRotation(FootR1, 0F, 0F, 0F);
        BottemLegR1 = new ModelRenderer(this, 4, 43);
        BottemLegR1.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
        BottemLegR1.setRotationPoint(4F, -3F, 0F);
        BottemLegR1.setTextureSize(128, 128);
        BottemLegR1.mirror = true;
        setRotation(BottemLegR1, 0F, 0F, -0.4089656F);
        JointR1 = new ModelRenderer(this, 4, 50);
        JointR1.addBox(-1F, 0F, -1F, 2, 2, 2);
        JointR1.setRotationPoint(0F, 0F, 0F);
        JointR1.setTextureSize(128, 128);
        JointR1.mirror = true;
        setRotation(JointR1, 0F, 0F, -2.082003F);
        TopLegR1 = new ModelRenderer(this, 0, 45);
        TopLegR1.addBox(-0.5F, 0F, -0.5F, 1, 5, 1);
        TopLegR1.setRotationPoint(0F, -0.1F, 0F);
        TopLegR1.setTextureSize(128, 128);
        TopLegR1.mirror = true;
        setRotation(TopLegR1, 0F, 0F, -2.082003F);
        
        RightLeg1.addChild(JointR1);
        RightLeg1.addChild(TopLegR1);
        RightLeg1.addChild(BottemLegR1);
        RightLeg1.addChild(FootR1);
        
      RightLeg2 = new ModelRenderer(this, "RightLeg2");
      RightLeg2.setRotationPoint(4F, 21F, 4F);
      setRotation(RightLeg2, 0F, 0F, 0F);
      RightLeg2.mirror = true;
        TopLegR2 = new ModelRenderer(this, 0, 45);
        TopLegR2.addBox(-0.5F, 0F, -0.5F, 1, 5, 1);
        TopLegR2.setRotationPoint(0F, -0.1F, 0F);
        TopLegR2.setTextureSize(128, 128);
        TopLegR2.mirror = true;
        setRotation(TopLegR2, 0F, 0F, -2.082003F);
        JointR2 = new ModelRenderer(this, 4, 50);
        JointR2.addBox(-1F, 0F, -1F, 2, 2, 2);
        JointR2.setRotationPoint(0F, 0F, 0F);
        JointR2.setTextureSize(128, 128);
        JointR2.mirror = true;
        setRotation(JointR2, 0F, 0F, -2.082003F);
        BottemLegR2 = new ModelRenderer(this, 4, 43);
        BottemLegR2.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
        BottemLegR2.setRotationPoint(4F, -3F, 0F);
        BottemLegR2.setTextureSize(128, 128);
        BottemLegR2.mirror = true;
        setRotation(BottemLegR2, 0F, 0F, -0.4089656F);
        FootR2 = new ModelRenderer(this, 12, 51);
        FootR2.addBox(-1F, 0F, -1F, 2, 1, 2);
        FootR2.setRotationPoint(7F, 2F, 0F);
        FootR2.setTextureSize(128, 128);
        FootR2.mirror = true;
        setRotation(FootR2, 0F, 0F, 0F);
        
        RightLeg2.addChild(JointR2);
        RightLeg2.addChild(TopLegR2);
        RightLeg2.addChild(BottemLegR2);
        RightLeg2.addChild(FootR2);
        
        LeftClawBottom = new ModelRenderer(this, 0, 15);
        LeftClawBottom.addBox(-2.5F, 0F, 0F, 5, 2, 5);
        LeftClawBottom.setRotationPoint(-9F, 12.2F, 2F);
        LeftClawBottom.setTextureSize(128, 128);
        LeftClawBottom.mirror = true;
        setRotation(LeftClawBottom, -0.2974289F, 0F, 0F);
        LeftClawTop2 = new ModelRenderer(this, 0, 22);
        LeftClawTop2.addBox(-3F, -2F, -2F, 6, 2, 4);
        LeftClawTop2.setRotationPoint(-9F, 11.4F, 6.5F);
        LeftClawTop2.setTextureSize(128, 128);
        LeftClawTop2.mirror = true;
        setRotation(LeftClawTop2, -0.9294653F, 0F, 0F);
        LeftArm = new ModelRenderer(this, 20, 45);
        LeftArm.addBox(-0.5F, 0F, -0.5F, 1, 5, 1);
        LeftArm.setRotationPoint(-4F, 19F, 1F);
        LeftArm.setTextureSize(128, 128);
        LeftArm.mirror = true;
        setRotation(LeftArm, 0.2230717F, 0F, 2.305074F);
        LeftArm1 = new ModelRenderer(this, 24, 45);
        LeftArm1.addBox(-0.5F, 0F, -0.5F, 1, 5, 1);
        LeftArm1.setRotationPoint(-7F, 16.5F, 1.8F);
        LeftArm1.setTextureSize(128, 128);
        LeftArm1.mirror = true;
        setRotation(LeftArm1, 0.2230705F, 0F, 2.67686F);
        LeftClawTop = new ModelRenderer(this, 0, 22);
        LeftClawTop.addBox(-3F, -4F, 0F, 6, 4, 7);
        LeftClawTop.setRotationPoint(-9F, 14.2F, 1F);
        LeftClawTop.setTextureSize(128, 128);
        LeftClawTop.mirror = true;
        setRotation(LeftClawTop, 0.2602503F, 0F, 0F);
        
        Kingler.addChild(LeftClawBottom);
        Kingler.addChild(LeftClawTop2);
        Kingler.addChild(LeftArm);
        Kingler.addChild(LeftArm1);
        Kingler.addChild(LeftClawTop);
        Kingler.addChild(EyeR);
        Kingler.addChild(Hair1);
        Kingler.addChild(EyeL);
        Kingler.addChild(Hair2);
        Kingler.addChild(Hair3);
        Kingler.addChild(Hair4);
        Kingler.addChild(Hair5);
        Kingler.addChild(ToothL);
        Kingler.addChild(Hair6);
        Kingler.addChild(ToothR);
        Kingler.addChild(bottomJaw);
        Kingler.addChild(TopJaw);
        Kingler.addChild(RightArm);
        Kingler.addChild(RightClawBottom);
        Kingler.addChild(RightClawTop2);
        Kingler.addChild(RightArm1);
        Kingler.addChild(RightClawTop);
        Kingler.addChild(RightLeg1);
        Kingler.addChild(RightLeg2);
        Kingler.addChild(LeftLeg1);
        Kingler.addChild(LeftLeg2);
    }
    
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.render(entity, f, f1, f2, f3, f4, f5);
      setRotationAngles(f, f1, f2, f3, f4, f5);
      Kingler.render(f5);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.setRotationAngles(f, f1, f2, f3, f4, f5);
      Kingler.rotateAngleY=1.57079633F;
  	RightLeg1.rotateAngleZ = MathHelper.cos(f * 1.6F) * 1F * f1;
  	LeftLeg1.rotateAngleZ = MathHelper.cos(f * 1.6F + 3.141593F) * 1F * f1;
  	RightLeg2.rotateAngleZ = MathHelper.cos(f * 1.6F + 3.141593F) * 1F * f1;
  	LeftLeg2.rotateAngleZ = MathHelper.cos(f * 1.6F) * 1F * f1;
    }

  }
