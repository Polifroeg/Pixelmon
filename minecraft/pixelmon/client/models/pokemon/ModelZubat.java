// Date: 2/13/2013 2:48:05 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import java.util.Random;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.bird.EnumWing;
import pixelmon.client.models.animations.bird.ModuleWing;
import pixelmon.client.models.animations.bird.SkeletonBird;

public class ModelZubat extends PixelmonModelBase {
	// fields
	PixelmonModelRenderer Torso;
	PixelmonModelRenderer Face;
	PixelmonModelRenderer Left_Ear1;
	PixelmonModelRenderer Right_Ear1;
	PixelmonModelRenderer Right_Leg;
	PixelmonModelRenderer Left_Leg;
	PixelmonModelRenderer WingR1;
	PixelmonModelRenderer WingR2;
	PixelmonModelRenderer WingR3;
	PixelmonModelRenderer WingRMid;
	PixelmonModelRenderer WebbingR1;
	PixelmonModelRenderer WebbingR2;
	PixelmonModelRenderer WingL1;
	PixelmonModelRenderer WingL2;
	PixelmonModelRenderer WingL3;
	PixelmonModelRenderer WingLMid;
	PixelmonModelRenderer WebbingL1;
	PixelmonModelRenderer WebbingL2;
	PixelmonModelRenderer Body;
	PixelmonModelRenderer RightWing;
	PixelmonModelRenderer LeftWing;
	PixelmonModelRenderer LeftLeg;
	PixelmonModelRenderer RightLeg;

	public ModelZubat() {
		textureWidth = 64;
		textureHeight = 32;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(-0.5F, 3, 3F);
		Torso = new PixelmonModelRenderer(this, 22, 24);
		Torso.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 5);
		Torso.setTextureSize(64, 32);
		Torso.mirror = true;
		setRotation(Torso, -0.8551081F, 0F, 0F);
		Body.addChild(Torso);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0, 0, 0F);
		Face = new PixelmonModelRenderer(this, 0, 5);
		Face.addBox(-1.5F, -3F, -3F, 3, 3, 3);
		Face.setTextureSize(64, 32);
		Face.mirror = true;
		setRotation(Face, 0F, 0F, 0F);
		Head.addChild(Face);
		Left_Ear1 = new PixelmonModelRenderer(this, 45, 9);
		Left_Ear1.addBox(0F, 0F, 0F, 2, 3, 1);
		Left_Ear1.setRotationPoint(3.5F, -4F, -1F);
		Left_Ear1.setTextureSize(64, 32);
		Left_Ear1.mirror = true;
		setRotation(Left_Ear1, 0F, 3.141593F, -0.6889403F);
		Head.addChild(Left_Ear1);
		Right_Ear1 = new PixelmonModelRenderer(this, 49, 9);
		Right_Ear1.addBox(0F, 0F, 0F, 2, 3, 1);
		Right_Ear1.setRotationPoint(-3.5F, -4F, -1F);
		Right_Ear1.setTextureSize(64, 32);
		Right_Ear1.mirror = true;
		setRotation(Right_Ear1, 0F, 0F, -0.6889403F);
		Head.addChild(Right_Ear1);
		Body.addChild(Head);

		PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this,
				"Right leg");
		RightLeg.setRotationPoint(-0.5F, 2, 1);
		Right_Leg = new PixelmonModelRenderer(this, 6, 17);
		Right_Leg.addBox(-1F, 0F, 0F, 1, 5, 1);
		Right_Leg.setTextureSize(64, 32);
		Right_Leg.mirror = true;
		setRotation(Right_Leg, 0.5576792F, -0.1487144F, 0F);
		RightLeg.addChild(Right_Leg);
		Body.addChild(RightLeg);

		PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this,
				"Left Leg");
		LeftLeg.setRotationPoint(0.5F, 2, 1);
		Left_Leg = new PixelmonModelRenderer(this, 8, 16);
		Left_Leg.addBox(0F, 0F, 0F, 1, 5, 1);
		Left_Leg.setTextureSize(64, 32);
		Left_Leg.mirror = true;
		setRotation(Left_Leg, 0.5576792F, 0.1464424F, 0F);
		LeftLeg.addChild(Left_Leg);
		Body.addChild(LeftLeg);

		RightWing = new PixelmonModelRenderer(this, "Right Wing");
		RightWing.setRotationPoint(-0.5F, 0, 0.5F);
		WingR1 = new PixelmonModelRenderer(this, 15, 0);
		WingR1.addBox(0F, 0F, -0.5F, 1, 8, 1);
		WingR1.setTextureSize(64, 32);
		WingR1.mirror = true;
		setRotation(WingR1, 0F, 0F, 2.639681F);
		RightWing.addChild(WingR1);
		WingR2 = new PixelmonModelRenderer(this, 16, 0);
		WingR2.addBox(0F, 0F, -0.5F, 1, 3, 1);
		WingR2.setRotationPoint(-4F, -7F, 0F);
		WingR2.setTextureSize(64, 32);
		WingR2.mirror = true;
		setRotation(WingR2, 0F, 0F, 1.041001F);
		RightWing.addChild(WingR2);
		WingR3 = new PixelmonModelRenderer(this, 16, 4);
		WingR3.addBox(0F, 0F, -0.5F, 1, 7, 1);
		WingR3.setRotationPoint(-6F, -6F, 0F);
		WingR3.setTextureSize(64, 32);
		WingR3.mirror = true;
		setRotation(WingR3, 0F, 0F, 0.7807508F);
		RightWing.addChild(WingR3);
		WingRMid = new PixelmonModelRenderer(this, 15, 0);
		WingRMid.addBox(0F, 0F, -0.5F, 1, 7, 1);
		WingRMid.setRotationPoint(-5F, -6F, 0F);
		WingRMid.setTextureSize(64, 32);
		WingRMid.mirror = true;
		setRotation(WingRMid, 0F, 0F, 0.1858931F);
		RightWing.addChild(WingRMid);
		WebbingR1 = new PixelmonModelRenderer(this, 27, 11);
		WebbingR1.addBox(0F, 0F, -0.5F, 5, 5, 0);
		WebbingR1.setRotationPoint(-4F, -6F, 0.5F);
		WebbingR1.setTextureSize(64, 32);
		WebbingR1.mirror = true;
		setRotation(WebbingR1, 0F, 0F, 0.9666439F);
		RightWing.addChild(WebbingR1);
		WebbingR2 = new PixelmonModelRenderer(this, 27, 15);
		WebbingR2.addBox(0F, 0F, -0.5F, 4, 3, 0);
		WebbingR2.setRotationPoint(-8F, -4F, 0.5F);
		WebbingR2.setTextureSize(64, 32);
		WebbingR2.mirror = true;
		setRotation(WebbingR2, 0F, 0F, 0.5576792F);
		RightWing.addChild(WebbingR2);
		Body.addChild(RightWing);

		LeftWing = new PixelmonModelRenderer(this, "Left Wing");
		LeftWing.setRotationPoint(0.5F, 0, 0.5F);
		WingL1 = new PixelmonModelRenderer(this, 16, 0);
		WingL1.addBox(-1F, 0F, -0.5F, 1, 8, 1);
		WingL1.setTextureSize(64, 32);
		WingL1.mirror = true;
		setRotation(WingL1, 0F, 0F, -2.639681F);
		LeftWing.addChild(WingL1);
		WingL2 = new PixelmonModelRenderer(this, 21, 0);
		WingL2.addBox(-1F, 0F, -1F, 1, 3, 1);
		WingL2.setRotationPoint(4F, -7F, 0.5F);
		WingL2.setTextureSize(64, 32);
		WingL2.mirror = true;
		setRotation(WingL2, 0F, 0F, -1.041001F);
		LeftWing.addChild(WingL2);
		WingL3 = new PixelmonModelRenderer(this, 10, 23);
		WingL3.addBox(-1F, 0F, -1F, 1, 7, 1);
		WingL3.setRotationPoint(6F, -6F, 0.5F);
		WingL3.setTextureSize(64, 32);
		WingL3.mirror = true;
		setRotation(WingL3, 0F, 0F, -0.7807508F);
		LeftWing.addChild(WingL3);
		WingLMid = new PixelmonModelRenderer(this, 17, 0);
		WingLMid.addBox(-1F, 0F, -1F, 1, 7, 1);
		WingLMid.setRotationPoint(5F, -6F, 0.5F);
		WingLMid.setTextureSize(64, 32);
		WingLMid.mirror = true;
		setRotation(WingLMid, 0F, 0, -0.1858931F);
		LeftWing.addChild(WingLMid);
		WebbingL1 = new PixelmonModelRenderer(this, 28, 15);
		WebbingL1.addBox(0F, 0F, 0F, 5, 5, 0);
		WebbingL1.setRotationPoint(4F, -6F, 0F);
		WebbingL1.setTextureSize(64, 32);
		WebbingL1.mirror = true;
		setRotation(WebbingL1, 0F, 0F, 0.5576792F);
		LeftWing.addChild(WebbingL1);
		WebbingL2 = new PixelmonModelRenderer(this, 27, 16);
		WebbingL2.addBox(0F, 0F, 0F, 4, 3, 0);
		WebbingL2.setRotationPoint(4F, -2F, 0F);
		WebbingL2.setTextureSize(64, 32);
		WebbingL2.mirror = true;
		setRotation(WebbingL2, 0F, 0F, -0.6320364F);
		LeftWing.addChild(WebbingL2);
		Body.addChild(LeftWing);

		ModuleHead headModule = new ModuleHead(Head);
		ModuleWing rightWingModule = new ModuleWing(RightWing, EnumWing.Right,
				0, 0.25F, 1.3F);
		ModuleWing leftWingModule = new ModuleWing(LeftWing, EnumWing.Left,
				0, 0.25F, 1.3F);

		skeleton = new SkeletonBird(Body, headModule, leftWingModule,
				rightWingModule, LeftLeg, RightLeg);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(entity, f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	Random randomGenerator = new Random();
	int[] count = { 0, 0 };
	boolean[] Headisrotating = { false, false, false, false, false, false,
			false };

	public void setRotationAngles(Entity entity, float f, float f1, float f2,
			float f3, float f4, float f5) {

		this.Body.rotateAngleX = ((float) Math.PI / 4F) - 0.25F;
		this.Body.rotateAngleY = 0.0F;
		// this.RightWing.rotateAngleY = MathHelper.cos(f2 * 1.3F) *
		// (float)Math.PI * 0.25F;
		// this.LeftWing.rotateAngleY = -this.RightWing.rotateAngleY;

	}
}
